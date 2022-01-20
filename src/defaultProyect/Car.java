package defaultProyect;

/**
 * Clase Car que implementa la interfaz
 * @author jramlope
 *
 */
public class Car implements ICar{

	/** Atributo privado que devuelve un String **/
	private String mark;
	
	/**
	 * Método constructor
	 * @param m
	 */
	public Car(String m) {
		this.mark = "Peugeot";
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}
	
	
	
}
