package libreriavirtual;

class Revista extends Producto {
    private String nombre;
    private String fechaPublicacion;
    private String editor;

    public Revista(String nombre, String fechaPublicacion, String editor, String codigo, double precioCompra, boolean esDigital) {
        super(codigo, precioCompra, esDigital);
        this.nombre = nombre;
        this.fechaPublicacion = fechaPublicacion;
        this.editor = editor;
    }

    // Métodos Setter y Getter
    public String getNombre() {
    	return nombre;
    }

    public void setNombre(String nombre) {
    	this.nombre = nombre;
    }

    public String getFechaPublicacion() {
    	return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
    	this.fechaPublicacion = fechaPublicacion;
    }

    public String getEditor() {
    	return editor;
    }

    public void setEditor(String editor) {
    	this.editor = editor;
    }

    // Método para calcular el precio de venta al público de la revista
    @Override
    public double calcularPrecioVenta() {
        if (isEsDigital()) {
            return getPrecioCompra() * 1.12;
        } else {
            return getPrecioCompra() * 1.22;
        }
    }
}