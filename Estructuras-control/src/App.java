public class App {
  public static void main(String[] args) throws Exception {

    // IF - ELSE IF - ELSE
    System.out.println(">>>>> IF <<<<<<");
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

    System.out.println();
    // SWITCH

    System.out.println(">>>>> SWITCH <<<<<<");
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
    System.out.println();

    // FOR
    System.out.println(">>>>> FOR <<<<<<");
    // for(inicialización; condición; actualización)

    int i;

    for (i = 1; i <= 10; i++) {

      System.out.println(i);

    }
    System.out.println();

    // WHILE
    System.out.println(">>>>> WHILE <<<<<<");

    int contador = 1;
    while (contador <= 5) {
      System.out.println(contador);
      contador++;
    }
    System.out.println();

    // DO WHILE
    System.out.println(">>>>> DO WHILE <<<<<<");

    int contador2 = 1;

    do{
      System.out.println("sucede antes de la condición");
      System.out.println(contador2);
      //actualización de la variable
      contador2++;
    }while(contador2 <= 5);

    System.out.println(contador2);
    System.out.println();

    // DO WHILE
    System.out.println(">>>>> CONTROLES DE FLUJO <<<<<<");

    int z;
    for(z = 1; z <= 10; z++){

      if (z <=2) {
        // no ejecutamos el resto del código y pasamos a la siguiente iteración
        continue;
      }
      System.out.println(z);
      if (z== 5){
        // break hace que termine el bucle 
        break;
      }
    }

  }
}
