package consultorio;

import java.util.ArrayList;
import java.util.Scanner;

public class ColecaoMedicos {
	ArrayList<Medico> Medicos = new ArrayList<>(); /**Cole��o de m�dicos*/
	/**M�todo que adiciona um m�dico na cole��o de m�dicos*/
	public void adicionaMedico(){
		System.out.println("Digite o nome do m�dico: ");
		Scanner teclado = new Scanner(System.in);
		String nomeMed = teclado.nextLine();
		
		System.out.println("Digite o CRM: ");
		String crm = teclado.nextLine();
	
		System.out.println("Digite a especialidade");
		String especialidade = teclado.nextLine();

		Medicos.add(new Medico(nomeMed, crm, especialidade));
	}
	/**M�todo que pesquisa m�dicos pelo CRM*/
	public void pesquisaPeloCRM(){
		if(Medicos.isEmpty()){
			System.out.println("A listal de m�dicos est� vazia");
			return;
		}
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o CRM para pesquisar o M�dico: ");
		String pesquisaCRM = teclado.nextLine();
		for(Medico m: Medicos){
			if(pesquisaCRM.equals((m.getCrm()))){
				System.out.println(m);
				return;
			}else{
				System.out.println("m�dico n�o encontrado");
			}
		}
	}

	
	/**M�todo que pesquisa m�dicos por parte do nome*/
	public void pesquisaPorParteDoNome(){
		if(Medicos.isEmpty()){
			System.out.println("A lista de m�dicos est� vazia.");
			return;
		}
		System.out.println("Digite o nome do M�dico para a pesquisa: ");
		Scanner teclado = new Scanner(System.in);
		String pesquisaNome = teclado .nextLine();
		for(Medico m: Medicos){
			if(m.getNome().contains(pesquisaNome)){
				System.out.println(m);
				return;
			}else{
				System.out.println("m�dico n�o encontrado");
			}
		}
	}
	
}
