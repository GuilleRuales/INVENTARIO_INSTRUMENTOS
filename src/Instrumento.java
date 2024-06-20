public class Instrumento {

    private String tipo;
    private double precio;
    private String codigo;
    private String marca;

    public Instrumento() {
    }

    public Instrumento(String tipo, double precio, String codigo, String marca) {
        this.tipo = tipo;
        this.precio = precio;
        this.codigo = codigo;
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return  "\nTipo: "+tipo+
                "\n  Precio: "+precio+
                "\n  Codigo: "+codigo+
                "\n  Marca: "+marca;
    }
}
