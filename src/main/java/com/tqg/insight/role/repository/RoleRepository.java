package com.tqg.insight.role.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tqg.insight.role.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

	Optional<List<Role>> findByNameIn(List<String> names);

}
