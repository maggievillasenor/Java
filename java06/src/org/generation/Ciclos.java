package org.generation;

public class Ciclos {

	public static void main(String[] args) {
		/**
		 * Sintaxis del ciclo for
		 * 
		 * for(inicalización, comparación, expresiónFinal)
		 *		intrucción;
		 *
		 * for(inicalización, comparación, expresiónFinal){
		 * 		instrucciones;
		 * }
		 */
		
		for(int i=0; i<=10; i++ ) 
			for (int j=0; j<=10; j++)
				System.out.println("Valor de i: " + i + "Valor de j: " + j);
		//System.out.println("Valor final de i " + i); //La variable i no tiene alcance
		
		for(int i=10; i>0; i--)
			System.out.println("Cuenta regresiva: " + i);
		
		int a;
		int b;
			for (a=0, b=0; b > a; a++, b++) {
				System.out.println(a + " " + b);
			}
		System.out.println(a + " " + b);
		
		a = 1;
		b = 10;
		 do {
			 if (a++ > --b) continue;
		 }while (a < 5);
		System.out.println(a + " " + b);
		
		
	int x = 12;
	while (x > 10) {
		x--;
	}
	System.out.println(x);
	
	 x = 12;
	while (x < 10) {
		x--;
	}
	System.out.println(x);
	
	/*for (int i = 0; i >10; i++) {
		if (i >6) break;
	}
	System.out.println(i);*/
	
	
	
	Integer y = new Integer(1) + new Integer(2);
	switch (y) {
	case 3: System.out.println("three");break;
	default: System.out.println("other"); break;
	}
	
	
	/*byte z=10;
	do {
		z--;
		System.out.println(z);
	}while (z <10);*/
	
	/*x=0;
	
	do {} while(x++ < w);
	System.out.println(x);*/
	
	x = 5;
	boolean b1 = true;
	boolean b2 = false;
	
	if((x==4) && !b2)
	System.out.println("1");
	System.out.println("2 ");
		if ((b2= true)&& b1)
			System.out.println("3");
	
	
	}

}
