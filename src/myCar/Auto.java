package myCar;

public class Auto {

	private String ppu; //placa patente �nica
	private String marca;
	private String modelo;
	private int yearFabricacion; //a�o fabricacion
	private Cliente cliente; //dueño de auto
	
	public Auto () {
		
	}
	
	public Auto (String ppu, String marca, String modelo, int yearFabricacion, Cliente cliente) {
		this.ppu = ppu;
		this.marca = marca;
		this.modelo = modelo;
		this.yearFabricacion = yearFabricacion;
		this.setCliente(cliente);
	}

	public String getPpu() {
		return ppu;
	}

	public void setPpu(String ppu) {
		this.ppu = ppu;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getYearFabricacion() {
		return yearFabricacion;
	}

	public void setYearFabricacion(int yearFabricacion) {
		this.yearFabricacion = yearFabricacion;
	}
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
 