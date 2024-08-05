public class App {
    public static void main(String[] args) throws Exception {
        
      // OPERADORES: símbolos que sirven para hacer operaciones con variables o valores
      
      // ARITMÉTICOS
      
      int a = 5;
      int b = 4;
      // suma
      // int c = a + b;

      // resta 
      // int c = a - b;

      // multiplicación
       int c = a * b;

      System.out.println("Multiplicación");
      System.out.println(c);

      // división
      // si en una división el resultado es un decimal, 
      // para que el resultado sea correcto los valores que 
      // utilizamos también deben de ser de tipo decimal
      double d= 5;
      double e = 4;

      double f = d / e ;
      
      System.out.println("División");
      System.out.println(f);

      // resto
      int g = 12;
      int h = g % 2;
      System.out.println("Resto");
      System.out.println(h);

      // ASIGNACIÓN, se usa un solo igual

      int i = 5;
      // reasignar
      i=10;
      // asignación mas suma
      i += 15;
      // asignación mas resta
      i -= 15;
      // asignación mas multiplicación
      i *= 3;
      // asignación mas división
      i /= 2; 
      // incrementar en 1
      i++;
      // disminuir en 1
      i--;

      System.out.println("Asignación");
      System.out.println(i);


      // COMPARACIÓN

      boolean esMayor = a > b;
      System.out.println("Es mayor?");
      System.out.println(esMayor);
      
      boolean esMenor = a < b;
      System.out.println("Es menor?");
      System.out.println(esMenor);

      boolean esIgual = a == b; 
      System.out.println("Es igual?");
      System.out.println(esIgual);

      // LÓGICA

      boolean condicion1 = true;
      boolean condicion2 = false;
      
      // ambos deben de ser positivos para que de true
      boolean resultadoAND = condicion1 && condicion2;
      System.out.println("AND");
      System.out.println(resultadoAND);
      
      // al menos uno debe de ser positivo para que de true
      boolean resultadoOR = condicion1 || condicion2;
      // devuelve lo contrario
      boolean resultadoNOT = !condicion1;

      System.out.println("OR");
      System.out.println(resultadoOR);
      System.out.println("NOT");
      System.out.println(resultadoNOT);


    }
}
