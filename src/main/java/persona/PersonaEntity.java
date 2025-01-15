package persona;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "Persona")
public class PersonaEntity implements Serializable{ // Preguntar por que se implementa eso

	// PROPIEDADES
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //La opción más usada con MySQL
	@Column(name = "id")
	private long id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "saldo")
	private double saldo;

	
	// CONSTRUCTORES
	
	// Puede que necesite mas constructores
	public PersonaEntity() {

	}

	// El id no esta porque es autoincrementado
	public PersonaEntity(String nombre, double saldo) {
		this.nombre = nombre;
		this.saldo = saldo;
	}

	
	// GETTER Y SETTER
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
