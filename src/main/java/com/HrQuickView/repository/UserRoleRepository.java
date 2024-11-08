package com.HrQuickView.repository;

import com.HrQuickView.model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRole,Long> {

    List<UserRole> findAll();

    List<UserRole> findAllByShowInWebsite(boolean showInWebsite);

    UserRole findByName(String roleName);
}
