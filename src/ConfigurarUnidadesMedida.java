import javax.swing.JOptionPane;

public class ConfigurarUnidadesMedida extends UnidadesMedida {        							//La clase ConfigurarUnidadesMedida es hija de la superclase (o padre) UnidadesMedida
	private double UnidadTemperatura;															//Definicion de atributos
	private double UnidadHumedad;
	private double UnidadPrecipitacion;
	private double UnidadViento;
	private double UnidadRadiacion;
	
	public double obtenerUnidadTemperatura () {													//Definicion de metodos constructores
		return UnidadTemperatura;
	}
	
	public void establecerUnidadTemperatura(double unidadTemperatura) {
		UnidadTemperatura = unidadTemperatura;
	}
	
	public double obtenerUnidadHumedad () {
		return UnidadHumedad;
	}
	
	public double obtenerUnidadPrecipitacion() {
		return UnidadPrecipitacion;
	}
	
	public void establecerUnidadPrecipitacion (double unidadPrecipitacion) {
		UnidadPrecipitacion = unidadPrecipitacion;
	}
	
	public double obtenerUnidadViento() {
		return UnidadViento;
	}
	
	public void establecerUnidadViento (double unidadViento) {
		UnidadViento = unidadViento;
	}
	
	public double obtenerUnidadRadiacion() {
		return UnidadRadiacion;
	}
	
	public void establecerUnidadRadiacion(double unidadRadiacion) {
		UnidadRadiacion = unidadRadiacion;
	}
	
/*	public boolean esCelsius(boolean t) {															Esta funcion queda comentada para la posible implementacion de la interfaz grafica
		boolean esCelsius = false;
		if (t == true) {
			esCelsius = true;		
		}
		else {
			esCelsius = false;
		}
		return esCelsius;
		
	}
*/
/*
	public boolean esFahrenheit(boolean t) {														Esta funcion queda comentada para la posible implementacion de la interfaz grafica
		boolean esFahrenheit = false;
		if (t == true) {
			esFahrenheit = true;		
		}
		else {
			esFahrenheit = false;
		}
		return esFahrenheit;
		
	}
*/	
	public double convertirUnidadTemperaturaCelsius (double valorDouble) {              			//Funcion que convierte la temperatura de grados celsius a Fahrenheit
		double temperaturaCelsius = 0;
		
		try{
			temperaturaCelsius = (valorDouble * 9/5) + 32;
		} catch (NumberFormatException e) {
			System.out.println ("Por favor ingresa un valor valido");
		}
		return temperaturaCelsius;
	}
	
	public double convertirUnidadTemperaturaFahrenheit (double temperaturaF) {                     //Funcion que convierte la temperatura de grados Fahrenheit a celsius 
		double temperaturaFahrenheit = 0;
		try {
			temperaturaFahrenheit = (temperaturaF - 32 ) * 5/9;															
		} catch (NumberFormatException e) {
			System.out.println ("Por favor ingresa un valor valido");
		}
		return temperaturaFahrenheit;
	}
}
