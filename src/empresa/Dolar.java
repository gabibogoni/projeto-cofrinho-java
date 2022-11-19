package empresa;

import java.util.Objects;

public class Dolar extends Moeda{
	
	public void info() {
		System.out.println("Moeda em dólar");
		System.out.println("Cotação hoje $5,38");
		System.out.println();
	}
	
	public double converter() {
		return this.valor * 5.38;
	}
	
	public Dolar(){
		
	}

	public Dolar(double valor) {
		super(valor);
	}

	@Override
	public String toString() {
		return "Dolar [valor: $" + valor + "]";
	}
	
}
