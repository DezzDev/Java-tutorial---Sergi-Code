import interfaces.Alimentable;
import interfaces.Comunicable;

public class Pulpo extends CriaturasMarinas implements Comunicable, Alimentable {

  int cantTentaculos;

  public Pulpo(String nombre, int cantTentaculos) {
    super(nombre);
    this.cantTentaculos = cantTentaculos;
  }

  @Override
  void nadar() {
    System.out.println(nombre + " esta nadando con sus " + cantTentaculos + " tentaculos");
  }

  @Override
  public void comunicarse() {
    System.out.println(nombre + " utiliza sus " + cantTentaculos + " tentaculos para comunicarse");
  }

  @Override
  public void alimentar() {
    System.out.println(nombre + " se esta alimentando");
  }
  
}
