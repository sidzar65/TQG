package com.tqg.insight.role.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.tqg.insight.user.model.User;

@Entity(name = "Role")
@Table(name = "T_ROLE")
public class Role implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "name", unique = true)
	private String name;

	@ManyToMany(mappedBy = "roles")
	private Set<User> users = new HashSet<>();

	public Role() {
		// TODO Auto-generated constructor stub
	}

	public Role(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	public void addUser(User user) {
		this.getUsers().add(user);
		user.getRoles().add(this);
	}

}
