public class App {
    public static void main(String[] args) throws Exception {

        // Algunos métodos de la clase String
        
        String texto = "Soy un Texto o soy un String";
        System.out.println(texto);

        //calculamos la longitud del texto
        int longitud = texto.length();
        System.out.println(longitud);

        // accedemos a un carácter en especifico según su indice 
        char character = texto.charAt(1);
        System.out.println(character);

        // obtenemos una parte del string
        // beginIndex se toma y endIndex no se toma
        String subString = texto.substring(7, 12);
        System.out.println(subString);

        // transformamos el texto a minúscula
        String lowercase = texto.toLowerCase();
        System.out.println(lowercase);
        
        // transformamos el texto a mayúscula
        String uppercase = texto.toUpperCase();
        System.out.println(uppercase);

        // indice de un carácter o un texto, si no se encuentra -1
        int indice = texto.indexOf("Texto");
        System.out.println(indice);

        // reemplazar un carácter o un string
        String reemplazado = texto.replace("Texto","párrafo" );
        System.out.println(reemplazado);

        // verificamos si el string contiene un carácter o un string en particular
        boolean contiene = texto.contains("Daniel");
        System.out.println(contiene);
    }
}
