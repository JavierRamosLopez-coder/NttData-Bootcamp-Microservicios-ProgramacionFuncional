package defaultProyect;

/**
 * Interfaz ICar
 * 
 * @author jramlope
 *
 */
public interface ICar {

	/**
	 * M�todo default que devuelve un system
	 */
	default void tearCar(String marca) {
		System.out.println(marca);
	}

}
