package libreriavirtual;

abstract class Producto {
    private String codigo;
    private double precioCompra;
    private boolean esDigital;

    public Producto(String codigo, double precioCompra, boolean esDigital) {
        this.codigo = codigo;
        this.precioCompra = precioCompra;
        this.esDigital = esDigital;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public boolean isEsDigital() {
        return esDigital;
    }

    public void setEsDigital(boolean esDigital) {
        this.esDigital = esDigital;
    }

    public abstract double calcularPrecioVenta();
}