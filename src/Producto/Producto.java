package Producto;

public class Producto {
/*
○ En la clase Producto, agrega un método mostrarInformacion() que imprima nombre, precio y stock.
○ Llamá a este método desde el main para varios objetos de Producto.
 */

  private String nombre;
  private double precio;
  private int stock;

  public Producto ( String nombre , double precio, int stock){
    this.nombre = nombre;
    this.precio = precio;
    this.stock = stock;
  }

  public void mostrarInformacion(){
    System.out.println( "El producto es : " + this.nombre + " con precio " + this.precio + " y stock " +this.stock);
  }

  /*
  Agregá un método en Producto que calcule un descuento general para todos los productos de un 10%.
  Probalo con distintos precios.*/

 /* public double calcularDescuento(double porcentaje) {
    return this.precio - (this.precio * porcentaje / 100);
  }
*/
  public void setCalcularDescuento(double porcentaje) {
    this.precio = this.precio - (this.precio * porcentaje / 100);
  }

  public static void main(String[] args) {
    Producto producto = new Producto("Manzana", 10.5, 50);
    Producto producto2 = new Producto("Banana", 8.0, 30);
    Producto producto3 = new Producto("Pera", 12.0, 20);
    producto.mostrarInformacion();
    producto2.mostrarInformacion();
    producto3.mostrarInformacion();

    producto.setCalcularDescuento(10.0);
    producto.mostrarInformacion();
    //System.out.println("El precio del producto con descuento es " + producto.calcularDescuento(10.0));

  }
}
