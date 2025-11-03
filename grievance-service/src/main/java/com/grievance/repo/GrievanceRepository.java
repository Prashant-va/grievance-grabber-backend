package com.grievance.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grievance.model.Grievance;

public interface GrievanceRepository extends JpaRepository<Grievance, Long> {
}
