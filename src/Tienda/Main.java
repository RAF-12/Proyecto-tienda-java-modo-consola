
package Tienda;

import java.util.Scanner;
import Tienda.Tienda;
import java.util.ArrayList;
import java.util.InputMismatchException;
// este es un cambio de prueba par github23
public class Main {
    public static void main(String[] args) {
        boolean salir = false;
        Tienda tienda;
        Categoria categoria;
        Producto producto;
        
        Scanner scanner = new Scanner(System.in);
        // TODO code application logic here
        System.out.println("Bienvenido al sistema de administracion de Tendas");
        System.out.println("Por fabor ongrese el nombre de la tienda");
        tienda = new Tienda(scanner.nextLine());
        
        while (!salir) {
            System.out.println("======== Tienda " + tienda.getNombre() + " ========");
            System.out.println("Seleccione una opcion digitando el numero correspondiente");
            System.out.println("1. Agregar Categoria ");
            System.out.println("2. Agregar Producto ");
            System.out.println("3. Mostrar Informacion de la Tienda");
            System.out.println("4. Salir");
            int opcion = 0;
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (InputMismatchException e) {
                System.out.println("Error. Debe ingresar un numero");
            }
            
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre de la categoria");
                    scanner = new Scanner(System.in);
                    String nombre = scanner.nextLine();
                    
                    System.out.println("Ingrese el codigo de la categoria");
                    String codigo = scanner.nextLine();
                    categoria = new  Categoria(nombre, codigo);
                    tienda.agregarCategoria(categoria);
                    break;
                case 2:
                    System.out.println("Agregar productos a una categoria");
                    
                    ArrayList<Categoria> categorias = tienda.getCategoria();
                    if (categorias.isEmpty()) {
                        System.out.println("No hay categorias disponibles. Crea una catergiraia primero");
                        break;
                    }
                    
                    System.out.println("Selecciona una categoria");
                    for (int i = 0; i < categorias.size(); i++) {
                        System.out.println((i + 1) +". " + categorias.get(i).getNombre());
                    }
                   
                    System.out.println("Ingrese el numero de la categoria:");
                    int opcionCat = 0;
                    try {
                        opcionCat = Integer.parseInt(scanner.nextLine());
                    } catch (InputMismatchException e) {
                        System.out.println("Debes ingresar un numero ");
                    }
                    
                    if (opcionCat < 1 || opcionCat > categorias.size()) {
                        System.out.println("Categoria no valida.");
                        break;
                    }
                    
                    Categoria catergoriaSeleccionada = categorias.get(opcionCat -1);
                    
                    System.out.println("Nombre del producto: ");
                    String nombreProducto = scanner.nextLine();
                    
                    System.out.println("codigo del producto:");
                    String codigoProducto = scanner.nextLine();
                    
                    System.out.println("Precio del Producto: ");
                    double precioProducto = 0.0;
                    try {
                        precioProducto = Double.parseDouble(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Presio no valido debe ser numeros enteros o decimales");
                    }
                    
                    producto = new Producto(nombreProducto, codigoProducto, precioProducto);
                    catergoriaSeleccionada.agregarProducto(producto);

                    break;
                case 3:
                    tienda.mostrarInformacion();
             
                    break;
                case 4:
                    System.out.println("Gracias por visitarnos ! vuelva pronto ¡");
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        }
    }
    
}
