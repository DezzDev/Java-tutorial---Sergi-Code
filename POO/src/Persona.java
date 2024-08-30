public class Persona {
  
  // Atributos (estado / características de un objeto)
  private String nombre;
  private String apellido;
  private int edad;
  

  
  // Constructor
  public Persona(String nombre, String apellido, int edad){
    this.nombre = nombre;
    this.apellido = apellido;
    this.edad = edad;
  }
 
  // Métodos (comportamiento de un objeto)
  public String darNombreCompleto(){
    return apellido + ", " + nombre;
  }

  public String enviarSaludo(String saludado){
    return "Hola, ¿como estas " + saludado + "?";
  }

  
  // Getters and Setters
  public String getNombre() {
    return nombre;
  }
  public int getEdad() {
    return edad;
  }
  public String getApellido() {
    return apellido;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public void setEdad(int edad) {
    this.edad = edad;
  }
  public void setApellido(String apellido) {
    this.apellido = apellido;
  }
}
