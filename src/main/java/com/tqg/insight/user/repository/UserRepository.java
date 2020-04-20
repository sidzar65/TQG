/**
 * 
 */
package com.tqg.insight.user.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.tqg.insight.user.model.User;

/**
 * Represent DAO layer of {@link User}
 * 
 * @author Salman.Khandu
 *
 */
public interface UserRepository extends JpaRepository<User, Long>, JpaSpecificationExecutor<User> {

	Optional<User> findByEmail(String email);
}
