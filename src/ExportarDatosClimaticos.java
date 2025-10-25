/*
Autor: Bruno Vaccaro
*/
public class ExportarDatosClimaticos {															//Definción de clase
	private String Formato;																		//Definción de atributos
	private String RutaDestino;
	private int idUsuario;
	
	public String obtenerFormato() {															//Definición de métodos constructores
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

