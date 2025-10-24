
public class ExportarDatosClimaticos {
	private String Formato;
	private String RutaDestino;
	private int idUsuario;
	
	public String obtenerFormato() {
		return Formato;
	}
	
	public void establecerFormato(String formato) {
		Formato = formato;
	}
	
	public String obtenerRutaDestino() {
		return RutaDestino;
	}
	
	public void establecerRutaDestino(String rutaDestino) {
		RutaDestino = rutaDestino;
	}
	
	public int obtenerIdUsuario () {
		return idUsuario;
	}
	
	public void establecerIdUsuario (int IDUsuario) {
		idUsuario = IDUsuario;
	}
}
