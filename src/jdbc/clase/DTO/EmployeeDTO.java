/**
 * 
 */
package jdbc.clase.DTO;

/**
 * @author alumno
 *
 */
public class EmployeeDTO {
	
	
	
	int EMPLOYEE_ID = 0;
	String FIRST_NAME = null;
	String LAST_NAME = null;
	String EMAIL = null;
	String PHONE_NUMBER = null;
	String HIRE_DATE = null;
	String JOB_ID = null;
	int SALARY = 0;
	int COMISSION_PCT = 0;
	int MANAGER_ID = 0;
	int DEPARTMENT_ID = 0;
	
	public EmployeeDTO() {
		
	}
	

	public EmployeeDTO(int employee_id, String first_name, String last_name,
			String email, String phone_number, String hire_date, String job_id,
			int salary, int comission_pct, int manager_id, int department_id) {
		super();
		this.EMPLOYEE_ID = employee_id;
		this.FIRST_NAME = first_name;
		this.LAST_NAME = last_name;
		this.EMAIL = email;
		this.PHONE_NUMBER = phone_number;
		this.HIRE_DATE = hire_date;
		this.JOB_ID = job_id;
		this.SALARY = salary;
		this.COMISSION_PCT = comission_pct;
		this.MANAGER_ID = manager_id;
		this.DEPARTMENT_ID = department_id;
	}




	/**
	 * @return the eMPLOYEE_ID
	 */
	public int getEMPLOYEE_ID() {
		return EMPLOYEE_ID;
	}




	/**
	 * @param eMPLOYEE_ID the eMPLOYEE_ID to set
	 */
	public void setEMPLOYEE_ID(int eMPLOYEE_ID) {
		EMPLOYEE_ID = eMPLOYEE_ID;
	}




	/**
	 * @return the fIRST_NAME
	 */
	public String getFIRST_NAME() {
		return FIRST_NAME;
	}




	/**
	 * @param fIRST_NAME the fIRST_NAME to set
	 */
	public void setFIRST_NAME(String fIRST_NAME) {
		FIRST_NAME = fIRST_NAME;
	}




	/**
	 * @return the lAST_NAME
	 */
	public String getLAST_NAME() {
		return LAST_NAME;
	}




	/**
	 * @param lAST_NAME the lAST_NAME to set
	 */
	public void setLAST_NAME(String lAST_NAME) {
		LAST_NAME = lAST_NAME;
	}




	/**
	 * @return the eMAIL
	 */
	public String getEMAIL() {
		return EMAIL;
	}




	/**
	 * @param eMAIL the eMAIL to set
	 */
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}




	/**
	 * @return the pHONE_NUMBER
	 */
	public String getPHONE_NUMBER() {
		return PHONE_NUMBER;
	}




	/**
	 * @param pHONE_NUMBER the pHONE_NUMBER to set
	 */
	public void setPHONE_NUMBER(String pHONE_NUMBER) {
		PHONE_NUMBER = pHONE_NUMBER;
	}




	/**
	 * @return the hIRE_DATE
	 */
	public String getHIRE_DATE() {
		return HIRE_DATE;
	}




	/**
	 * @param hIRE_DATE the hIRE_DATE to set
	 */
	public void setHIRE_DATE(String hIRE_DATE) {
		HIRE_DATE = hIRE_DATE;
	}




	/**
	 * @return the jOB_ID
	 */
	public String getJOB_ID() {
		return JOB_ID;
	}




	/**
	 * @param jOB_ID the jOB_ID to set
	 */
	public void setJOB_ID(String jOB_ID) {
		JOB_ID = jOB_ID;
	}




	/**
	 * @return the sALARY
	 */
	public int getSALARY() {
		return SALARY;
	}




	/**
	 * @param sALARY the sALARY to set
	 */
	public void setSALARY(int sALARY) {
		SALARY = sALARY;
	}




	/**
	 * @return the cOMISSION_PCT
	 */
	public int getCOMISSION_PCT() {
		return COMISSION_PCT;
	}




	/**
	 * @param cOMISSION_PCT the cOMISSION_PCT to set
	 */
	public void setCOMISSION_PCT(int cOMISSION_PCT) {
		COMISSION_PCT = cOMISSION_PCT;
	}




	/**
	 * @return the mANAGER_ID
	 */
	public int getMANAGER_ID() {
		return MANAGER_ID;
	}




	/**
	 * @param mANAGER_ID the mANAGER_ID to set
	 */
	public void setMANAGER_ID(int mANAGER_ID) {
		MANAGER_ID = mANAGER_ID;
	}




	/**
	 * @return the dEPARTMENT_ID
	 */
	public int getDEPARTMENT_ID() {
		return DEPARTMENT_ID;
	}




	/**
	 * @param dEPARTMENT_ID the dEPARTMENT_ID to set
	 */
	public void setDEPARTMENT_ID(int dEPARTMENT_ID) {
		DEPARTMENT_ID = dEPARTMENT_ID;
	}
	
	
	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Empleado \n ID Empleado = " + EMPLOYEE_ID + "\n Nombre = "
				+ FIRST_NAME + "\n Apellido = " + LAST_NAME + "\n E-Mail = " + EMAIL
				+ "\n Numero Telefono = " + PHONE_NUMBER + "\n Fecha De Contratacion = " + HIRE_DATE
				+ "\n ID Empleo = " + JOB_ID + "\n Salario = " + SALARY
				+ "\n Comision PCT = " + COMISSION_PCT + "\n ID Manager = "
				+ MANAGER_ID + "\n ID Departamento = " + DEPARTMENT_ID 
				+"\n ******************************************************************************\n"
				+" ****************************************************************************** \n";
	}



}
