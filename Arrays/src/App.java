public class App {
  public static void main(String[] args) throws Exception {

    // Arrays: Estructuras de datos que tienen valores del mismo tipo
    // bajo un mismo nombre.
    // Estos valores se distribuyen secuencialmente en la memoria y se aller
    // puede acceder a ellos mediante un índice.

    // el índice comienza con el número 0
    // declaración del array especificando el tipo de dato = inicialización del
    // array especificando la cantidad de elementos que tendrá e inicializando todos
    // sus elementos a cero
    int[] numbers = new int[5];

    // otra forma de inicializar un array, esta vez estableciendo todos sus valores
    int[] numbers2 = { 1, 2, 8, 4 };

    // asignamos valores
    numbers[0] = 10;
    numbers[1] = 20;
    // numbers[2] = 30;
    numbers[3] = 40;
    numbers[4] = 50;

    // nos imprime la dirección en memoria
    System.out.println("Dirección en memoria");
    System.out.println(numbers);
    System.out.println();

    System.out.println("Valores del array numbers");
    for (int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
    }
    System.out.println();

    System.out.println("Valores del array numbers2");
    // foreach
    for (int element : numbers2) {
      // element ya es el valor en si
      System.out.println(element);
      
    }
    System.out.println();

    System.out.println("Número de elementos en el array numbers");
    System.out.println(numbers.length);
    System.out.println();

    System.out.println("Número de elementos en el array numbers2");
    System.out.println(numbers2.length);

  }
}
