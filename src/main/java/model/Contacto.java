package model;

import java.io.Serializable;
import javax.persistence.*;




@Entity
@Table(name="contactos")
@NamedQuery(name="contacto.findAll", query="SELECT c FROM Contacto c")
public class Contacto implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int IdContacto;
	
	private int edad;
	
	private String email;
	
	public String nombre;
	
	public Contacto() {}

	public int getIdContacto() {
		return IdContacto;
	}

	public void setIdContacto(int idContacto) {
		IdContacto = idContacto;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
}
