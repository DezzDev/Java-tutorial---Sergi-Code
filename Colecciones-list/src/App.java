import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;




public class App {
	public static void main(String[] args) throws Exception {
		System.out.println("Bienvenidos a las fiestas de los super heroes");

		// Colecciones de tipo list
		// podemos modificar los elementos según el índice
		// puede tener elementos repetidos
		// viene ordenada según se agregan elementos
		// son buenas para agregar y eliminar pero no tanto para buscar

		// ArrayList
		//
		List<String> superHeroes = new ArrayList<>();

		System.out.println("ArrayList");
		superHeroes.add("Spiderman");
		superHeroes.add("Capitan america");
		superHeroes.add("Iron man");
		superHeroes.add("Hulk");
		superHeroes.add("HawEye");
		superHeroes.add("Thor");
		superHeroes.add("Batman");

		if (superHeroes.contains("Spiderman")) {
			System.out.println("Spiderman esta en la fiesta");
		}

		System.out.println("Hay un superhéroe ebrio, es: " + superHeroes.get(0));

		// agregamos a un superhéroe

		superHeroes.remove(3);

		if (!superHeroes.contains(("Hulk"))) {
			System.out.println("Hulk se ha ido de la fiesta");
		}

		System.out.println("Spider-man se quita el traje");
		superHeroes.set(0, "Peter Parker");

		if (superHeroes.isEmpty()) {
			System.out.println("La fiesta ha terminado");
		} else {
			System.out.println("la fiesta continua, quedan " + superHeroes.size() + " super heroes");
		}

		System.out.println("¿quienes están aun en la fiesta?");
		for (String superHeroe : superHeroes) {
			System.out.println(superHeroe);
		}
		System.out.println("");
		System.out.println("");

		
		System.out.println("LinkedList");
		// LinkedList
		// son buenas para buscar 
		// no tan buenas para agregar y eliminar 
		List<String> superHeroes2 = new LinkedList<>();

		superHeroes2.add("Spiderman");
		superHeroes2.add("Capitan america");
		superHeroes2.add("Iron man");
		superHeroes2.add("Hulk");
		superHeroes2.add("HawEye");
		superHeroes2.add("Thor");
		superHeroes2.add("Batman");

		if (superHeroes2.contains("Spiderman")) {
			System.out.println("Spiderman esta en la fiesta");
		}

		superHeroes2.remove(3);

		if (!superHeroes2.contains(("Hulk"))) {
			System.out.println("Hulk se ha ido de la fiesta");
		}

		System.out.println("Spider-man se quita el traje");
		superHeroes2.set(0, "Peter Parker");

		if (superHeroes2.isEmpty()) {
			System.out.println("La fiesta ha terminado");
		} else {
			System.out.println("la fiesta continua, quedan " + superHeroes2.size() + " super heroes");
		}

		System.out.println("¿quienes están aun en la fiesta?");
		for (String superHeroe : superHeroes2) {
			System.out.println(superHeroe);
		}

		System.out.println("");
		System.out.println("");
		System.out.println("Vector");

		// Vector
		// si tuviéramos multi hilo mantendría un orden sincronizado
		List<String> superHeroes3 = new Vector<>();

		superHeroes3.add("Spiderman");
		superHeroes3.add("Capitan america");
		superHeroes3.add("Iron man");
		superHeroes3.add("Hulk");
		superHeroes3.add("HawEye");
		superHeroes3.add("Thor");
		superHeroes3.add("Batman");

		if (superHeroes3.contains("Spiderman")) {
			System.out.println("Spiderman esta en la fiesta");
		}

		superHeroes3.remove(3);

		if (!superHeroes3.contains(("Hulk"))) {
			System.out.println("Hulk se ha ido de la fiesta");
		}

		System.out.println("Spider-man se quita el traje");
		superHeroes3.set(0, "Peter Parker");

		if (superHeroes3.isEmpty()) {
			System.out.println("La fiesta ha terminado");
		} else {
			System.out.println("la fiesta continua, quedan " + superHeroes3.size() + " super heroes");
		}

		System.out.println("¿quienes están aun en la fiesta?");
		for (String superHeroe : superHeroes3) {
			System.out.println(superHeroe);
		}
	}
}
