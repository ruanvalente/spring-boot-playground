package com.example.student.studentrestspring.repository;

import com.example.student.studentrestspring.entity.People;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleRepository extends JpaRepository<People, Long> {
}
