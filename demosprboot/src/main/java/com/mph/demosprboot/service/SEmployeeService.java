package com.mph.demosprboot.service;

import java.util.List;
import java.util.Optional;

import com.mph.demosprboot.entity.SEmployee;


public interface SEmployeeService {
	public void createEmployee(SEmployee employee);
	public List<SEmployee> getAllEmployee() ;
	public List<SEmployee> updateEmployee(SEmployee employee);
	public List<SEmployee> deleteEmployee(long eid);
	public Optional<SEmployee> getEmployeeById(long eid);
	public SEmployee getEmployeeByEname(String ename);
}
