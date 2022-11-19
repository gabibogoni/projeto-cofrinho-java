package empresa;

import java.util.ArrayList;
import java.util.Objects;

public class Cofrinho {
	private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();
	
	public void adicionar(Moeda moeda) {		
		listaMoedas.add(moeda);
	}
	
	public void remover(Moeda moeda) {
		listaMoedas.remove(moeda);
	}
	
	public void listagemMoedas() {
		for(Moeda moeda : listaMoedas) {
			System.out.println(moeda);
		}
	}
	
	public double totalConvertido() {
		if(this.listaMoedas.isEmpty()) {
			return 0;
		}
		
		double valorAcumulado = 0;
		for(Moeda m : this.listaMoedas) {
			valorAcumulado = valorAcumulado + m.converter();
		}
		
		return valorAcumulado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(listaMoedas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cofrinho other = (Cofrinho) obj;
		return Objects.equals(listaMoedas, other.listaMoedas);
	}
	
	

	
	
	
	
	
	
	
}
