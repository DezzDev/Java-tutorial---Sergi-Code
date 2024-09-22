import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
	public static void main(String[] args) throws Exception {
		System.out.println("Bienvenidos a las fiestas de los super heroes");

		// Colecciones de tipo set
		// la característica principal de los set es que no se puede repetir
		
		// HashSet
		// recordar que no guarda el orden
		Set<String> superHeroes = new HashSet<>();

		System.out.println("HashSet");
		superHeroes.add("Spiderman");
		superHeroes.add("Capitan america");
		superHeroes.add("Iron man");
		superHeroes.add("Hulk");
		superHeroes.add("HawEye");
		superHeroes.add("Thor");
		superHeroes.add("Batman");

		if (superHeroes.contains("Spiderman")){
			System.out.println("Spiderman esta en la fiesta");
		}

		superHeroes.remove("Hulk");

		if(!superHeroes.contains(("Hulk"))){
			System.out.println("Hulk se ha ido de la fiesta");
		}

		// intentamos agregar a uno repetido
		superHeroes.add("Batman");

		if(superHeroes.isEmpty()){
			System.out.println("La fiesta ha terminado");
		}else{
			System.out.println("la fiesta continua, quedan " + superHeroes.size() + " super heroes");
		}

		System.out.println("¿quienes están aun en la fiesta?");
		for (String superHeroe : superHeroes) {
			System.out.println(superHeroe);
		}

		System.out.println("");
		System.out.println("");
		System.out.println("TreeSet");

		
		//TreeSet ordena de forma natural (alfabéticamente) o con alguna implementación que añadamos
		Set<String> superHeroes2 = new TreeSet<>();

		superHeroes2.add("Spiderman");
		superHeroes2.add("Capitan america");
		superHeroes2.add("Iron man");
		superHeroes2.add("Hulk");
		superHeroes2.add("HawEye");
		superHeroes2.add("Thor");
		superHeroes2.add("Batman");

		if (superHeroes2.contains("Spiderman")){
			System.out.println("Spiderman esta en la fiesta");
		}

		superHeroes2.remove("Hulk");

		if(!superHeroes2.contains(("Hulk"))){
			System.out.println("Hulk se ha ido de la fiesta");
		}

		// intentamos agregar a uno repetido
		superHeroes2.add("Batman");

		if(superHeroes2.isEmpty()){
			System.out.println("La fiesta ha terminado");
		}else{
			System.out.println("la fiesta continua, quedan " + superHeroes2.size() + " super heroes");
		}

		System.out.println("¿quienes están aun en la fiesta?");
		for (String superHeroe : superHeroes2) {
			System.out.println(superHeroe);
		}


		System.out.println("");
		System.out.println("");
		System.out.println("LinkedHashSet");
		
		//LinkedHashSet, mantiene el orden en el que se agregan
		Set<String> superHeroes3 = new LinkedHashSet<>();

		superHeroes3.add("Spiderman");
		superHeroes3.add("Capitan america");
		superHeroes3.add("Iron man");
		superHeroes3.add("Hulk");
		superHeroes3.add("HawEye");
		superHeroes3.add("Thor");
		superHeroes3.add("Batman");

		if (superHeroes3.contains("Spiderman")){
			System.out.println("Spiderman esta en la fiesta");
		}

		superHeroes3.remove("Hulk");

		if(!superHeroes3.contains(("Hulk"))){
			System.out.println("Hulk se ha ido de la fiesta");
		}

		// intentamos agregar a uno repetido
		superHeroes3.add("Batman");

		if(superHeroes3.isEmpty()){
			System.out.println("La fiesta ha terminado");
		}else{
			System.out.println("la fiesta continua, quedan " + superHeroes3.size() + " super heroes");
		}

		System.out.println("¿quienes están aun en la fiesta?");
		for (String superHeroe : superHeroes3) {
			System.out.println(superHeroe);
		}
	}
}
