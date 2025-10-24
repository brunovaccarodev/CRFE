
public class UnidadesMedida {
	private int IdUnidades;
	private int UsuarioID;
	private double Temperatura;
	private double Humedad;
	private double Precipitacion;
	private double Viento;
	private double Radiacion;
	
	public int obtenerIdUnidades () {
		return IdUnidades;
	}
	
	public void establecerIdUnidades (int IDUnidades) {       //Ver si es necesario
		IdUnidades = IDUnidades;
	}
	
	public int obtenerUsuarioID () {
		return UsuarioID;
	}
	
	public void establecerUsuarioID(int usuarioID) {			//Ver si es necesario
		UsuarioID = usuarioID;		
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
	
	public double obtenerPrecipitacion() {
		return Precipitacion;
	}
	
	public void establecerPrecipitacion(double precipitacion) {
		Precipitacion = precipitacion;
	}
	
	public double obtenerViento() {
		return Viento;
	}
	
	public void establecerViento(double viento) {
		Viento = viento;
	}
	
	public double obtenerRadiacion() {
		return Radiacion;
	}
	
	public void establecerRadiacion(double radiacion) {
		Radiacion = radiacion;
	}
	
	

}
