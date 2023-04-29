package Modelo;

/**	Classe Eletronicos para representar informações sobre eletronicos!
 * 
 * @author Carlos Henrique
 * @author André João
 * @author Sunamita Vitória
 * 
 * @version 1.0
 */

public class Eletronico extends Item {

	/*
	* Variáveis de instância públicas para armazenar informações sobre 
	* especificação.
	*/  
	
	private String especificação;

	/*
	 * Construtores da Classe Item onde estou herdando os dados aqui
	 * assim posso ter acesso do jeito que eu quiser.
	 */
	
	public Eletronico(String nomeitem, String cor, String marca, String modelo, double datadefabricação,
			double valorproduto, int codigoproduto, int quantidadeproduto) {
		super(nomeitem, cor, marca, modelo, datadefabricação, valorproduto, codigoproduto, quantidadeproduto);
		this.nomeitem = nomeitem;
		this.cor = cor;
		this.marca = marca;
		this.modelo = modelo;
		this.datadefabricação = datadefabricação;
		this.valorproduto = valorproduto;
		this.codigoproduto = codigoproduto;
		this.quantidadeproduto = quantidadeproduto;
	}

	/*
	 * Construtor de Especificação
	 */
	
	public Eletronico(String especificação) {
		this.especificação = especificação;
	}

	/*
	 * Conjuntos vazios para mostrar que essa classe herda 
	 * da classe Item onde e Abstrata ou seja tenho acesso
	 * a todos os dados da classe Item.
	 */

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
	 * Gets e Sets
	 */
	
	public String getEspecificação() {
		return especificação;
	}

	public void setEspecificação(String especificação) {
		this.especificação = especificação;
	}

	/*
	 * To String da Classe Eletronico onde estou puxando os dados dele no
	 *  LinkedList depois puxando direto na Main Principal!
	 */
	public String toString() {
		return "Produto: " + this.getNomeitem() + "\nMarca:" + this.getMarca() + "\nCor :" + this.getCor() 
		+ "\nNome específico: " + this.getModelo() + "\nData De Fabricacao: " + this.getDatadefabricação()
		+ "\nCodigo:" + this.getCodigoproduto() + "\nquantidade: " + this.getQuantidadeproduto() + "\nvalor R$"
		+ this.getValorproduto();
	}

}
