public abstract class CriaturasMarinas{
  
  String nombre;

  public CriaturasMarinas(String nombre){
    this.nombre = nombre;
  }

  // esto obliga a sobrescribir en las clases que hereden
  abstract void nadar();
}