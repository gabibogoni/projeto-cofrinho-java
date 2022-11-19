package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int escolhaOpcao;
		Scanner dados = new Scanner(System.in);
		Cofrinho cofrinho = new Cofrinho();
		Dolar dolar = new Dolar();
		Euro euro = new Euro();
		
		dolar.info();
		euro.info();
		
		System.out.println("Menu");
		System.out.println("1. Adicionar moeda");
		System.out.println("2. Remover moeda");
		System.out.println("3. Listar moedas");
		System.out.println("4. Calcular total convertido para Real");
		System.out.println("0. Encerrar");		
		escolhaOpcao = dados.nextInt();
		
		int tipoMoeda, valor;
		Moeda moeda;
		
		while(escolhaOpcao != 0) {
			switch(escolhaOpcao) {	
			
			case 1:				
				tipoMoeda = 0;
				
				while(tipoMoeda > 3 || tipoMoeda <= 0) {
					System.out.println("1. Dólar");
					System.out.println("2. Euro");
					System.out.println("3. Real");
					tipoMoeda = dados.nextInt();
				}
				
				System.out.println("Qual valor você quer adicionar? ");
				valor = dados.nextInt();
				
				moeda = null;
				if(tipoMoeda == 1) {
					moeda = new Dolar(valor);
				}
				
				if(tipoMoeda == 2) {
					moeda = new Euro(valor);
				}
				
				if(tipoMoeda == 3) {
					moeda = new Real(valor);
				}
				
				cofrinho.adicionar(moeda);
					
				break;
				
			case 2:
				tipoMoeda= 0;
				
				while(tipoMoeda > 3 || tipoMoeda <= 0) {
					System.out.println("1. Dólar");
					System.out.println("2. Euro");
					System.out.println("3. Real");
					tipoMoeda = dados.nextInt();
				}
				
				System.out.println("Qual valor você quer remover? ");
				 valor = dados.nextInt();
				
				moeda = null;
				if(tipoMoeda == 1) {
					moeda = new Dolar(valor);
				}
				
				if(tipoMoeda == 2) {
					moeda = new Euro(valor);
				}
				
				if(tipoMoeda == 3) {
					moeda = new Real(valor);
				}
				
				cofrinho.remover(moeda);
				break;
				
			case 3:
				cofrinho.listagemMoedas();
				break;
			
			case 4:
				double valorTotalConvertido = cofrinho.totalConvertido();
				System.out.println("Valor total convertido: R$" + valorTotalConvertido);
				break;
				
			case 0:
				break;
			
			default:
				System.out.println("Opção inválida!");
			}	
			
			System.out.println("Menu");
			System.out.println("1. Adicionar");
			System.out.println("2. Remover");
			System.out.println("3. Listar");
			System.out.println("4. Calcular total convertido para Real");
			System.out.println("0. Encerrar");		
			escolhaOpcao = dados.nextInt();
		}	
		
		
		
		
		
		
	}

}
