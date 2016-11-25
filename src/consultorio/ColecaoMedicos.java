package consultorio;

import java.util.ArrayList;
import java.util.Scanner;

public class ColecaoMedicos {
	ArrayList<Medico> Medicos = new ArrayList<>(); /**Coleção de médicos*/
	/**Método que adiciona um médico na coleção de médicos*/
	public void adicionaMedico(){
		System.out.println("Digite o nome do médico: ");
		Scanner teclado = new Scanner(System.in);
		String nomeMed = teclado.nextLine();
		
		System.out.println("Digite o CRM: ");
		String crm = teclado.nextLine();
	
		System.out.println("Digite a especialidade");
		String especialidade = teclado.nextLine();

		Medicos.add(new Medico(nomeMed, crm, especialidade));
	}
	/**Método que pesquisa médicos pelo CRM*/
	public void pesquisaPeloCRM(){
		if(Medicos.isEmpty()){
			System.out.println("A listal de médicos está vazia");
			return;
		}
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o CRM para pesquisar o Médico: ");
		String pesquisaCRM = teclado.nextLine();
		for(Medico m: Medicos){
			if(pesquisaCRM.equals((m.getCrm()))){
				System.out.println(m);
				return;
			}else{
				System.out.println("médico não encontrado");
			}
		}
	}

	
	/**Método que pesquisa médicos por parte do nome*/
	public void pesquisaPorParteDoNome(){
		if(Medicos.isEmpty()){
			System.out.println("A lista de médicos está vazia.");
			return;
		}
		System.out.println("Digite o nome do Médico para a pesquisa: ");
		Scanner teclado = new Scanner(System.in);
		String pesquisaNome = teclado .nextLine();
		for(Medico m: Medicos){
			if(m.getNome().contains(pesquisaNome)){
				System.out.println(m);
				return;
			}else{
				System.out.println("médico não encontrado");
			}
		}
	}
	
}
