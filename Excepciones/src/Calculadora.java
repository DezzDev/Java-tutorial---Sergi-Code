import Exceptions.CalculadoraException;

// lo hemos cambiado por excepciones mas genéricas 
// import Exceptions.DividirPorCeroException;

public class Calculadora {

	public int dividir (int dividendo, int divisor) throws CalculadoraException {
		
		if (divisor == 0){
			throw new CalculadoraException("No se puede dividir por 0");
		}
		return dividendo / divisor;
	}

}
