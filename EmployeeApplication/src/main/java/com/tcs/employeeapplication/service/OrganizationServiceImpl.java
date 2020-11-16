package com.tcs.employeeapplication.service;

import java.util.List;
import java.util.Optional;

import com.tcs.employeeapplication.dao.OrganizationDAO;
import com.tcs.employeeapplication.dao.OrganizationDAOImpl;
import com.tcs.employeeapplication.model.Department;
import com.tcs.employeeapplication.model.Employee;
import com.tcs.employeeapplication.model.Organization;

public class OrganizationServiceImpl implements OrganizationService {
	
	public OrganizationServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	private static OrganizationService dao;
	
	public static OrganizationService getInstance() {
		if(dao==null)
		{
			dao = new OrganizationServiceImpl();
			return dao;
		}
		else
			return dao;
	}
	
	private static OrganizationDAO orgDao = OrganizationDAOImpl.getInstance();
	@Override
	public String addOrganization(Organization organization) {
		// TODO Auto-generated method stub
		return orgDao.addOrganization(organization);
	}

	@Override
	public String updateOrganization(Organization organization) {
		// TODO Auto-generated method stub
		return orgDao.updateOrganization(organization);
	}

	@Override
	public String deleteOrganization(long id) {
		// TODO Auto-generated method stub
		return orgDao.deleteOrganization(id);
	}

	@Override
	public Optional<Organization> findById(long id) {
		// TODO Auto-generated method stub
		return orgDao.findById(id);
	}

	@Override
	public Optional<List<Organization>> getOrganizations() {
		// TODO Auto-generated method stub
		return orgDao.getOrganizations();
	}

	@Override
	public Optional<List<Department>> findDepartmentsByOrganizationId(long id) {
		// TODO Auto-generated method stub
		return orgDao.findDepartmentsByOrganizationId(id);
	}

	@Override
	public Optional<List<Employee>> findEmployeesByOrganizationId(long id) {
		// TODO Auto-generated method stub
		return orgDao.findEmployeesByOrganizationId(id);
	}

}