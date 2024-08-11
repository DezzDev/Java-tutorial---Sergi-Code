import java.util.Scanner; // importamos la clase scanner

public class Ahorcado {
    public static void main(String[] args) throws Exception {
       
      Scanner scanner = new Scanner(System.in);

      String palabraSecreta = "maraton".toLowerCase();
      int intentosMaximos = 10;
      int intentos = 0;
      boolean palabraAdivinada = false;

    
      

      String[] letrasAdivinadas = new String[palabraSecreta.length()];


      // imprimir guiones según la cantidad de caracteres que tiene la palabra

      for (int i = 0; i < letrasAdivinadas.length; i++) {
        letrasAdivinadas[i] = "_ ";
      }

      while(palabraAdivinada == false && intentos < intentosMaximos){
        // imprimimos los guiones
        System.out.println("Palabra a adivinar: ");
        for (String character : letrasAdivinadas) {
          System.out.print(character);
        }
        System.out.println();
        

        // pedimos la letra
        System.out.print("Ingresa una letra : ");
        String character = scanner.nextLine().substring(0, 1).toLowerCase();
        

        boolean letraCorrecta = false;
        // comparamos
        for (int i = 0; i < palabraSecreta.length(); i++) {
          String characterPS = palabraSecreta.substring(i, i+1);
       
          if( characterPS.equals(character)){
            letrasAdivinadas[i] = character + " ";
            letraCorrecta = true;
          }
        }

        if(!letraCorrecta){
          intentos++;
          System.out.println("Incorrecto, te quedan " + (intentosMaximos - intentos) + " intentos");
        }

        
        palabraAdivinada = true;
        for (int i = 0; i < letrasAdivinadas.length; i++) {
          if(letrasAdivinadas[i] == "_ "){
            palabraAdivinada= false;
            break;
          }
        }
        
        if (palabraAdivinada){
          scanner.close();
          System.out.println("Felicidades");
          System.out.println("has adivinado la palabra secreta");
         for (String letra : letrasAdivinadas) {
          System.out.print(letra);
         }
        }

       
      }

      if(palabraAdivinada == false){
        System.out.println("Te has quedado sin intentos, GAME OVER");
      }

    }
}
