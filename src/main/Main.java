/**
 * 
 */
package main;

import hibernate.clase.DAO.EmployeesHibernateDAO;
import hibernate.clase.DTO.Employees;
import interfaces.Recuperable;

import java.sql.SQLException;

import services.Empleado_service;
import sessionManager.SessionManager;

import jdbc.clase.DAO.EmployeesJDBCDAO;
import jdbc.clase.DTO.EmployeeDTO;
import jpa.clase.DAO.EmployeesJPADAO;
import jpa.clase.DTO.Employee;

/**
 * @author alumno
 *
 */
public class Main {

	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		
		Empleado_service es = new Empleado_service();
		
		// Para leer un empleado por JDBC
		Recuperable empleadoJDBC_DAO = new EmployeesJDBCDAO();
		es.setEmpleadoDAO(empleadoJDBC_DAO);
		EmployeeDTO empleado1DTO = new EmployeeDTO();
		empleado1DTO = (EmployeeDTO) es.leer_empleado(100);
		System.out.println(empleado1DTO.toString());
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("----------------------------------------------------------------------------");
		
		
		//Para leer un empleado con Hibernate
		Recuperable empleadoHibernate_DAO  = new EmployeesHibernateDAO();
		es.setEmpleadoDAO(empleadoHibernate_DAO);
		Employees empleado3DTO = new Employees();
		empleado3DTO = (Employees) es.leer_empleado(100);
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("----------------------------------------------------------------------------");
		SessionManager.cerrar_session_factory();
		
		
		//Para leer un empleado con JPA
		Recuperable empleadoDaoJPA = new EmployeesJPADAO();
		es.setEmpleadoDAO(empleadoDaoJPA);
		Employee empleado2DTO = new Employee();
		empleado2DTO = (Employee) es.leer_empleado(100);
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("----------------------------------------------------------------------------");
	}

}
