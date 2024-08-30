public abstract class Figura {

  // este método sera obligatorio en las clases que hereden de figura
  abstract double calcularArea();

  void imprimirInformacion(){
    System.out.println("Esta información viene desde la clase abstracta");
  }
}
