public class Animal {
  String nombre;
  int cantPatas;
  int edad;

  // este dato al ser estático, sera común para todas las
  // instancias de esta clase
  static public int contadorAnimales = 0;

  public Animal(String nombre, int edad){
    this.nombre = nombre;
    this.edad = edad;
    contadorAnimales++;
  }

  public String hacerSonido(){
    return "grrrrr";
  }

  public static int getContadorAnimales(){
    return contadorAnimales;
  }
}
