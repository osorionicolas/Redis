package com.nosorio.redis.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nosorio.redis.models.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, String> {
	
}

