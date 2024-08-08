import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

      // clase Scanner

      Scanner scanner = new Scanner(System.in);

      System.out.println("Bienvenido a la máquina expendedora de bebidas");
      System.out.println("Elige una opción");
      System.out.println("1- Café");
      System.out.println("2- Mate");
      System.out.println("3- Gaseosa");
      System.out.println("4- Vino");

      int option = scanner.nextInt();
      scanner.close();

      switch (option) {
        case 1:
          System.out.println("El café esta delicioso");
          break;
        case 2:
          System.out.println("Debes de ser Argentino");
          break;
        case 3:
          System.out.println("Ten cuidado con el azúcar");
          break;
        case 4:
          System.out.println("No conduzcas");
          break;
  
        default:
          System.out.println("Disfruta de tu bebida");
          break;
        }
        
        if (option <= 4){
          System.out.println("Disfruta de la bebida");

        }
       
    }
}
