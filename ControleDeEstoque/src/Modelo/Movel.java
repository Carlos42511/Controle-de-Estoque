package Modelo;

/**	Classe Movel para representar informações sobre moveis!
 * 
 * @author Carlos Henrique
 * @author André João
 * @author Sunamita Vitória
 * 
 * @version 1.0
 */

public class Movel extends Item {
	
	/*
	* Variáveis de instância públicas para armazenar informações sobre 
	* tipodemadeira.
	*/
	
	private String tipodemadeira;

	/*
	 * Construtores da classe Movel 
	 */
	
	public Movel(String nomeitem, String cor, String marca, String modelo, double datadefabricação, double valorproduto,
			int codigoproduto, int quantidadeproduto, String tipodemadeira) {
		super(nomeitem, cor, marca, modelo, datadefabricação, valorproduto, codigoproduto, quantidadeproduto);
		this.tipodemadeira = tipodemadeira;
	}
	
	public Movel() {
		
	}

	/*
	 * Construtores da Classe movel para poder Puxar e Manipular os 
	 * dados la de Item por isso Coloquei Protected na Classe Item.
	 */
	
	public Movel(String nomeitem, String cor, String marca, String modelo, double datadefabricação, double valorproduto,
			int codigoproduto, int quantidadeproduto) {
		
		super();
		this.nomeitem = nomeitem;
		this.cor = cor;
		this.marca = marca;
		this.modelo = modelo;
		this.datadefabricação = datadefabricação;
		this.valorproduto = valorproduto;
		this.codigoproduto = codigoproduto;
		this.quantidadeproduto = quantidadeproduto;
		
	}

	public void nomeitem() {
		
	}
	
	public void cor() {
		
	}
	
	public void marca() {
		
	}
	
	public void modelo() {
		
	}

	public void datadefabricação() {
		
	}
	
	public void valorproduto() {
		
	}
	
	public void codigoproduto() {
		
	}
	
	public void quantidadeproduto() {
		
	}
	
	
	/*
	 * Gets e Sets da Classe
	 */
	
	public String getTipodemadeira() {
		return tipodemadeira;
	}

	public void setTipodemadeira(String tipodemadeira) {
		this.tipodemadeira = tipodemadeira;
	}

	/*
	 *To String da Classe onde Estou ultilizando 
	 *para manipular os dados na list direto. 
	 */
	
	public String toString() {
		return "Produto: " + this.getNomeitem() + "\nMarca:" + this.getMarca() + "\nCor :" + this.getCor() 
		+ "\nNome específico: " + this.getModelo() + "\nData De Fabricacao: " + this.getDatadefabricação()
		+ "\nCodigo:" + this.getCodigoproduto() + "\nquantidade: " + this.getQuantidadeproduto() + "\nvalor R$"
		+ this.getValorproduto() + "\n\n";
	}
	
}
