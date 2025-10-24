
public class Alertas {
	
	private int IdAlerta;
	private String Nombre;
	private double Valor;
	private String Mensaje;
	private boolean esActiva;
	private int IdUsuario;
	private int IdEstacion;
	private String FechaDeCreacion;             //Ver diagrama
	
	public int obtenerIdAlerta() {
		return IdAlerta;
	}
	
	public void establecerIdAlerta(int IDAlerta) {
		IdAlerta = IDAlerta;
	}
	
	public String obtenerNombre() {
		return Nombre;
	}

	public void establecerNombre(String nombre) {
		Nombre = nombre;
	}
	
	public double obtenerValor() {
		return Valor;
	}
	
	public void establecerValor(double valor) {
		Valor = valor;
	}
	
	public String obtenerMensaje() {
		return Mensaje;
	}
	
	public void establecerMensaje(String mensaje) {
		Mensaje = mensaje;
	}
	
	public boolean esActiva () {
		return esActiva;
	}
	
	public int obtenerIdUsuario() {
		return IdUsuario;
	}
	
	public void establecerIdUsuario(int IDUsuario) {
		IdUsuario = IDUsuario;
	}
	
	public int obtenerIdEstacion() {
		return IdEstacion;
	}
	
	public void establecerIdEstacion(int IDEstacion) {
		IdEstacion = IDEstacion;
	}
	
	public String obtenerFechaDeCreacion () {
		return FechaDeCreacion;
	}
	
	public void establecerFechaDeCreacion(String fechaDeCreacion) {
		FechaDeCreacion = fechaDeCreacion;
	}
}
