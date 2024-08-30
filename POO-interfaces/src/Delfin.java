import interfaces.Alimentable;
import interfaces.Comunicable;

public class Delfin extends CriaturasMarinas implements Comunicable, Alimentable {
// no podemos extender de mas de una clase abstracta pero
// si podemos implementar de tantas interfaces deseemos

  public Delfin(String nombre){
    super(nombre);
  }

  void nadar(){
    System.out.println(nombre + " esta nadando con su cola");
  }

  @Override
  public void comunicarse() {
   System.out.println(nombre + " emite sonidos y chasquidos");
  }

  @Override
  public void alimentar() {
   System.out.println(nombre + " se esta alimentando");
  }
}
