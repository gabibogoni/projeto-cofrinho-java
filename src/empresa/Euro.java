package empresa;

public class Euro extends Moeda{
	
	public void info() {
		System.out.println("Moeda em euro");
		System.out.println("Cotação hoje €5,57 ");
		System.out.println();
	}
	
	public double converter() {
		return this.valor * 5.57;
	}

		
	public Euro(){
		
	}
	
	public Euro(double valor) {
		super(valor);
	}

	@Override
	public String toString() {
		return "Euro [valor: €" + valor + "]";
	}
	
	

}
