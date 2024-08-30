public class App {
  public static void main(String[] args) throws Exception {

    Persona persona1 = new Persona("Daniel", "Zapata", 30);
    
    persona1.setNombre("Felix");
    System.out.println(persona1.darNombreCompleto() + " Tiene " + persona1.getEdad());
   
    System.out.println(persona1.enviarSaludo("Alejandro"));

    Animal animal1 = new Animal("rayo", 2);
    System.out.println("Animal: " + animal1.hacerSonido());
    
    Perro perro1 = new Perro("wiz", 10);
    System.out.println("Perro: " + perro1.hacerSonido());

    Gato gato1 = new Gato("manchas", 8);
    System.out.println("Gato: " + gato1.hacerSonido());

    System.out.println("El total de animales es: " + Animal.getContadorAnimales());

    System.out.println("trabajo en : " + Veterinaria.nombre);
  }
}
