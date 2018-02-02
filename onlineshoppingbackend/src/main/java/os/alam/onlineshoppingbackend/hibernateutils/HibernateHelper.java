package os.alam.onlineshoppingbackend.hibernateutils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


public class HibernateHelper {
	
	static SessionFactory factory ;
	private static StandardServiceRegistry registry;
	
	static {
		        // Create registry
		    	   try {
					Configuration  configuration = new Configuration();
		    	    configuration.configure();
		    	    registry = new StandardServiceRegistryBuilder().applySettings(
		    	            configuration.getProperties()).build();
		    	    factory = configuration.buildSessionFactory(registry);
		    	   }catch(Exception e) {
		    		   e.printStackTrace();
		    	   }
	}
	
	public static Session getSession() {
		return factory.openSession();
	}
	
	
	

}
