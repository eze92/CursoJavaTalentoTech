package Clase4_Funciones_Modularizacion;

public class DescuentosProductos {


  /*
  Escribí un método calcularImpuesto que reciba un precio y un porcentaje de impuesto y devuelva el precio final.
   Llamá al método desde main con distintos valores.
  */
  public static double calcularImpuesto(double precio, double porcentajeImpuesto){
    return precio * ( 1 + porcentajeImpuesto / 100);
  }
/*
Creá un método calcularPrecioFinal que reciba el precio, el descuento y la cantidad.
Si la cantidad es mayor a 50, aumentá el descuento.
Imprimí el resultado.
*/

 public static double calcularPrecioFinal( double precio, double descuento, int cantidad) {
   double resultado = 0;
   if (cantidad > 50) {
     resultado = precio * (1 - descuento / 100);
   } else {
     resultado = precio;
   }
   return resultado;
 }
 /*
 Definí un array con el stock de 3 productos.
 Escribí un método reponerStock que sume unidades a un índice específico del array.
 Mostrá el stock antes y después de la reposición.
*/
 Integer[] productos = new Integer[3];

 public void reponerStock( int unidad, int indice){
   if( indice >= 0 && indice < productos.length){
     productos[indice] = productos[indice] + unidad;
   }else{
     System.out.println("El indice ingresado es incorrecto");
   }
 }
 public void mostrarProductos(){
   for ( int i = 0 ; i < productos.length ; i++){
     System.out.println("Producto " + i + ": " + productos[i] + " unidades");   }
 }

 /*
   Creá dos métodos mostrarMensaje: uno recibe una String, otro recibe una String y un int.
   Usá ambos para imprimir mensajes en función de si el cliente es nuevo o recurrente.
*/
  public void mostrarMensaje( String mensaje){
    System.out.println(mensaje);
  }
  public void mostrarMensaje( String mensaje , int recurrencia){
    if (recurrencia > 5) {
      System.out.println(mensaje + " ¡Gracias por ser un cliente fiel con " + recurrencia + " compras!");
    } else {
      System.out.println(mensaje + " ¡Esperamos verte más seguido! Has comprado " + recurrencia + " veces.");
    }
  }


  public static void main(String[] args) {
      double resultado = calcularImpuesto(10,5);
      System.out.println("Precio con impuesto: $" + resultado);
      double resultado2 = calcularImpuesto(15,1);
      System.out.println("Precio con impuesto: $" + resultado2);
      double resultado3 = calcularPrecioFinal(10.5, 5, 51);
      System.out.println("Precio con descuento: $" + resultado3);
    // Stock
      DescuentosProductos dp = new DescuentosProductos();
      dp.productos[0] = 5;
      dp.productos[1] = 10;
      dp.productos[2] = 0;

      System.out.println("Stock antes de reponer:");
      dp.mostrarProductos();

      System.out.println("Stock luego  de reponer:");
      dp.reponerStock(20,2);
      dp.mostrarProductos();

    // Cliente nuevo
    dp.mostrarMensaje("Bienvenido al sistema");

    // Cliente recurrente
    dp.mostrarMensaje("Hola de nuevo", 8);
    dp.mostrarMensaje("Hola de nuevo", 2);
  }
}
