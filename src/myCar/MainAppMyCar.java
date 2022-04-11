package myCar;


import java.util.ArrayList;
import java.util.Scanner;
import myCar.Mantencion;
import myCar.Auto;
import myCar.Cliente;
import myCar.Fecha;

public class MainAppMyCar {
	
	private static ArrayList<Mantencion> mantencion = new ArrayList<>();
	private static ArrayList<Auto> auto = new ArrayList<>();

	static Scanner scanner = new Scanner(System.in);
    
    private final static int OPCION_MENU_AGREGAR_CLIENTE = 1;
	private final static int OPCION_MENU_ELIMINAR_CLIENTE = 2;
	private final static int OPCION_MENU_AGREGAR_MANTENCION = 3;
	private final static int OPCION_MENU_LISTA_MANTENCION = 4;
	private final static int OPCION_MENU_SALIR = 5;

	public static void main(String[] args) {
			menu();
		}
		
private static void menu() {
		
		int opcionSeleccionada;
				
		do {
			System.out.println("Formulario:");
			System.out.println("============");
			System.out.println("1. Agregar cliente");
			System.out.println("2. Eliminar cliente");
			System.out.println("3. Agregar mantencion");
			System.out.println("4. Lista mantencion");
			System.out.println("5. Salir");
			
			System.out.println("Elija una opción");

			
		// OPCIONES MENU
			opcionSeleccionada = scanner.nextInt();

			switch(opcionSeleccionada) {
				case OPCION_MENU_AGREGAR_CLIENTE:
					agregarCliente();
					break;
				case OPCION_MENU_ELIMINAR_CLIENTE:
					eliminarCliente();
					break;
				case OPCION_MENU_AGREGAR_MANTENCION:
					agregarMantencion();
					break;
				case OPCION_MENU_LISTA_MANTENCION:
					listaMantencion();
					break;
				default:
					System.out.println("Opción Inválida. Ingrese opción nuevamente");
					break;
			}	
		}while(opcionSeleccionada != OPCION_MENU_SALIR);
		
	}
private static void listaMantencion() {
	// TODO Auto-generated method stub 
	}

// AGREGAR CLIENTE
	private static void agregarCliente() {
		scanner.nextLine(); 
		
		System.out.println("Ingrese Nombres");
		String nombresCliente = scanner.nextLine();
		
		System.out.println("Ingrese Apellidos");
		String apellidosCliente = scanner.nextLine();
		
		System.out.println("Ingrese RUT");
		String rutCliente = scanner.nextLine();
		
		System.out.println("Ingrese email");
		String correoCliente = scanner.nextLine();

		System.out.println("Ingrese fono");
		String fonoCliente = scanner.nextLine();
		
		Cliente cliente = new Cliente(nombresCliente,apellidosCliente,rutCliente,correoCliente,fonoCliente);
	}
		
	private static void eliminarCliente() {
		System.out.println("eliminado");
		
	}

// SOLICITÉ AYUDA DE LOS GRUPOS PARA REALIZAR ESTE ITEM

	private static void agregarMantencion() {
		
		// MUESTRA AUTOS REGISTRADOS Y SUS DATOS
		System.out.println("AUTOS REGISTRADOS");
		for (Auto auto : auto){
			System.out.println("=======================================");
			System.out.println("PPU AUTO: "+auto.getPpu());
			System.out.println("MARCA AUTO: "+auto.getMarca());
			System.out.println("MODELO AUTO: "+auto.getModelo());
			System.out.println("FABRICACION AUTO: "+auto.getYearFabricacion());
			System.out.println("DUE�O AUTO: "+auto.getCliente().getNombres()+" "+auto.getCliente().getApellidos());
			System.out.println("=======================================\n");
		}
		
		scanner.nextLine(); 
		
		System.out.println("Escriba PPU del auto al que se ha hecho mantencion");
		String ppuMantencion = scanner.nextLine();
		
		Auto autoMantencion = null;
		
		// BUSCA EL AUTO SEGUN PPU EN ARRAYLIST autos, CUANDO LO ENCUENTRA, LO ASIGNA A VARIABLE ANTES DECLARADA (autoMantencion)
		for(Auto auto : auto) {
			if(ppuMantencion.equalsIgnoreCase(auto.getPpu())) {
				autoMantencion = auto;
			}
		}
		
		
		System.out.println("Escriba el tipo de mantencion realizado");
		String tipoMant = scanner.nextLine();
		
		System.out.println("Escriba observaciones realizadas");
		String observacionesMantencion = scanner.nextLine();
		
		System.out.println("Escriba monto cobrado");
		int precioMantencion = scanner.nextInt(); 
	
		
	}
}

