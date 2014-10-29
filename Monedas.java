public class Monedas {
	
	public static void main (String args[]) {
		final double DOLARES_POR_EUROS=0.788227041;
		final double EUROS_POR_DOLARES=1.2705;
		{
		//Paso de Euros a Dólares
		double euros=15;
		double dolares;
		dolares = EUROS_POR_DOLARES*euros;
		System.out.println(+ euros + " Euros son: " + dolares + " Dolares. ");
		}
		{
		//Paso de Dólares a Euros
		double dolares=15;
		double euros;
		euros = DOLARES_POR_EUROS*dolares;
		System.out.println(+ dolares + " Dolares son:" + euros + " Euros. ");	
		}
	
	}
}

