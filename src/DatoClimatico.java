/*
Autor: Bruno Vaccaro
*/
public class DatoClimatico {														//Definición de clase
	private int idDato;																//Definición de atributos
	private String FechaHora;                              
	private double Temperatura;
	private double Humedad;
	private double Precipitacion;
	private double Viento;
	private double Radiacion;
	private int idEstacion;
	private int idUsuario;
	
	
	public int obtenerIdDato () {													//Definición de métodos constructores
		return idDato;
	}
	public void establecerIdDato (int ID) {
		idDato = ID;
	}
	public String obtenerFechaHora () {
		return FechaHora;
	}
	public void establecerFechaHora (String fechaHora) {
		FechaHora = fechaHora;
	}
	public double obtenerTemperatura () {
		return Temperatura;
	}
	public void establecerTemperatura (double temperatura) {
		Temperatura = temperatura;
	}
	public double obtenerHumedad() {
		return Humedad;
	}
	public void establecerHumedad(double humedad) {
		Humedad = humedad;
	}
	public void establecerPrecipitacion(double precipitacion) {
		Precipitacion = precipitacion;
	}
	public double obtenerPrecipitacion() {
		return Precipitacion;
	}
	public double obtenerViento () {
		return Viento;		
	}
	public void establecerViento (double viento) {
		Viento = viento;
	}
	public double obtenerRadiacion() {
		return Radiacion;
	}
	public void establecerRadiacion(double radiacion) {
		Radiacion = radiacion;
	}
	public int obtenerIdEstacion() {
		return idEstacion;
	}
	public void establecerIdEstacion(int IDEstacion) {
		idEstacion = IDEstacion;
	}
	public int obtenerIdUsuario() {
		return idUsuario;
	}
	public void establecerIdUsuario(int IDUsuario) {
		idUsuario = IDUsuario;
	}
	public double registrarTemperatura() {											//Este método se puede utilizar a futuro, verifica los valores ingresados
		double temp = obtenerTemperatura();
		try {
			if (temp > 0 && temp < 100) {
				System.out.println ("Se ha registrado la temperatura correctamente");
			}
		}catch (IllegalArgumentException e) {
			System.out.println ("Ingresa un valor valido");
		}
		return temp;
	}
}

