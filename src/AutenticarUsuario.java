
public class AutenticarUsuario {
	private String Usuario;
	private String Contraseña;
	private int IntentosFallidos;
	private String FechaUltimoLogin;
	private String RolUsuario;
	private boolean esAutenticado;
	
	public String obtenerUsuario() {
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
	
	public void establecerFechaUltimoLogin (String fechaUltimoLogin) {						//Ver si es necesario
		FechaUltimoLogin = fechaUltimoLogin;
	}
	
	public String obtenerRolUsuario() {
		return RolUsuario;
	}
	
	public void establecerRolUsuario(String rolUsuario) {										//Ver si es necesario
		RolUsuario = rolUsuario;
	}
	
	public boolean esAutenticado() {
		return esAutenticado;
	}
}
