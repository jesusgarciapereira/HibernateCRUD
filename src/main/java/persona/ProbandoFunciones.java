package persona;

public class ProbandoFunciones {

	private static AccesoBBDD instancia;

	public static void main(String[] args) throws Exception{
		instancia = new AccesoBBDD();
		ejemplo1();
	}

	private static void ejemplo1() throws Exception{
		PersonaEntity persona = new PersonaEntity("Jesús", 34.56);
		guardar(persona);
	}

	private static void guardar(Object objeto) throws Exception {
		instancia.abrir();
		int id = (int) instancia.guardar(objeto);
		// ¿Por que?
		System.out.println(id);
		instancia.cerrar();
	}
}
