import java.math.BigDecimal;

public class Producto {
    private String codigo;
    private String nombre;
    private BigDecimal precio;
    private int stockActual;
    private int stockMinimo;
    private boolean activo;

    public Producto(String codigo, String nombre, BigDecimal precio,
                    int stockActual, int stockMinimo, boolean activo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stockActual = stockActual;
        this.stockMinimo = stockMinimo;
        this.activo = activo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public int getStockActual() {
        return stockActual;
    }

    public void setStockActual(int stockActual) {
        this.stockActual = stockActual;
    }

    public int getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(int stockMinimo) {
        this.stockMinimo = stockMinimo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}