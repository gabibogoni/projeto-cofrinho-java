package empresa;

public class Real extends Moeda{
	
	public void info() {
		System.out.println("Moeda em real");
	}
	
	public double converter() {
		return this.valor;
	}
	
	public Real() {
		
	}

	public Real(double valor) {
		super(valor);
	}

	@Override
	public String toString() {
		return "Real [valor: R$" + valor + "]";
	}
	
	

}
