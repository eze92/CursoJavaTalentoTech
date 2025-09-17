package EjercicioIntegradorClase2;
import java.util.Scanner;

public class EjercicioIntegradorClase2 {

  /*
  1) Variables y Operadores:
      *Crear variables para representar el precio de un producto
      * y la cantidad deseada por el cliente.
      *  Calculá y mostrale en pantalla el costo total.
      * Modificá el precio o la cantidad y verificá el resultado.
  2) Entrada y Salida de Datos:
    * Pedile al usuario que ingrese su nombre y la cantidad de
      productos que quiere comprar.
    * Mostrá un mensaje personalizado con el monto total (asignando un precio fijo por unidad).
  3) Condicionales:
    * Suponé que si el cliente quiere más de 100 unidades, le ofrecemos un descuento.
    * Implementá un if que verifique si cantidad > 100. Si es así,
     mostrá un mensaje indicando que aplica un descuento especial.
  */

  public static void main (String[] args){

    double precioProducto = 10.5;

    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese su nombre: ");
    String nombreCliente = sc.nextLine();

    System.out.println("Hola" + " " + nombreCliente + " "+ "Ahora ingrese la cantidad producto:");
    int cantidadProducto = sc.nextInt();

    double costoTotal =  precioProducto * cantidadProducto;

    double precioDescuento = (costoTotal) * 0.95;

    if( cantidadProducto > 100 ){
      System.out.println( "La cantidad ingresada supera los 100, se aplica un descuento del 5% :" + Math.round(precioDescuento));
    }else{
      System.out.println("El costo total del producto sin descuento es: " + costoTotal);
    }

    System.out.println("Ahora ingrese un numero: ");
    int numero = sc.nextInt();

    for (int i = 1 ; i <= numero; i++){
      System.out.println( "Inprimir valores: "  + i);
    }
  }
}
