package practicaDos;

public class CCuenta {

	private String nombre;

	private String cuenta;

	private double saldo;

	private double tipoInteres;

	public CCuenta()

	{

	}

	public CCuenta(String nom, String cue, double sal, double tipo)

	{

		nombre = nom;

		cuenta = cue;

		saldo = sal;

	}

	public void ingresar(double cantidad) throws Exception

	{

		if (cantidad < 0)

			throw new Exception("No se puede ingresar una cantidad negativa");

		saldo = saldo + cantidad;

	}

	public void retirar(double cantidad) throws Exception

	{

		if (cantidad <= 0)

			throw new Exception("No se puede retirar una cantidad negativa");

		if (estado() < cantidad)

			throw new Exception("No se hay suficiente saldo");

		saldo = saldo - cantidad;

	}

	public String getNombre() {

		return nombre;

	}

	public String obtenerNombre()

	{

		return getNombre();

	}

	public void setNombre(String nombre) {

		this.nombre = nombre;

	}

	public void asignarNombre(String nom)

	{

		setNombre(nom);

	}

	public String getCuenta() {
		return cuenta;
	}

	public String obtenerCuenta()

	{

		return getCuenta();

	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public double estado()

	{

		return getSaldo();

	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getTipoInteres() {

		return tipoInteres;

	}

	public void setTipoInteres(double tipoInteres) {

		this.tipoInteres = tipoInteres;

	}

}