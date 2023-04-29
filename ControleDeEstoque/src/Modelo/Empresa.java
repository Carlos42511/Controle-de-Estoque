package Modelo;

import java.util.LinkedList;
import java.util.List;

/**	Classe Empresa para representar informações sobre empresa!
 * 
 * @author Carlos Henrique
 * @author André João
 * @author Sunamita Vitória
 * 
 * @version 1.0
 */

public class Empresa {
	
	
	/*
	* Variáveis de instância públicas para armazenar informações sobre 
	* nome, endereço, cnpj.
	*/ 
	
	private String nome;
	private String endereço;
	private double cnpj;
	
	/*
	 * LinkedList De Filial onde ela agrega a classe Empresa.
	 */
	
	private List<Filial> filiais = new LinkedList<Filial>();

	/*
	 * Construtores da classe Empresa junto com o Construtor do List.
	 */
	
	public Empresa(String nome, String endereço, double cnpj, List<Filial> filiais) {
		super();
		this.nome = nome;
		this.endereço = endereço;
		this.cnpj = cnpj;
		this.filiais = filiais;
	}

	/*
	 * Construtores apenas da classe empresa onde puxo 
	 * os dados somente dela sem dar erro na main. 
	 */
	
	public Empresa(String nome, String endereço, double cnpj) {
		super();
		this.nome = nome;
		this.endereço = endereço;
		this.cnpj = cnpj;
	}

	/*
	 * Gets e Sets da classe empresa e da List
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

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public double getCnpj() {
		return cnpj;
	}

	public void setCnpj(double cnpj) {
		this.cnpj = cnpj;
	}

	public List<Filial> getFiliais() {
		return filiais;
	}

	public void setFiliais(List<Filial> filiais) {
		this.filiais = filiais;
	}
	
	/*
	 * Adicionei essa variavel para ficar mais facil 
	 * de adicionar Filial quando eu quiser.
	 */
	
	public void adicionaFilial(Filial filiais) {
		this.filiais.add(filiais);
	}

	/*
	 * To String da classe empresa onde ainda nao precisei Ultilizar.
	 */
	public String toString() {
		return "Empresa [nome=" + nome + ", endereço=" + endereço + ", cnpj=" + cnpj + ", filiais=" + filiais
				+ ", getNome()=" + getNome() + ", getEndereço()=" + getEndereço() + ", getCnpj()=" + getCnpj()
				+ ", getFiliais()=" + getFiliais() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}	
}
