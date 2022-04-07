package myCar;

import java.time.LocalDateTime;

public class Mantencion {

	private String tipoMant; //tipo 
	private String observaciones;
	private Float precio;
	private static LocalDateTime fecha;
	
	public Mantencion() {
		
	}
	public Mantencion(String tipoMant, String observaciones, Float precio, LocalDateTime fecha) {
		this.tipoMant = tipoMant;
		this.observaciones = observaciones;
		this.precio = precio;
		Mantencion.fecha = fecha;
	}
	public String getTipoMant() {
		return tipoMant;
	}
	public void setTipoMant(String tipoMant) {
		this.tipoMant = tipoMant;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public Float getPrecio() {
		return precio;
	}
	public void setPrecio(Float precio) {
		this.precio = precio;
	}
	public static LocalDateTime getFecha() {
		return fecha;
	}
	public static void setFecha(LocalDateTime fecha) {
		Mantencion.fecha = fecha;
	}
	
	}
