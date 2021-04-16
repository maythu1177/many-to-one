package com.sp.tech.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sp.tech.model.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department,Integer> {

}
