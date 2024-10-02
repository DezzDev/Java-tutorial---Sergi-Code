import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido a la frutería");

        
        // hashmap no respeta el orden
        // Map<String, Double> inventario = new HashMap<>();

        // ordena alfabéticamente, también podemos establecer un criterio de orden
        // Map<String, Double> inventario = new TreeMap<>();
        
        // mantiene el orden en el que se agregan los elementos
        Map<String, Double> inventario = new LinkedHashMap<>();

        // operaciones de inserción
        inventario.put("Banano", 0.89);
        inventario.put("Tomate", 0.75);
        inventario.put("Aguacate", 0.95);
        inventario.put("Fresa", 1.20);
        inventario.put("Pimiento", 0.62);
        
        System.out.println("Este es el inventario de frutas y verduras: ");

        // Recorrido del map
        // keyset obtiene un array de las keys
        for(String fruta : inventario.keySet() ){
            System.out.println(fruta + ": " + inventario.get(fruta) + " $");
        }

        String frutaBuscada = "Fresa";
        System.out.println("Un cliente pide la siguiente fruta: " + frutaBuscada);
        
        // operaciones de búsqueda
        if (inventario.containsKey(frutaBuscada)) {
            System.out.println("Tenemos " + frutaBuscada);
        }else{
            System.out.println("Lo siento no tenemos : " + frutaBuscada);
        }

        // operaciones de eliminación
        String sinStock = "Fresa";
        inventario.remove(sinStock);

        System.out.println("Nos hemos quedado sin stock de " + sinStock);

        System.out.println("Inventario actualizado");
        for(String fruta: inventario.keySet()){
            System.out.println(fruta + ": " + inventario.get(fruta) + " $");
        }

        System.out.println("El stock de la fruta es: " + inventario.size());
    }
}
