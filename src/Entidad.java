
abstract public class Entidad {
	/*
	 * descripcion : atiende la relacion de Razon Social (persona juridica) o Nombre y apellido (persona fisica)
	 * identificador: atiende la relacion de CUIT/CUIT o DNI;
	 *
	 * me parece que hay un poco de repeticion de codigo en las sub clases, la verdad no se si esta bien pero es una opcion
	 *
	 */
	
	//String identificador();
	
	protected Integer direccionPostal;
	abstract public String descripcion();
	abstract public Integer identificador();

}
