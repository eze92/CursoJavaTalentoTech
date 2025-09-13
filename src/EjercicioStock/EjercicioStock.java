package EjercicioStock;/*
Contexto: Silvia pide verificar si el stock actual del Café Premium alcanza
para cubrir una demanda de 120 unidades. Si el stock es suficiente, avisamos
que podemos procesar el pedido; si no, informamos que no alcanza.
 */

import java.util.Scanner;

public class EjercicioStock {

  public static void main (String[] args) {
    int demanda = 120;
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese la cantidad de stock");

    int stock = sc.nextInt();

    if (stock <= demanda) {
      System.out.println("Se puede procesar el pedido");
    } else {
      System.out.println("No hay stock suficiente para procesar el pedido");
    }
    sc.close();
  }
}

