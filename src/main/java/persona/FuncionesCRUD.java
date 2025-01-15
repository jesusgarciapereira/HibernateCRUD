package persona;

public class FuncionesCRUD {
	
	private static AccesoBBDD instancia = new AccesoBBDD();

	private static void guardar(Object objeto) throws Exception{
		instancia.abrir();
		int id = (int) instancia.guardar(objeto);
		// ¿Por que?
		System.out.println(id);
		instancia.cerrar();
	}
}
