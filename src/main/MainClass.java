package main;

import java.util.List;

/**
 * Clase MainClass
 * 
 * @author jramlope
 *
 */
public class MainClass {

	/**
	 * M�todo main encargado de lanzar la aplicaci�n
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		List<Integer> numbers = List.of(18, 6, 15, 55, 78, 12, 9, 8);

		int a = 0;
		int b = 0;

		System.out.println("<===== FORMA IMPERATIVA =====>");

		// Forma imperativa
		for (Integer n : numbers) {
			if (n > 10) {
				a++;
			} else {
				b++;
			}
		}

		System.out.println("N�meros mayores a 10 : " + a);
		System.out.println("N�meros menores a 10 : " + b);

		System.out.println("<=== FORMA DECLARATIVA =====>");

		// Forma declarativa
		Long c = numbers.stream().filter(number -> number > 10).peek((Integer x) -> System.out.println(x)).count();

		System.out.println("N�meros mayores a 10 : " + c);
	}

}
