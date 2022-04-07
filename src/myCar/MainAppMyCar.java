package myCar;

import java.util.ArrayList;

import myCar.Mantencion;


public class MainAppMyCar {
	private static ArrayList<Mantencion> Mantencion = new ArrayList<>();

	
	private static short tipoMantencion;
    private final static short OPCION_CAMBIO_ACEITE = 1;
    private final static short OPCION_AJUSTE_FRENOS= 2;
    private final static short OPCION_AFINAMIENTO= 3;
    private final static short OPCION_AMORTIGUADORES= 4;
    private final static short OPCION_SALIR= 5;
    
    
	public static void main(String[] args) {
		do {
			opcionSeleccionada = menu();
		}while(opcionSeleccionada!=OPCION_SALIR);
		
	}

}
