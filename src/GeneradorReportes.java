public class GeneradorReportes extends Reporte {													//Aplicando herencia (GeneradorReporte extiende de la clase padre Reporte)
	private int idReporte;																			//Definición de atributos
	private String NombreDeReporte;
	
	public int obtenerIdReporte () {																//Definición de métodos constructores
		return idReporte;
	}
	
	public void establecerIdReporte(int IDReporte) {
		idReporte = IDReporte;
	}
	
	public String obtenerNombreDeReporte () {
		return NombreDeReporte;
	}
	
	public void establecerNombreDeReporte (String nombreDeReporte) {
		NombreDeReporte = nombreDeReporte;
	}
}
