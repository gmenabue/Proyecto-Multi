/**
 * 
 */
package jdbc.clase.DAO;

import interfaces.Recuperable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jdbc.clase.DTO.EmployeeDTO;


/**
 * @author alumno
 *
 */
public class EmployeesJDBCDAO implements Recuperable{
	
	
private static EmployeeDTO componerObjeto(ResultSet rset) throws SQLException {
		
		EmployeeDTO empleado = null;
		
		
	    	int EMPLOYEE_ID = rset.getInt(1);
	    	String FIRST_NAME = rset.getString(2);
	    	String LAST_NAME = rset.getString(3);
	    	String EMAIL = rset.getString(4);
	    	String PHONE_NUMBER = rset.getString(5);
	    	String HIRE_DATE = rset.getString(6);
	    	String JOB_ID = rset.getString(7);
	    	int SALARY = rset.getInt(8);
	    	int COMISSION_PCT = rset.getInt(9);
	    	int MANAGER_ID = rset.getInt(10);
	    	int DEPARTMENT_ID = rset.getInt(11);
	    	
	    	empleado = new EmployeeDTO(EMPLOYEE_ID, FIRST_NAME, LAST_NAME, EMAIL, PHONE_NUMBER, HIRE_DATE, JOB_ID, SALARY, COMISSION_PCT, MANAGER_ID, DEPARTMENT_ID);
	    	
	    	
		 return empleado;
	}

@Override
public Object read(Object id) {

	Object empleado1 = null;
	Statement stmt = null;
	Connection conexion = null;
	ResultSet rset = null;



try {
	//registro el driver, en realidad, hago que se ejecuten unas pocas líneas de la clase OracleDriver
	Class.forName("oracle.jdbc.driver.OracleDriver");
	//DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());// método equivalente al anterior
	//Sea como sea, es, <<oye, si te piden una conexión, se la pides a esa clase!>>
	conexion = DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "HR", "GIOR1987");
	
	stmt = conexion.createStatement(); 
	PreparedStatement pstmt = conexion.prepareStatement("select * from employees WHERE EMPLOYEE_ID = ?");     
	pstmt.setInt(1, (int) id);	
	rset = pstmt.executeQuery();
	while (rset.next())
	{

		empleado1 = componerObjeto(rset);
		

	}
	}
catch (ClassNotFoundException | SQLException e)
	{
	
	// TODO Auto-generated catch block
	e.printStackTrace();
	}

finally
{
	try {
		conexion.close();
		rset.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
	

	
	return empleado1;
}
}




