package Visão;

/*	Classe Pricipal para representar informações sobre tudo!
 * 
 * @author Carlos Henrique
 * @author André João
 * @author Sunamita Vitória
 * 
 * @version 1.0
 */

import Modelo.Eletronico;
import Modelo.Empresa;
import Modelo.Estoque;
import Modelo.Filial;
import Modelo.Movel;


public class Principal {

	public static void main(String[] args) {
	
		/*
		 * Estou puxando os dados da lista de dentro de um linkedList 
		 * que esta na classe Empresa ja que a Classe Empresa tem agregação com Filial
		 * onde eu puxo os dados direto de la com com comando "adicionaFilial".
		 */
		Empresa filiais = new Empresa("Empresa : CHSB", "Endereco: Rua Padre Antonio de Melo 279", 8489333);
		
		filiais.adicionaFilial(new Filial("CHSB3", "Rua Padre Antonio de Melo 254","Em uso"));
		filiais.adicionaFilial(new Filial("CHSB2", "Rua Padre Antonio de Melo 245", "vazia"));
		
		System.out.println(filiais.getNome());
		System.out.println(filiais.getEndereço());
		System.out.println("CNPJ: " + filiais.getCnpj() + "\n");
		
	
		System.out.println(filiais.getFiliais());
		
		/*
		 * Estou puxando os dados da lista de dentro de um linkedList 
		 * que esta na classe Estqoue ja que a Classe Estoque tem agregação com Item.
		 */
		
		Estoque itens = new Estoque(5, 7);
		
		System.out.println("Caminhoes Dentro: " + itens.getCaminhaoDentro());
		System.out.println("Empilhadeiras Disponiveis: " + itens.getEmpilhadeiradisponivel()+ "\n");
			
		/*
		 * Estou puxando os dados da lista de dentro de um linkedList 
		 * Da classe Movel ja que ela puxa os dados da classe abstrata
		 * Item e depois eu apenas uso o comando adicionarItens que criei
		 * e assim ela lista todos os dados da List.
		 */
		Movel movel = new Movel("Mesa Gamer", "Hyperx", "Marrom Amadeirado", "Mesa", 4.2022, 2501, 58755, 27);
		itens.adicionaItens(movel);
		
		movel.setTipodemadeira("Tipo de Madeira: Mesa de Madeira Rustica");	
		System.out.println(movel.getTipodemadeira() + "\n");
		
		System.out.println(itens.getItens());
		
		/*
		 * Estou puxando os dados da lista de dentro de um linkedList 
		 * da Classe Eletronico so que aqui diferente de Movel eu uso
		 * o comando eletronico.toString porque se eu uso o comando
		 * itens.getItens ele replica os toString das duas classes.
		 */
		Eletronico eletronico = new Eletronico("Notebook ", "Acer ", "Preto ", "Acer Nitro 5 ", 8.2022, 1001, 37340, 15 );
		itens.adicionaItens(eletronico);
		
		System.out.println(eletronico.toString());
		
		eletronico.setEspecificação("Especificacao: Notebook Gamer, I5 10500, GTX 1650TI, 8GB RAM, 1TB");
		System.out.println(eletronico.getEspecificação() + "\n");
		
	
	}

}
