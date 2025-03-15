package com.mph.demosprboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mph.demosprboot.entity.SEmployee;
import com.mph.demosprboot.repository.SEmployeeRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class SEmployeeServiceImpl implements SEmployeeService{
	
	@Autowired
	SEmployeeRepository sEmployeeRepository;

	@Override
	public void createEmployee(SEmployee employee) {
		sEmployeeRepository.save(employee);
		
	}

	@Override
	public List<SEmployee> getAllEmployee() {
		
		return sEmployeeRepository.findAll();
	}

	@Override
	public List<SEmployee> updateEmployee(SEmployee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SEmployee> deleteEmployee(long eid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<SEmployee> getEmployee(long eid) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public SEmployee getEmployeeByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}


}
