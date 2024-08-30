public class Gato extends Animal {
  // herencia

  public Gato (String nombre, int edad){
    // ya que la clase de la que hereda tiene un constructor 
    // que necesita el nombre y la edad hay que llamar a super
    // y pasarle dichos argumentos
    super(nombre,edad);
  }

  // polimorfismo, métodos con el mismo nombre pero en diferentes clases
  // se comporten de manera distinta según el tipo de objeto al que se llama
  // con el operador override podemos sobrescribir un método
  @Override
  public String hacerSonido(){
    return "Miiiaaaauuuu";
  }
}
