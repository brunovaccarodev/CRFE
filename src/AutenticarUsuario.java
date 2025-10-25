public class AutenticarUsuario {																//Definción de clase
	private String Usuario;																		//Definición de atributos
	private String Contraseña;
	private int IntentosFallidos;
	private String FechaUltimoLogin;
	private String RolUsuario;
	private boolean esAutenticado;
	
	public String obtenerUsuario() {															//Definción de métodos constructores
		return Usuario;
	}
	public void EstablecerUsuario(String usuario) {
		Usuario = usuario;
	}
	public String obtenerContraseña () {
		return Contraseña;
	}
	public void establecerContraseña (String contraseña) {
		Contraseña = contraseña;
	}
	public int obtenerIntentosFallidos() {
		return IntentosFallidos;
	}
	public void establecerIntentosFallidos(int intentosFallidos) {
		IntentosFallidos = intentosFallidos;
	}
	public String obtenerFechaUltimoLogin() {
		return FechaUltimoLogin;
	}
	public void establecerFechaUltimoLogin (String fechaUltimoLogin) {						
		FechaUltimoLogin = fechaUltimoLogin;
	}
	public String obtenerRolUsuario() {
		return RolUsuario;
	}
	public void establecerRolUsuario(String rolUsuario) {									
		RolUsuario = rolUsuario;
	}
	public boolean esAutenticado() {															//Método para realizar verificación de autenticación con base de datos
		return esAutenticado;
	}
}
