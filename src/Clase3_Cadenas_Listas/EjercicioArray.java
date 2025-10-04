package Clase3_Cadenas_Listas;

/*
Creá un array de 5 productos.
Imprimí sus elementos y luego intentá agregar un sexto producto (analizá el resultado).
 */
public class EjercicioArray {

  // Método que imprime los elementos de un array
  public static void imprimirElementos(String[] productos) {
    for (int i = 0; i < productos.length; i++) {
      System.out.println(productos[i]);
    }
  }

  public static void main(String[] args) {
    // Inicialización correcta del array
    String[] productos = new String[5];
    productos[0] = "Agua";
    productos[1] = "Yerba";
    productos[2] = "Cafe";
    productos[3] = "Azucar";
    productos[4] = "Edulcorante";

    // Llamada al método
    imprimirElementos(productos);
  }
}