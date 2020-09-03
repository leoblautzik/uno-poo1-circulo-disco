public class Test {

	public static void main(String[] args) {
		
		Circulo c1 = new Circulo();
		System.out.println(c1.obtenerRadio());
		Circulo c2 = new Circulo(3);
		System.out.println(c2.obtenerRadio());
		Circulo c3 = new Circulo(4,"rojo");
		Circulo c4 = new Circulo(3);
		System.out.println(c3.obtenerColor());
		System.out.println(c3.obtenerRadio());
			
		System.out.println(c3.obtenerPerimetro());
		System.out.println(c4.obtenerDiametro());
		System.out.println(c3.obtenerSuperficie());
		
		Disco d1 = new Disco(2,4);
		Disco d2 = new Disco(2,4);
		Disco d3 = new Disco(6,3);
		
		d1.obtenerPerimetroExterior();
		d2.obtenerPerimetroExterior();
		
		d2.obtenerSuperficie();

	}

}
