
public class GeneradorReportes extends Reporte {
	private int idReporte;
	private String NombreDeReporte;
	
	public int obtenerIdReporte () {
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
