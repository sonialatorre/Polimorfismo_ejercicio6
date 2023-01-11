public abstract class Producto {
    protected String marca;
    protected String Stock;
    protected int ventas;

    public Producto (){

    }

    public Producto(String marca, String stock, int ventas) {
        this.marca = marca;
        Stock = stock;
        this.ventas = ventas;
    }

    public abstract void informacion();
}
