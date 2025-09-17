package CombinacionCadenayLista;


import java.util.ArrayList;

/*
Tené una lista de productos con nombres desprolijos.
 Creá un método que recorra la lista y aplique
 el formateo a cada nombre, volviendo a imprimir la lista con nombres prolijos.
*/
public class CombinacionCadenayLista {

  private ArrayList<String> listaProductos ;

  public CombinacionCadenayLista(){
    listaProductos = new ArrayList<>();
  }

  public void agregarProductos( String productos){
    listaProductos.add(productos);
  }

  public void mostrarProductos(){
    for(String productos : listaProductos){
      System.out.println(productos);
    }
  }

  public void transformarPalabras() {
    for (int i = 0; i < listaProductos.size(); i++) {
      String original = listaProductos.get(i);
      String limpio = formatearNombre(original);
      listaProductos.set(i, limpio); //reemplaza en el indice el nuevo valor
    }
  }
  private String formatearNombre(String nombre) {
    nombre = nombre.trim().toLowerCase();
    if (nombre.isEmpty()) return nombre;
    return Character.toUpperCase(nombre.charAt(0)) + nombre.substring(1);
  }


  public static void main(String[] args) {
    CombinacionCadenayLista cl = new CombinacionCadenayLista();
    cl.agregarProductos("  mANZaNa ");
    cl.agregarProductos("PERA");
    cl.agregarProductos("  durazno  ");

    System.out.println("Antes de transformar:");
    cl.mostrarProductos();

    cl.transformarPalabras();

    System.out.println("\nDespués de transformar:");
    cl.mostrarProductos();
  }
}
