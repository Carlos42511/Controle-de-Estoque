package Modelo;

/**	Classe Filiais para representar informações sobre filial!
 * 
 * @author Carlos Henrique
 * @author André João
 * @author Sunamita Vitória
 * 
 * @version 1.0
 */

public class Filial {

	/*
	* Variáveis de instância públicas para armazenar informações sobre 
	* nome, endereço.
	*/
	
	private String nome;
	private String endereço;
	private String estado;
	
	/*
	 * Construtores da Classe Filial
	 */
	
	public Filial(String nome, String endereço, String estado) {
		super();
		this.nome = nome;
		this.endereço = endereço;
		this.estado = estado;
	}

	/*
	 * Gets e Sets
	 */
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereço() {
		return endereço;
	}
	public void seEndereço(String endereço) {
		this.endereço = endereço;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	/*
	 * To String da Classe Filial onde estou usando para manipular 
	 * os dados que vao aparecer por causa da List de Empresa ja que
	 *  as duas sao agregaçoes.
	 */
	
	public String toString() {
		return "Filial: " + this.getNome() + "\nEndereço: " + this.getEndereço() +"\n" + "Estado:" + this.getEstado() + "\n";
	}
	
}
