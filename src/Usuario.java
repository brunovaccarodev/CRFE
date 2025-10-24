
public class Usuario {
	private int idUsuario;
	private String Nombre;
	private String Apellido;
	private String CorreoElectronico;
	private String Contraseña;
	private String Rol;
	private String Estado;
	private String FechaRegistro;                                                           /*Ver Diagrama */
 	
	public int obtenerIdUsuario() {
		return idUsuario;
	}
	
	public void establecerIdUsuario(int IDUsuario) {
		idUsuario = IDUsuario;
	}
	
	public String obtenerNombre() {
		return Nombre;
	}
	
	public void establecerNombre(String nombre) {
		Nombre = nombre;
	}
	
	public String obtenerApellido() {
		return Apellido;
	}
	
	public void establecerApellido(String apellido) {
		Apellido = apellido;
	}
	
	public String obtenerCorreoElectronico() {
		return CorreoElectronico;
	}
	
	public void establecerCorreoElectronico(String correo) {
		CorreoElectronico = correo;
	}
	
	public String obtenerContraseña() {
		return Contraseña;
	}
	
	public void establecerContraseña(String contraseña) {
		Contraseña = contraseña;
	}
	
	public String obtenerRol() {
		return Rol;
	}
	
	public void establecerRol(String rol) {
		Rol = rol;
	}
	
	public String obtenerEstado() {
		return Estado;
	}
	
	public void establecerEstado(String estado) {
		Estado = estado;
	}
	
	public String obtenerFechaRegistro() {
		return FechaRegistro;
	}
	
	public void establecerFechaRegistro(String fecha) {
		FechaRegistro = fecha;
	}
}
