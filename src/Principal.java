import javax.swing.JOptionPane;

public class Principal {																			//Definción de la clase
	public static void main (String [] args) {														//Definición de método main
		/*
		Creando objetos
		*/
		UnidadesMedida unidadesMedida = new UnidadesMedida();			
		ConfigurarUnidadesMedida configurarUnidadesMedida = new ConfigurarUnidadesMedida();
		DatoClimatico datoClimatico = new DatoClimatico();
		EstacionMeteorologica estacionMeteorologica = new EstacionMeteorologica();
		EstadisticasClimaticas estadisticasClimaticas = new EstadisticasClimaticas();
		ExportarDatosClimaticos exportarDatosClimaticos = new ExportarDatosClimaticos();
		GeneradorReportes generadorReportes = new GeneradorReportes();
		Login login = new Login();
		Reporte reporte = new Reporte();
		Usuario usuario = new Usuario();
		
		/*
		Instanciamiento de clases y llamadas a métodos del proyecto
		*/
		
		double temperaturaCelsius = configurarUnidadesMedida.convertirUnidadTemperaturaCelsius(14);
		double temperaturaFahrenheit = configurarUnidadesMedida.convertirUnidadTemperaturaFahrenheit(89);
		unidadesMedida.establecerTemperatura(15);
		datoClimatico.establecerIdDato(1);
		datoClimatico.establecerViento(15);
		datoClimatico.establecerRadiacion(8);
		usuario.establecerNombre("Juan");
		usuario.establecerApellido("Rodriguez");
		usuario.establecerFechaRegistro("16-10-2025");
		estadisticasClimaticas.establecerPrecipitacionPromedio(28.0);
		estacionMeteorologica.establecerFechaDeInstalacion("15-10-2025");
		exportarDatosClimaticos.establecerRutaDestino("C:/Users/juan/Escritorio");
		generadorReportes.establecerIdReporte(100);
		generadorReportes.establecerNombreDeReporte("Datos Climaticos_17-10-2025.pdf");
		reporte.establecerFechaDeCreacion("20-10-2025");
		
		boolean activa = estacionMeteorologica.esActiva();
		String fechaEstacion = estacionMeteorologica.obtenerFechaDeInstalacion();
		int IDDato = datoClimatico.obtenerIdDato();
		double viento = datoClimatico.obtenerViento();
		double temp = unidadesMedida.obtenerTemperatura();
		datoClimatico.establecerRadiacion(8);
		double UV = datoClimatico.obtenerRadiacion();
		String nombreUsuario = usuario.obtenerNombre() + " " + usuario.obtenerApellido();
		String fechaUsuario = usuario.obtenerFechaRegistro();
		double precipitacionPromedio = estadisticasClimaticas.obtenerPrecipitacionPromedio();
		String ruta = exportarDatosClimaticos.obtenerRutaDestino();
		int IDReporte = generadorReportes.obtenerIdReporte();
		String nombreReporte = generadorReportes.obtenerNombreDeReporte();
		boolean autenticacion = login.esAutenticado();
		String fechaDeReporte = reporte.obtenerFechaDeCreacion();
		/* 
		Verificación de funcionamiento por consola
		*/
		System.out.println("La conversion de grados Celsius a Fahrenheit es: : " + temperaturaCelsius);
		System.out.println ("La conversion de grados Fahrenheit a Celsius es: " + temperaturaFahrenheit);
		System.out.println ("El IDDato es: " + IDDato);
		System.out.println ("La velocidad del viento es: " + viento);
		System.out.println ("El indice de UV es: " + UV);
		System.out.println ("La estacion meteorologica se encuentra en valor booleano: " + activa);
		System.out.println ("La estacion meteorologica ha sido instalada el dia: " + fechaEstacion);
		System.out.println ("El usuario" + " " + nombreUsuario + " se ha creado en la fecha: " + fechaUsuario);
		System.out.println ("La precipitacion promedio en la zona es de: " + precipitacionPromedio );
		System.out.println ("Se exporto el archivo a la ruta: " + ruta);
		System.out.println ("Se ha generado el reporte con el ID : " + IDReporte + " con nombre: " + nombreReporte + " en la fecha: " + fechaDeReporte);
		System.out.println ("El valor booleano que resulta de la autenticacion es: " + autenticacion);
	}
}
