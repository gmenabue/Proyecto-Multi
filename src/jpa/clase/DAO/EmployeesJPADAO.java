package jpa.clase.DAO;

import interfaces.Recuperable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import jpa.clase.DTO.Employee;

public class EmployeesJPADAO implements Recuperable{
    public EmployeesJPADAO() 
    {
    }


	@Override
	public Object read(Object id) {
		Long id_empleado = new Long((int)id);
		//long empId = 190;  // emp 190 - Timothy Gates
        Employee empleadoDTO = null;
        EntityManagerFactory emf =
        Persistence.createEntityManagerFactory("UnidadPersonas");
        EntityManager em = emf.createEntityManager();
        try {
        em.getTransaction().begin();
        empleadoDTO = em.find(Employee.class, id_empleado);
        System.out.println(empleadoDTO.toString());
        //em.persist(yo);
        em.getTransaction().commit();
        } 
        catch (Exception e) {
        
        e.printStackTrace();
        em.getTransaction().rollback();
         }
        
        finally {
        em.close();
        System.exit(0);//no sé pporqué no acaba sólo...parace que se queda conlgando si no le pongo esto
        }
		return empleadoDTO;
	}
}
