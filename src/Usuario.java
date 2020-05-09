


abstract public class Usuario {
	/* String es una mierda, no se puede guardar como solo texto, mi solucion es que sea una clase Contraseña la cual tenga un string,peeeero hasheado en
	   ya sea MD5, SHA-1, SHA-6. Tambien habria que validarla o en el constructor y tire exception o al momento en que se llame. Convendria implementar una
	   inyeccion de dependencia con el hashing? mucho quilombo? innecesario? hasta donde llega nuestro alcance con la seguridad? (mandar mail al rasta)
	   
	   *El constructor se puede definir aca o no? yo la deje en abstract ya que no podria ser una instancia.
	*/
	private String usuario;	
	private String contrasenia;
	
	public Usuario(String usuario, String contrasenia) {
		
		this.usuario = usuario;
		this.contrasenia = contrasenia;
	}

}
