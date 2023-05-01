/**
 * 
 */
package com.example.EmployeesecurityJwt.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EmployeesecurityJwt.entity.User;

/**
 * @author Administrator
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User,Integer>{

	User findByUsername(String username);

}
