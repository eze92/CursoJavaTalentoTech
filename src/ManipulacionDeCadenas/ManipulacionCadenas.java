package ManipulacionDeCadenas;

/*
Dada una cadena " té CHAi ", formateala para que quede "Té Chai".
Mostrá su longitud, su primera letra y verificá si contiene la palabra "Chai".
 */
public class ManipulacionCadenas {

  public static String formatearCadena(String cadena) {

    String cadenaSinEspacio = cadena.trim().toLowerCase(); // saco Espacio y paso todo a minuscula
    String[] palabras = cadenaSinEspacio.split(" "); // convierto a cadena y saco espacios

    //stringBuilder clase para manipular cadenas
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i <= palabras.length - 1; i++) {
      if (!palabras[i].isEmpty()) {
        String primeraLetra = palabras[i].substring(0, 1)
            .toUpperCase(); //primer posicion pasa a mayuscula
        String restoPalabra = palabras[i].substring(1); // tomo de la posicion 1 en adelante
        sb.append(primeraLetra).append(restoPalabra); //concatena los strings
        if (i < palabras.length - 1) { // si no estoy en la última palabra, es decir arreglo
          sb.append(" ");
        }
      }
    }
    return sb.toString(); //tengo que devolver porque sb es un objeto no un string
  }

  public static void main(String[] args) {
    String cadenaOriginal = " té CHAi ";
    String cadenaFormateada = formatearCadena(cadenaOriginal);

    System.out.println("Cadena formateada: " + cadenaFormateada);
    System.out.println("Longitud: " + cadenaFormateada.length());
    System.out.println("Primera letra: " + cadenaFormateada.charAt(0));
    System.out.println("¿Contiene 'Chai'? " + cadenaFormateada.contains("Chai"));
  }
}
