package com.tqg.insight.base.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.BeanIds;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.tqg.insight.base.security.JwtAuthenticationEntryPoint;
import com.tqg.insight.base.security.filter.JwtAuthenticationFilter;
import com.tqg.insight.base.security.service.CustomUserDetailsService;
import com.tqg.insight.base.security.utility.JwtTokenProvider;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true, jsr250Enabled = true, prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	private CustomUserDetailsService customUserDetailsService;
	private JwtAuthenticationEntryPoint unauthorizedHandler;
	private JwtTokenProvider tokenProvider;

	

	public SecurityConfig(CustomUserDetailsService customUserDetailsService,
			JwtAuthenticationEntryPoint unauthorizedHandler, JwtTokenProvider tokenProvider) {
		super();
		this.customUserDetailsService = customUserDetailsService;
		this.unauthorizedHandler = unauthorizedHandler;
		this.tokenProvider = tokenProvider;
	}

	@Bean
	public JwtAuthenticationFilter jwtAuthenticationFilter() {
		return new JwtAuthenticationFilter(this.tokenProvider, this.customUserDetailsService);
	}

	@Override
	public void configure(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
		authenticationManagerBuilder.userDetailsService(customUserDetailsService).passwordEncoder(passwordEncoder());
	}

	@Bean(BeanIds.AUTHENTICATION_MANAGER)
	@Override
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.cors().and().csrf().disable().exceptionHandling().authenticationEntryPoint(unauthorizedHandler).and()
				.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and().authorizeRequests()
				.antMatchers("/api/v1/auth/signup", "/api/v1/auth/signin").permitAll().anyRequest().authenticated();

		// Add our custom JWT security filter
		http.addFilterBefore(jwtAuthenticationFilter(), UsernamePasswordAuthenticationFilter.class);

	}
}