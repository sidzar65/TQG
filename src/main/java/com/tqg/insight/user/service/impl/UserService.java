package com.tqg.insight.user.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tqg.insight.base.security.dto.SignUpRequest;
import com.tqg.insight.role.model.Role;
import com.tqg.insight.role.repository.RoleRepository;
import com.tqg.insight.user.model.User;
import com.tqg.insight.user.repository.UserRepository;
import com.tqg.insight.user.service.IUserService;

/**
 * Service layer of {@link User}
 * 
 * @author 
 *
 */

@Service
public class UserService implements IUserService {

	private UserRepository userRepository;
	private ApplicationContext applicationContext;
	private PasswordEncoder passwordEncoder;
	private RoleRepository roleRepository;


	public UserService(UserRepository userRepository, ApplicationContext applicationContext,
			PasswordEncoder passwordEncoder, RoleRepository roleRepository) {
		this.userRepository = userRepository;
		this.applicationContext = applicationContext;
		this.passwordEncoder = passwordEncoder;
		this.roleRepository = roleRepository;
	}
	
	@Override
	@Transactional
	public void signUp(SignUpRequest signUpRequest) {
		User user = new User();
		user.setEmail(signUpRequest.getEmail());
		user.setPassword(this.passwordEncoder.encode(signUpRequest.getPassword()));
		Optional<List<Role>> roles = this.roleRepository.findByNameIn(signUpRequest.getRoles());
		if (roles.isPresent()) {
			roles.get().forEach(user::addRole);
			
			user.setRoles(roles.get().stream().collect(Collectors.toSet()));
		}
		this.userRepository.save(user);
	}
}
