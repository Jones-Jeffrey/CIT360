package hibernateProgram;

/*basic structure of program taken from a video found in this series:
 * https://www.youtube.com/playlist?list=PLEAQNNR8IlB7fNkRsUgzrR346i-UqE5CG 
 */

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory; 


public class UserDemo {

	public static void main(String[] args) {
		
		//creates session factory
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(User.class)
									.buildSessionFactory();
		//creates session
		Session session = factory.openSession();
		
		try {
			
			//creates a user object
			System.out.println("Creating a new user");
			User tempUser = new User("Zap", "Rowsdower", "roswer@ziox.com");
			
			//starts a transaction
			session.beginTransaction();
			
			//saves the user object
			session.save(tempUser);
			
			//commits the transaction
			session.getTransaction().commit();
			
			System.out.println("User Saved.");
			
		}
		
		finally {
			
			factory.close();
		}
		

	}

}
