package persona;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class AccesoBBDD {

	SessionFactory sf;
	private Session sesion;
	private Transaction transaccion;

	// Prueba luego private
	protected void setUp() {
		final StandardServiceRegistry registro = new StandardServiceRegistryBuilder()
				.configure() // por defecto: hibernate.cfg.xml
				.build();
		
		try {
			sf = new MetadataSources(registro).buildMetadata().buildSessionFactory();
			
		}
		catch(Exception e) {
			StandardServiceRegistryBuilder.destroy(registro);
		}
	}
	
	// Lanzamiento de exepcion?
	public void abrir() throws Exception{
		setUp();
		sesion = sf.openSession();
		transaccion = sesion.beginTransaction();
	}
	
	public void cerrar() {
		try {
			transaccion.commit();
		}catch(Exception e) {
			transaccion.rollback();
		}
		sf.close();

	}
	
	public Object guardar(Object objeto) {
		return sesion.save(objeto);
	}

}
