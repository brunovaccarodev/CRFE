
public class EstacionMeteorologica {
	private int IdEstacion;
	private String Nombre;
	private String Ubicacion;
	private double Latitud;
	private double Longitud;
	private double Altitud;
	private String Tipo;
	private String Estado;
	private String FechaDeInstalacion;
	private boolean esActiva;
	
	public int obtenerIdEstacion () {
		return IdEstacion;
	}
	
	public void establecerIdEstacion(int IDEstacion) {
		IdEstacion = IDEstacion;
	}
	
	public String obtenerNombre() {
		return Nombre;
	}
	
	public void establecerNombre(String nombre) {
		Nombre = nombre;
	}
	
	public String obtenerUbicacion() {
		return Ubicacion;
	}
	
	public void establecerUbicacion(String ubicacion) {
		Ubicacion = ubicacion;
	}
	
	public double obtenerLatitud() {
		return Latitud;
	}
	
	public void establecerLatitud(double latitud) {
		Latitud = latitud;
	}
	
	public double obtenerLongitud() {
		return Longitud;
	}
	
	public void establecerLogitud(double longitud) {
		Longitud = longitud;
	}
	
	public double obtenerAltitud() {
		return Altitud;
	}
	
	public void establecerAltitud(double altitud) {
		Altitud = altitud;
	}
	
	public String obtenerTipo() {
		return Tipo;
	}
	
	public void establecerTipo(String tipo) {
		Tipo = tipo;
	}
	
	public String obtenerEstado() {
		return Estado;
	}
	
	public void establecerEstado(String estado) {
		Estado = estado;
	}
	
	public String obtenerFechaDeInstalacion() {
		return FechaDeInstalacion;
	}
	
	public void establecerFechaDeInstalacion(String fechaDeInstalacion) {
		FechaDeInstalacion = fechaDeInstalacion;
	}
	
	public boolean esActiva () {
		return esActiva;
	}
}
