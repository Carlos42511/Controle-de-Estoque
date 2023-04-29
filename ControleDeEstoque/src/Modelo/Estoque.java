package Modelo;

import java.util.LinkedList;
import java.util.List;

/**	Classe Estoque para representar informações sobre estoque e seus produtos!
 * 
 * @author Carlos Henrique
 * @author André João
 * @author Sunamita Vitória
 * 
 * @version 1.0
 */

public class Estoque {
	
	/*
	* Variáveis de instância públicas para armazenar informações sobre 
	* empilhadeiradisponivel, caminhaoDentro.
	*/ 
	
	private int empilhadeiradisponivel;
	private int caminhaoDentro;
	
	/*
	 * LinkedList da Classe Item onde ela 
	 * agrega os dados da classe Estoque.
	 */
	
	private List<Item> itens = new LinkedList<Item>();

	/*
	 * Construtores da Classe Estoque Junto com Construtor da List.
	 */
	
	public Estoque(int empilhadeiradisponivel, int caminhaoDentro, List<Item> itens) {
		super();
		this.empilhadeiradisponivel = empilhadeiradisponivel;
		this.caminhaoDentro = caminhaoDentro;
		this.itens = itens;
	}
	
	/*
	 * Construtores apenas da classe Estoque onde 
	 * Consigo Puxar os dados Direto na Main.
	 */
	
	public Estoque(int empilhadeiradisponivel, int caminhaoDentro) {
		super();
		this.empilhadeiradisponivel = empilhadeiradisponivel;
		this.caminhaoDentro = caminhaoDentro;
		
	}

	/*
	 * Gets e Sets Junto com da List Tambem.
	 */
	
	public int getEmpilhadeiradisponivel() {
		return empilhadeiradisponivel;
	}

	public void setEmpilhadeiradisponivel(int empilhadeiradisponivel) {
		this.empilhadeiradisponivel = empilhadeiradisponivel;
	}

	public int getCaminhaoDentro() {
		return caminhaoDentro;
	}

	public void setCaminhaoDentro(int caminhaoDentro) {
		this.caminhaoDentro = caminhaoDentro;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}
	
	/*
	 * Criei o Metodo adicionaItens pra ficar 
	 * mais facil de add os itens na lista.
	 */
	
	public void adicionaItens(Item itens) {
		this.itens.add(itens);
	}

	/*
	 * To String da classe Estoque onde 
	 * nao estou Usando no Momento.
	 */
	
	public String toString() {
		return "";
	}
	
}
