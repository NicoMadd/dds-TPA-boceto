import java.time.LocalDate;
import java.util.List;

public class Operacion {
	LocalDate fecha;
	List<Item> items;
	public Operacion() {
		this.fecha = LocalDate.now();
	}

}
