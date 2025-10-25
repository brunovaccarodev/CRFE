/*
Autor: Bruno Vaccaro
*/
public class EstadisticasClimaticas extends DatoClimatico {															//Esta clase es hija de la clase DatoClimatico (Aplicando herencia)
	private int IdEstadisticas;																						//Definicion de atributos
	private String FechaDeIncio;
	private String FechaDeFin;
	private int IdEstacion;
	private double TemperaturaPromedio;
	private double HumedadPromedio;
	private double PrecipitacionPromedio;
	private double VelocidadVientoPromedio;
	private double RadiacionPromedio;
	
	public int obtenerIdEstadisticas() {																			//Definicion de metodos constructores
		return IdEstadisticas;
	}
	
	public void establecerIdEstadisticas(int IDEstadisticas) {
		IdEstadisticas = IDEstadisticas;
	}
	
	/* public String obtenerFechaDeInicio() {																		Métodos comentados para futura implementación
		return FechaDeIncio;
	}
	
	public void establecerFechaDeInicio(String fechaDeInicio) {
		FechaDeIncio = fechaDeInicio;
	}
	
	
	public String obtenerFechaDeFin () {
		return FechaDeFin;
	}
	
	public void establecerFechaDeFin (String fechaDeFin) {
		FechaDeFin = fechaDeFin;
	}
	
	public int obtenerIdEstacion () {
		return IdEstacion;
	}
	
	public void establecerIdEstacion(int IDEstacion) {
		IdEstacion = IDEstacion;
	}
	
	*/
	
	public double obtenerTemperaturaPromedio() {
		return TemperaturaPromedio;
	}
	
	public void establecerTemperaturaPromedio(double temperaturaPromedio) {
		TemperaturaPromedio = temperaturaPromedio;
	}
	
	public double obtenerHumedadPromedio() {
		return HumedadPromedio;
	}
	
	public void establecerHumedadPromedio(double humedadPromedio) {
		HumedadPromedio = humedadPromedio;
	}
	
	public double obtenerPrecipitacionPromedio() {
		return PrecipitacionPromedio;
	}
	
	public void establecerPrecipitacionPromedio(double precipitacionPromedio) {
		PrecipitacionPromedio = precipitacionPromedio;
	}
	
	public double obtenerVelocidadVientoPromedio() {
		return VelocidadVientoPromedio;
	}
	
	public void establecerVelocidadVientoPromedio(double velocidadVientoPromedio) {
		VelocidadVientoPromedio = velocidadVientoPromedio;
	}
	
	public double obtenerRadiacionPromedio() {
		return RadiacionPromedio;
	}
	
	public void establecerRadiacionPromedio (double radiacionPromedio) {
		RadiacionPromedio = radiacionPromedio;
	}
}

