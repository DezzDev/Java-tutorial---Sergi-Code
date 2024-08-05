public class App {
  public static void main(String[] args) throws Exception {

    // IF - ELSE IF - ELSE

    int edad = 61;

    if (edad > 18 && edad <= 60) {
      System.out.println("Puedes entrar a la disco");
    } else if (edad > 60) {
      System.out.println("No puedes entrar ya que no es para mayores de 60");
    } else if (edad == 18) {
      System.out.println("Tienes la edad justa, puedes entrar");
    } else {
      System.out.println("No puedes entrar en la disco");
    }

    // SWITCH

    // ¿Qué tipo de bebida te gusta?
    String bebida = "Cafe";

    switch (bebida) {
      case "Cafe":
        System.out.println("El café esta delicioso");
        break;
      case "Mate":
        System.out.println("Debes de ser Argentino");
        break;
      case "Gaseosa":
        System.out.println("Ten cuidado con el azúcar");
        break;
      case "Vino":
        System.out.println("No conduzcas");
        break;

      default:
        System.out.println("Disfruta de tu bebida");
        break;
    }

  }
}
