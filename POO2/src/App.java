public class App {
    public static void main(String[] args) throws Exception {
        

      Circulo circulo = new Circulo(10);
      Rectangulo rectangulo = new Rectangulo(8, 6);

      circulo.imprimirInformacion();
      System.out.println("El area del circulo es: " + circulo.calcularArea());
      System.out.println("El area del rectangulo es es: " + rectangulo.calcularArea());

    }
}
