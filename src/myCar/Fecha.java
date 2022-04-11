package myCar;

import java.time.LocalDateTime;

public class Fecha {

	public LocalDateTime fecha;
	
    public Fecha() {
	}
	public Fecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

}