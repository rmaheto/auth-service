package com.coemaniac.authservice.repository;

import com.coemaniac.authservice.entity.ERole;
import com.coemaniac.authservice.entity.Role;
import com.coemaniac.authservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
