

public class OperacionMatematica {
	
	public static void main (String args[]) {
		//valores enteros
		short svalor= 10;
		int ivalor= 10;
		long lvalor= 10;
		long resultado1= svalor+ivalor+lvalor; 	//int como defecto
		System.out.println("Operacion enteros:" +resultado1);
		//valores decimales
	    float fvalor= 12.23F;
	    double dvalor= 12.23;
	    double resultado2= fvalor+dvalor; //double como defecto
	    System.out.println("Operacion decimales:" +resultado2);
		//valores char y String
		char c='c';
		char f='f';
		String d="d";
		String e="es una cadena";
		String resultado3=c+d+e;
		System.out.println("Operacion caracter y cadena:" +resultado3);
		//valor byte
		byte b1=1;
		byte b2=2;
		//byte resultado4=b1+b2;
		System.out.println("Operacion byte:" +b1+b2);
		System.out.println("Operacion byte:" +(b1+b2));
		
	}
}

