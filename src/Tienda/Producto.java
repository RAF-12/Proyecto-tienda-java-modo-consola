
package Tienda;

class Producto {
    private String nombre;
    private String codigo;
    private double precio;

    public Producto(String nombre , String codigo, double precio) {
        if (codigo != null && !codigo.trim().isEmpty()) {
            this.codigo = codigo;
        } else {
            this.codigo = "SIN CODIGO";
        }
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            this.nombre = "SIN NOMBRE";
        }
        if (precio >= 0 ) {
            this.precio = precio;
        } else {
            this.precio = 0.0;
        }
        
    }
    
    public void mostrarInformacion(){
        System.out.println("Informacion del Producto: ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Codigo: " + codigo);
        System.out.println("Precio: " + precio);
        System.out.println("===================================");
        
    }
    
    
}
