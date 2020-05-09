
abstract public class EntidadBase extends Entidad {
	String nombre;
	String apellido;
	Integer dni;
	EntidadJuridica entidadJuridica; // se refiere a una EMPRESA(EJ) a la que pertenece. En el enunciado aclara que una EMPRESA puede NO tener EMPLEADOS(EB),
									 // y que un EMPLEADO puede pertenecer solo a una EMPRESA;
	@Override
	public String descripcion() {
		return nombre + " " + apellido;
	}

	@Override
	public Integer identificador() {
		return dni;
	}
	

}
