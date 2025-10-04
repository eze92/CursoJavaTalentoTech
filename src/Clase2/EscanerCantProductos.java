package Clase2;

import java.util.Scanner;

public class EscanerCantProductos {

  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Cuantos productos desea comprar?");

    int cantidadCliente = sc.nextInt();

    System.out.println("Vas a Comprar " + cantidadCliente + " productos");
  }
}
