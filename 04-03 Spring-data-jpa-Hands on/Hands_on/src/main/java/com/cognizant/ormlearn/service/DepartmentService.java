package com.cognizant.ormlearn.service;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ormlearn.OrmLearnApplication;
import com.cognizant.ormlearn.model.Department;
import com.cognizant.ormlearn.repository.DepartmentRepository;


@Service
public class DepartmentService {
	@Autowired
	DepartmentRepository departmentRepository;
	
	@Transactional
	public Department get(int id) {
		return departmentRepository.findById(id).get();
	}
	
	@Transactional
	public void save(Department department) {
		departmentRepository.save(department);
	}
}
