
abstract public class EntidadJuridica extends Entidad{
	
	String razonSocial;
	Integer cuitcuil;
	String nombreFicticio;
	Integer codigoIGJ;
	
	@Override
	public String descripcion() {
		return razonSocial;
	}

	@Override
	public Integer identificador() {
		return cuitcuil;
	}
	

}
