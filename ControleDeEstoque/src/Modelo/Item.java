package Modelo;

/**	Classe item para representar informações sobre itens!
 * 
 * @author Carlos Henrique
 * @author André João
 * @author Sunamita Vitória
 * 
 * @version 1.0
 */

public abstract class Item {
	
	/*
	* Variáveis de instância públicas para armazenar informações sobre 
	* nomeitem, cor, marca, modelo, datadefabricação, valorproduto,
	* codigoproduto, quantidadeproduto.
	*/  
	
	/*
	 * Estou usando Protected pois assim consigo 
	 * puxar os dados de Moveis e Eletronicos.
	 */
	
	protected String nomeitem;
	protected String cor;
	protected String marca;
	protected String modelo;
	protected double datadefabricação;
	protected double valorproduto;
	protected int codigoproduto;
	protected int quantidadeproduto;
	
	/*
	* Construtor para inicializar as variáveis de 
	* instância com os valores fornecidos como argumentos.
	*/
	
	public Item(String nomeitem, String cor, String marca, String modelo, double datadefabricação, double valorproduto,
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

	public Item() {
		
	}

	/*
	 * Gets e Sets da Classe
	 */
	
	public String getNomeitem() {
		return nomeitem;
	}
	public void setNomeitem(String nomeitem) {
		this.nomeitem = nomeitem;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getDatadefabricação() {
		return datadefabricação;
	}
	public void setDatadefabricação(double datadefabricação) {
		this.datadefabricação = datadefabricação;
	}
	public double getValorproduto() {
		return valorproduto;
	}
	public void setValorproduto(double valorproduto) {
		this.valorproduto = valorproduto;
	}
	public int getCodigoproduto() {
		return codigoproduto;
	}
	public void setCodigoproduto(int codigoproduto) {
		this.codigoproduto = codigoproduto;
	}
	public int getQuantidadeproduto() {
		return quantidadeproduto;
	}
	public void setQuantidadeproduto(int quantidadeproduto) {
		this.quantidadeproduto = quantidadeproduto;
	}
	
	public abstract void nomeitem();
	public abstract void cor();
	public abstract void marca();
	public abstract void modelo();
	public abstract void datadefabricação();
	public abstract void valorproduto();
	public abstract void codigoproduto();
	public abstract void quantidadeproduto();
		

	/*
	 * To String da classe onde nao estou usando no momento.
	 */
	
	public String toString() {
		return "";
	}
	
}
