
abstract public class Tarjeta implements MedioDePago{
	
	//Capaz en vez de ser un abstract podria ser un interface, pero como comparten atributos lo pense asi;
	Integer numero;
	EntidadBase titular;
}
