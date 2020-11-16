package com.tcs.employeeapplication.service;

import java.util.List;
import java.util.Optional;

import com.tcs.employeeapplication.dao.DepartmentDAO;
import com.tcs.employeeapplication.dao.DepartmentDAOImpl;
import com.tcs.employeeapplication.model.Department;
import com.tcs.employeeapplication.model.Employee;

public class DepartmentServiceImpl implements DepartmentService {

	public DepartmentServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	private static DepartmentService dao;
	
	public static DepartmentService getInstance()
	{
		if(dao == null)
		{
			dao = new DepartmentServiceImpl();
			return dao;
		}
		else
			return dao;
	}
	private static DepartmentDAO deptDao = DepartmentDAOImpl.getInstance();
	@Override
	public String addDepartment(Department department) {
		// TODO Auto-generated method stub
		return deptDao.addDepartment(department);
	}

	@Override
	public String updateDepartment(Department department) {
		// TODO Auto-generated method stub
		return deptDao.updateDepartment(department);
	}

	@Override
	public String deleteDepartment(long id) {
		// TODO Auto-generated method stub
		return deptDao.deleteDepartment(id);
	}

	@Override
	public Optional<Department> findById(long id) {
		// TODO Auto-generated method stub
		return deptDao.findById(id);
	}

	@Override
	public Optional<List<Department>> getDepartments() {
		// TODO Auto-generated method stub
		return deptDao.getDepartments();
	}

	@Override
	public Optional<List<Employee>> findEmployeesByDepartmentId(long id) {
		// TODO Auto-generated method stub
		return deptDao.findEmployeesByDepartmentId(id);
	}

}
