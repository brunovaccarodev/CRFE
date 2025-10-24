
public class Login {
	private String Usuario;
	private String Contraseña;
	private boolean esAutenticado;
	
	public String obtenerUsuario() {
		return Usuario;
	}
	
	public void establecerUsuario(String nombreDeUsuario) {
		Usuario = nombreDeUsuario;
	}
	
	public String obtenerContraseña () {
		return Contraseña;
	}
	
	public void establecerContraseña (String contraseña) {
		Contraseña = contraseña;
	}
	
	public boolean esAutenticado() {
		return esAutenticado;
	}
	
}
