import javax.swing.JOptionPane;																					//Importación de librerías
public class Reporte extends DatoClimatico{																		//Aplicando herencia (Reporte es hija de DatoClimatico)
	private int idReporte;																						//Definición de atributos
	private String Titulo;
	private String Descripcion;
	private String FechaDeCreacion;
	private int IdUsuario;
	private String TipoDeReporte;
	private String FormatoDeExportacion;
	
	public int obtenerIdReporte() {																				//Definición de métodos constructores
		return idReporte;
	}
	public void establecerIdReporte (int IDReporte) {
		idReporte = IDReporte;
		JOptionPane.showMessageDialog(null, "Se ha creado un nuevo archivo." + idReporte);
	}
	public String obtenerTitulo() {                                                                
		return Titulo;
	}
	public void establecerTitutlo( String titulo) {
		Titulo = titulo;
	}
	public String obtenerDescripcion() {
		return Descripcion;
	}
	public void establecerDescripcion( String descripcion) {
		Descripcion = descripcion;
	}
	public String obtenerFechaDeCreacion() {
		return FechaDeCreacion;
	}
	public void establecerFechaDeCreacion( String fechaDeCreacion) {
		FechaDeCreacion = fechaDeCreacion;
	}
	public int obtenerIdUsuario() {
		return IdUsuario;
	}
	public void establecerIdUsuario( int idUsuario) {
		IdUsuario = idUsuario;
	}
	public String obtenerSTipoDeReporte() {
		return TipoDeReporte;
	}
	public void establecerTipoDeReporte( String tipoDeReporte) {
		TipoDeReporte = tipoDeReporte;
	}
	public String FormatoDeExportacion() {
		return FormatoDeExportacion;
	}
	public void establecerFormatoDeExportacion( String formatoDeExportacion) {
		FormatoDeExportacion = formatoDeExportacion;
	}
}
