public class Login {																				//Definición de clase
	private String Usuario;																			//Definición de atributos
	private String Contraseña;
	private boolean esAutenticado;
	
	public String obtenerUsuario() {																//Definición de métodos constructores
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
