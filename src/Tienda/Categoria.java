
package Tienda;

import java.util.ArrayList;

public class Categoria {
    private String nombre;
    private String codigo;
    private ArrayList<Producto> producto = new ArrayList<>();

    public Categoria(String nombre, String codigo) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            this.nombre = "SIN NOMBRE";
        }
        if (codigo != null && !codigo.trim().isEmpty()) {
            this.codigo = codigo;
        } else {
            this.codigo = "SIN CODIGO";
        }
    }
    
    //Agrega un producto a la lista
    public void agregarProducto(Producto producto){
        this.producto.add(producto);  
    }
    
    //mostrar la info de categoria y productos que tiene 
    public void mostrarInformacion(){
        System.out.println("Nombre categoria: " + nombre);
        System.out.println("Codigo categoria: " + codigo);
        System.out.println(" ");
        System.out.println("===Lista de Productos===");
        if (producto != null && !producto.isEmpty()) {
            for (int i = 0; i < producto.size(); i++) {
                System.out.print((i+1) + ". ");
                producto.get(i).mostrarInformacion();         
            }
        } else {
            System.out.println("Sin Productos");
            System.out.println("");
        }

         
    }

    public String getNombre() {
        return nombre;
    }
    
}
