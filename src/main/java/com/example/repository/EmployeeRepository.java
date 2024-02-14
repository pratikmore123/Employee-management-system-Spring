package com.example.repository;

import com.example.model.Employee;
import org.springframework.data.couchbase.repository.CouchbaseRepository;

public interface EmployeeRepository extends CouchbaseRepository<Employee, String> {
	
}
