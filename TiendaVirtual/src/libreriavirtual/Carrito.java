package libreriavirtual;

import java.util.ArrayList;

public class Carrito {
    private ArrayList<Producto> productos;

    public Carrito() {
        this.productos = new ArrayList<Producto>();
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public void eliminarProducto(int index) {
        this.productos.remove(index);
    }

    public void mostrarProductos() {
        System.out.println("Productos en el carrito:");
        for (Producto p : productos) {
            if (p instanceof Libro) {
                Libro l = (Libro) p;
                System.out.println(l.getTitulo() + " - " + l.getAutorPrincipal() + " - " + l.getEditorial() + " - " + l.getFechaPublicacion() + " - Precio individual: $ " + l.calcularPrecioVenta());
            } else if (p instanceof Revista) {
                Revista r = (Revista) p;
                System.out.println(r.getNombre() + " - " + r.getEditor() + " - " + r.getFechaPublicacion() + " - Precio individual: $ " + r.calcularPrecioVenta());
            }
        }
        System.out.println("----------------------------------------------------------------------------------");
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto producto : this.productos) {
            total += producto.calcularPrecioVenta();
        }
        return total;
    }
}
