package defaultProyect;

/**
 * Interfaz ICar
 * 
 * @author jramlope
 *
 */
public interface ICar {

	/**
	 * Método default que devuelve un system
	 */
	default void tearCar(String marca) {
		System.out.println(marca);
	}

}
