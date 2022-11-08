package mx.com.Maggie;

public class TestPastel {

	public static void main(String[] args) {
		
		System.out.println(Pastel.nPastel());
		
		Pastel moka = new Pastel ("Moka", "grande", 1);
		Pastel zanahoria = new Pastel ("Zanahoría", "mediano", .5);
		Pastel cajeta = new Pastel ("Cajeta", "mediano", .5);
		
		System.out.println( moka.information());
		System.out.println( zanahoria.information());
		System.out.println( cajeta.information());
		
		System.out.println("N. De Pasteles: " + Pastel.numPastel);
		

	}

}
