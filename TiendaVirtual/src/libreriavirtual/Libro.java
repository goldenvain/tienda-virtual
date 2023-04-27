package libreriavirtual;

class Libro extends Producto {
    private String titulo;
    private String autorPrincipal;
    private String fechaPublicacion;
    private String editorial;

    public Libro(String titulo, String autorPrincipal, String fechaPublicacion, String editorial, String codigo, double precioCompra, boolean esDigital) {
        super(codigo, precioCompra, esDigital);
        this.titulo = titulo;
        this.autorPrincipal = autorPrincipal;
        this.fechaPublicacion = fechaPublicacion;
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutorPrincipal() {
        return autorPrincipal;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public String getEditorial() {
        return editorial;
    }

    @Override
    public double calcularPrecioVenta() {
        if (isEsDigital()) {
            return getPrecioCompra() * 1.08;
        } else {
            return getPrecioCompra() * 1.18;
        }
    }
}