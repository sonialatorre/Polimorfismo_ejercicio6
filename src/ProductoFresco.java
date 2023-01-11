public class ProductoFresco extends Producto{
    protected String Tipo;

    public ProductoFresco(){

    }

    public ProductoFresco(String tipo) {
        Tipo = tipo;
    }

    public ProductoFresco(String marca, String stock, int ventas, String tipo) {
        super(marca, stock, ventas);
        Tipo = tipo;
    }
    @Override
    public void informacion (){
        System.out.println("PRODUCTO FRESCO");
        System.out.println("la marca del producto es :" + marca +"\n"+ "Stock:" + Stock +"\n"+ " total de Ventas:"+ ventas+ "Tipo de producto" + Tipo);

    }
}
