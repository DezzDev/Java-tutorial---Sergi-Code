import Exceptions.CalculadoraException;

public class App {
	public static void main(String[] args) throws Exception {
		// Excepciones: eventos que interrumpen el flujo normal de la aplicación
		
		// hay de dos tipos checked y unchecked 
		int numero1 = 10;
		int numero2 = 0;
		int resultado;

		// dividir por 0 seria uno de tipo unchecked
		// ya que obtendré un error pero no se me ha notificado que vaya a suceder un error

		// esta seria una excepción unchecked
		// System.out.println(numero1/numero2);
		

		Calculadora calculadora = new Calculadora();

		try {
			resultado = calculadora.dividir(numero1, numero2);
			System.out.println(resultado);
			
		} catch (CalculadoraException e) {
			// excepción manejada
			e.printStackTrace();
			
		}finally{
			System.out.println("calculo finalizado");
		}
	}
}
