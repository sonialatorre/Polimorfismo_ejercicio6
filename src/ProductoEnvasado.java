public class ProductoEnvasado extends Producto {
    private String clase;

    public ProductoEnvasado() {
    }

    public ProductoEnvasado(String clase) {
        this.clase = clase;
    }

    public ProductoEnvasado(String marca, String stock, int ventas, String clase) {
        super(marca, stock, ventas);
        this.clase = clase;
    }

    @Override
    public void informacion() {
        System.out.println("PRODUCTO ENVASADO");
        System.out.println("la marca del producto es :" + marca + "\n" + "Stock:" + Stock + "\n" + " total de Ventas:" + ventas + "Clase de producto" + clase);
    }
}