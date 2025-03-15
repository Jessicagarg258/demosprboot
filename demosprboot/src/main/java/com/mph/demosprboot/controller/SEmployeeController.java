package com.mph.demosprboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mph.demosprboot.entity.SEmployee;
import com.mph.demosprboot.service.SEmployeeService;

@RestController
@RequestMapping("/semployee")
public class SEmployeeController {

	@Autowired
	SEmployeeService sEmployeeService;

	@PostMapping("/addemp")
	public ResponseEntity<?> addEmployee(@RequestBody SEmployee employee) {
		sEmployeeService.createEmployee(employee);
		return new ResponseEntity<>(employee,HttpStatus.CREATED);

	}

	@GetMapping("/listallemp")
	public ResponseEntity<List<SEmployee>> getAllEmployee() {
		List<SEmployee> emplist=sEmployeeService.getAllEmployee();
		return ResponseEntity.ok(emplist);
	}

	//@PutMapping("/")
	public ResponseEntity<List<SEmployee>> updateEmployee(SEmployee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	//@DeleteMapping("/")
	public ResponseEntity<List<SEmployee>> deleteEmployee(long eid) {
		// TODO Auto-generated method stub
		return null;
	}

	//@GetMapping("/")
	public ResponseEntity<Optional<SEmployee>> getEmployee(long eid) {
		// TODO Auto-generated method stub
		return null;
	}

	//@GetMapping("/")
	public ResponseEntity<SEmployee> getEmployeeByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
