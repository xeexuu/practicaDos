package practicaDos;

/**
 * @author Jesús Morgado Fernández
 * @version 1.0
 * @implNote Fecha: miércoles 02 de junio de 2021
 */

public class CCuenta {

	/**
	 * Atributos
	 */

	private String nombre;

	private String cuenta;

	private double saldo;

	private double tipoInteres;

	/**
	 * Constructor por defecto
	 */
	public CCuenta()

	{

	}

	/**
	 * Constructor parametrizado
	 * 
	 * @param nom  = nombre del usuario
	 * @param cue  = nombre de la cuenta
	 * @param sal  = saldo de la cuenta
	 * @param tipo = tipo de interés
	 */
	public CCuenta(String nom, String cue, double sal, double tipo)

	{

		nombre = nom;

		cuenta = cue;

		saldo = sal;

		tipoInteres = tipo;

	}

	/**
	 * Método que ingresa una cantidad
	 * 
	 * @param cantidad = cantidad a ingresar
	 * @throws Exception = por si se produce un error, que el programa no se bloquee
	 */
	public void ingresar(double cantidad) throws Exception

	{

		if (cantidad < 0)

			throw new Exception("No se puede ingresar una cantidad negativa");

		saldo = saldo + cantidad;

	}

	/**
	 * Método que retira una cantidad
	 * 
	 * @param cantidad = cantidad a retirar
	 * @throws Exception = por si se produce un error, que el programa no se bloquee
	 */
	public void retirar(double cantidad) throws Exception

	{

		if (cantidad <= 0)

			throw new Exception("No se puede retirar una cantidad negativa");

		if (estado() < cantidad)

			throw new Exception("No se hay suficiente saldo");

		saldo = saldo - cantidad;

	}

	/**
	 * 
	 * @return
	 */
	public String getNombre() {

		return nombre;

	}

	/**
	 * 
	 * @return
	 */
	public String obtenerNombre()

	{

		return getNombre();

	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {

		this.nombre = nombre;

	}

	/**
	 * 
	 * @param nom
	 */
	public void asignarNombre(String nom)

	{

		setNombre(nom);

	}

	/**
	 * 
	 * @return
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * 
	 * @return
	 */
	public String obtenerCuenta()

	{

		return getCuenta();

	}

	/**
	 * 
	 * @param cuenta
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * 
	 * @return
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * 
	 * @return
	 */
	public double estado()

	{

		return getSaldo();

	}

	/**
	 * 
	 * @param saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * 
	 * @return
	 */
	public double getTipoInteres() {

		return tipoInteres;

	}

	/**
	 * 
	 * @param tipoInteres
	 */
	public void setTipoInteres(double tipoInteres) {

		this.tipoInteres = tipoInteres;

	}

}