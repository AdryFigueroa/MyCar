package myCar;

public class Mantencion {

	private String tipoMant; //tipo 
	private String observaciones;
	private Float precio;
	private Auto auto;
	
	public Mantencion() {
		
	}
	public Mantencion(String tipoMant, String observaciones, Float sprecio, Auto auto) {
		this.tipoMant = tipoMant;
		this.observaciones = observaciones;
		this.precio = precio;
		this.setAuto(auto);
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
	public Auto getAuto() {
		return auto;
	}
	public void setAuto(Auto auto) {
		this.auto = auto;
	}
	
	}
