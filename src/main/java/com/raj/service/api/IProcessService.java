/**
 * 
 */
package com.raj.service.api;

import java.util.List;

import com.raj.model.Emp;

/**
 * @author Rajendar Kumar
 *
 */
public interface IProcessService {
	/**
	 * <p>Method will return the {@link Emp} with given employee id.<p>
	 * @param empId
	 * @return The employee for given employee id.
	 */
	public Emp getEmp(String empId);
	/**
	 * <p>Method will return all the {@link Emp}.<p>
	 * @return All the employees.
	 */
	public List<Emp> getEmployees();
}
