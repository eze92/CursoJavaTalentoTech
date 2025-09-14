package EjercicioArrayList;

import java.util.ArrayList;

/*
ArrayList:
 Creá un ArrayList<String> para productos.
 Agregá varios productos, eliminá uno, verificá si otro existe y luego imprimí la lista final
 */
public class EjercicioArrayList {

  private ArrayList<String> listaProducto = new ArrayList<>();

  public void agregarProductos(String producto){
    listaProducto.add(producto);
  }
  public void mostrarListaProductos(){
    for(String productos : listaProducto){
      System.out.println(productos);
    }
  }
  public void eliminarProductos(String producto){
      listaProducto.remove(producto);
  }
  public void existeProducto( String producto){
    if( listaProducto.contains(producto)) {
      System.out.println("El producto " + producto + " se encuentra en la lista");
    }else{
      System.out.println("El producto " + producto + " no se encuentra en la lista");
    }
  }

  public static void main(String[] args) {

    EjercicioArrayList miLista = new EjercicioArrayList();
    miLista.agregarProductos("Manzana");
    miLista.agregarProductos("Pera");
    miLista.agregarProductos("Melon");
    miLista.eliminarProductos("Pera");
    miLista.existeProducto( "Manzana");
    miLista.existeProducto( "Pera");
    miLista.mostrarListaProductos();


  }
}
