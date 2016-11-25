package consultorio;



import java.util.Scanner;
import java.io.IOException;
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;

import consultorio.ColecaoPacientes;
import consultorio.ColecaoConsultas;
import consultorio.ColecaoMedicos;
//import consultorio.Paciente;

public class Consultorio {

	/**Classe que possui o método principal*/
	/**
	 * @author Willard Ruben de Souza Meira
	 * 
	 * */

	public static void main(String[] args) throws IOException{		
	

		Scanner teclado = new Scanner(System.in);
		ColecaoPacientes Cpacientes = new ColecaoPacientes();
		ColecaoConsultas Cconsultas = new ColecaoConsultas();
		ColecaoMedicos Cmedicos = new ColecaoMedicos();
		
		
		int parada = 1 ;
		
		do{
			menu();
			System.out.println("Digite uma opção: ");
			int opcao = teclado.nextInt();
			switch(opcao){
				case 1:	
					
					Cpacientes.adicionarPaciente(); 
					break;
				case 2:
					Cpacientes.pesquisaPeloDocumento();
					break;
				case 3:
					Cpacientes.removePeloDocumento();
					break;
				case 4:
					Cpacientes.qtdPacientesPorSexo();
					break;
				case 5:
					Cpacientes.listagemPacienteComEndereco();
					break;
				case 6:
					Cpacientes.listagemDePacientesMaioresDe60anos();
					break;
				case 7:
					
					Cmedicos.adicionaMedico();
					break;
				case 8:
					Cmedicos.pesquisaPeloCRM();
					break;
				case 9:
					Cmedicos.pesquisaPorParteDoNome();
					break;
				case 10:
					Cconsultas.adicionaConsulta();
					break;
				case 11:
					Cconsultas.qtdConsultasporData();
					break;
				case 12:
					Cconsultas.listagemConsultas();
					break;
				case 13:
					Cconsultas.qtdConsultasPorMedico();
					break;
				case 14:
					Cconsultas.ConsultasPorPaciente();
					break;
				default:
					System.out.println("Digite uma opção válida");
			}
			
			System.out.println("1 para continuar e 0 para sair: ");
			parada = teclado.nextInt();
			teclado.nextLine();
			
			while(parada!=1&&parada!=0){
				System.out.println("opção inválida digite novamente: ");
				parada = teclado.nextInt();
			}
			if(parada==0&&parada!=1){
				break;
			}
			
		}while(parada==1);
		
		teclado.close();

	}
	/**Método que exibe o menu*/
	public static void menu(){
		System.out.println("--------------------");
		System.out.println("-----Pacientes------");
		System.out.println("--------------------");
		System.out.println("1-Adicionar paciente");
		System.out.println("2-Pesquisar paciente pelo documento");
		System.out.println("3-Remover paciente pelo documento");
		System.out.println("4-Quantidade de Pacientes por sexo");
		System.out.println("5-Listagem de pacientes com endereço");
		System.out.println("6-Listagem de pacientes maiores de 60 anos");
		System.out.println("--------------------");
		System.out.println("-----Médicos--------");
		System.out.println("--------------------");
		System.out.println("7-Adiconar médicos");
		System.out.println("8-Pesquisar médico pelo CRM");
		System.out.println("9-Pesquisar médico por parte do nome");
		System.out.println("--------------------");
		System.out.println("-----Consultas------");
		System.out.println("--------------------");
		System.out.println("10-Adicionar consulta");
		System.out.println("11-Quantidade de consultas por data");
		System.out.println("12-Listagem de consultas");
		System.out.println("13-Quantidade de consultas por médico");
		System.out.println("14-Listar consultas por paciente");
		
	}
	public static int leInteiroPositivo(Scanner in){
		System.out.print("Digite um inteiro positivo: ");
		int r=0;
		do{
			while(!in.hasNextInt()){
				in.nextLine();
				System.out.print("Tipo de dado inválido. Digite um inteiro: ");
			}
			r = in.nextInt();
			in.nextLine();
			if(r<=1&&r<=31){
				System.out.println("Digite um número entre 1 e 31: ");
			}
		}while(r<=0&&r<=31);
		
		return r;
	}

}
