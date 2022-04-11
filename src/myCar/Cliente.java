package myCar;

public class Cliente {

	private String apellidos;
	private String nombres;
	private String rut;
	private String email;
	private String fono;
	
	public Cliente () {
		
	}
	
	public Cliente (String apellidos, String nombres, String rut, String email, String fono) {
		
		this.apellidos = apellidos;
		this.nombres = nombres;
		this.rut = rut;
		this.email = email;
		this.fono = fono;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFono() {
		return fono;
	}

	public void setFono(String fono) {
		this.fono = fono;
	}
	
	
}
