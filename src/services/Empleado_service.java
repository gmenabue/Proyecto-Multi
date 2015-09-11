/**
 * 
 */
package services;

import jdbc.clase.DAO.EmployeesJDBCDAO;
import jpa.clase.DAO.EmployeesJPADAO;
import hibernate.clase.DAO.EmployeesHibernateDAO;
import hibernate.clase.DAO.SuperDAO;
import hibernate.clase.DTO.Employees;
import interfaces.Recuperable;

import org.hibernate.Transaction;

import sessionManager.SessionManager;



/**
 * @author Giordano Menabue
 *
 */
public class Empleado_service {
	Recuperable empleadoDAO = null;
	
	

	/**
	 * Constructor de la clase Empleado Service.
	 */
	public Empleado_service(){
		empleadoDAO = new EmployeesHibernateDAO();
		empleadoDAO = new EmployeesJDBCDAO();
		empleadoDAO = new EmployeesJPADAO();
	}

	/**
	 * @param empleadoDAO the empleadoDAO to set
	 */
	public void setEmpleadoDAO(Recuperable empleadoDAO) {
		this.empleadoDAO = empleadoDAO;
	}
	
	public Object leer_empleado (int id){
		Object empleado;
		empleado = this.empleadoDAO.read(id);
		return empleado;
	}
	
}
