package sessionManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class SessionManager {
	
	private SessionManager(){
		//Constructor privado de la clase SessionManager
		//para usar Singleton
	}
	
	
	static {
		
		Configuration configuration = new Configuration().configure();
    	StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
    	nueva_session_factory = configuration.buildSessionFactory(builder.build());
		
	}
	
	
	
	private static SessionFactory nueva_session_factory;
	
	public static Session session = nueva_session_factory.openSession();
/**
 * Método para obtener el objeto de SessionFactory
 * @return Objeto de SessionFactory
 */
	public static Session obtener_session(){
		
		return session;
		
	}
	
	public static Session obtenerSesionNueva ()
	{
		return nueva_session_factory.openSession();
	}
	
	public static void cerrar_session(Session session){
		session.close();
	}
	
	
	public static void cerrar_session_factory(){
		nueva_session_factory.close();
	}
	
}
