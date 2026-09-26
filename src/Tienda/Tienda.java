package Tienda;

import java.util.ArrayList;

public class Tienda {
    private String nombre;
    private ArrayList<Categoria> categoria = new ArrayList<>();
    
    
    //cosntuctor
    public Tienda(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
            System.out.println("La tienda "+ this.nombre + " ha sido creada");
        } else {
            this.nombre = "SIN NOMBRE";
            System.out.println("La tienda se agrego como "+ this.nombre);
        }
        
    }
    
    //agregar categoria
    public void agregarCategoria(Categoria categoria ){
        if (categoria == null) {
            throw  new  IllegalArgumentException("La categoria no puede ser null");
        }
        
        for (Categoria c : this.categoria) {
            if (c != null && c.getNombre().equalsIgnoreCase(categoria.getNombre())) {
                System.out.println(categoria + " Ya existe dentro de la Tienda " );
                return;
            }
        }
        this.categoria.add(categoria);
        
    }
    // mostrar informacion de la tienda
    public void mostrarInformacion(){
        System.out.println("======== Tienda " + nombre + " ========");
        if (categoria.isEmpty() && categoria != null) {
            System.out.println("Sin categoria y productos ");   
        }
        System.out.println("============CATEGORIA============= ");
        for (int i = 0; i < categoria.size(); i++) {
            System.out.print((i+1) + ". ");
            categoria.get(i).mostrarInformacion();         
        }


    }

    String getNombre() {
        return nombre;
    }

    public ArrayList<Categoria> getCategoria() {
        return categoria;
    }
    
    
}
