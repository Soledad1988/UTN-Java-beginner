package clase6;

import java.time.LocalDateTime;

public class Compra {

	private LocalDateTime fechaCompra;
	private ItemCompra[] items;

	public Compra() {
		this.fechaCompra=LocalDateTime.now();
		this.items = new ItemCompra[10];
	
	}
	
	public Compra(LocalDateTime fechaCompra, ItemCompra[] items) {
		this.fechaCompra = fechaCompra;
		this.items = items;
	}
	
	//metodos getter y setter
	public LocalDateTime getFechaCompra() {
		return fechaCompra;
	}
	public void setFechaCompra(LocalDateTime fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	public ItemCompra[] getItems() {
		return items;
	}
	public void setItems(ItemCompra[] items) {
		this.items = items;
	}

	
	public double total() {
		double total = 0;
		
		for(int i=0;i<2;i++) {
			ItemCompra item = items[i];
			
			total += item.calcularSubtotal();
			
			total = total + item.calcularSubtotal();
		}
		
		return total;
	}
}
