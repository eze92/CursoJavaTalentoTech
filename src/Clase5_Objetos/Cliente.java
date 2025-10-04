package Clase5_Objetos;

public class Cliente {
/*
Crea una clase Cliente con atributos nombre y email.
Instanciá un objeto Cliente y asignale valores a sus atributos.
 */

  private String nombre;
  private String email;

  public Cliente (String nombre, String email){
    this.nombre = nombre;
    this.email = email;
  }
  public String getNombreCliente(){
    return this.nombre;
  }
  public String getEmail(){
    return this.email;
  }

  public static void main(String[] args) {
    Cliente cli = new Cliente("Ezequiel", "ezequiel.ledesma026@gmail.com");
    System.out.println( "El nombre del cliente es : " + cli.getNombreCliente());
    System.out.println( "El mail es : " + cli.getEmail());
  }
}
