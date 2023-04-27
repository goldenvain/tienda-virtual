package libreriavirtual;

public class Main {
    public static void main(String[] args) {
        // Crear productos
        Libro libro1 = new Libro("Cien Años De Soledad", "Gabriel García Márquez", "1967", "Cien Y Una Ediciones", "L001", 20.0, true);
        Libro libro2 = new Libro("El Aleph", "Jorge Luis Borges", "1949", "Sur", "L002", 15.0, false);
        Revista revista1 = new Revista("National Geographic", "Septiembre 2021", "National Geographic Society", "R001", 10.0, false);
        Revista revista2 = new Revista("Time", "Abril 2021", "Time USA, LLC", "R002", 8.0, true);

        // Crear carrito
        Carrito carrito = new Carrito();

        // Agregar productos al carrito
        carrito.agregarProducto(libro1);
        carrito.agregarProducto(libro2);
        carrito.agregarProducto(revista1);
        carrito.agregarProducto(revista2);

        // Mostrar productos del carrito
        carrito.mostrarProductos();

        // Calcular total a pagar
        System.out.println("Total a pagar: $ " + carrito.calcularTotal());
    }
}