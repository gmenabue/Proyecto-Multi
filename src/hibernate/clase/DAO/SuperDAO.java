/**
 * 
 */
package hibernate.clase.DAO;

import org.hibernate.Session;

/**
 * @author Giordano Menabue
 *
 */
public class SuperDAO {
	
	Session session = null;
	
	public SuperDAO(){
		//constructor
	}

	/**
	 * @return the session
	 */
	public Session getSession() {
		return session;
	}

	/**
	 * @param session the session to set
	 */
	public void setSession(Session session) {
		this.session = session;
	}
	
	

}
