public class App {
  public static void main(String[] args) throws Exception {

    Persona persona1 = new Persona("Daniel", "Zapata", 30);
    
    persona1.setNombre("Felix");
    System.out.println(persona1.darNombreCompleto() + " Tiene " + persona1.getEdad());
   
    System.out.println(persona1.enviarSaludo("Alejandro"));

  }
}
