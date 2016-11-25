package consultorio;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
//import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
//import java.util.Date;
import java.util.Scanner;

public class ColecaoConsultas {
	/**Cole��o de consultas*/
	ArrayList<Consulta> Consultas = new ArrayList<>();
	
	/**M�todos de Consulta*/
	/**M�todo que adiciona uma consulta a cole�ao de consultas*/
	public void adicionaConsulta(){
		System.out.println("Digite os dados do Paciente");
		System.out.println("Nome: ");
		Scanner teclado = new Scanner(System.in);
		String nomePaciente = teclado .nextLine();
		
		System.out.println("N� Documento: ");
		String Ndocumento = teclado.nextLine();
		Paciente paciente = new Paciente(nomePaciente, Ndocumento);
		System.out.println("Digite os dados do m�dico ");
		System.out.println("Nome: ");
		String nomeMedico = teclado.nextLine();
		System.out.println("CRM: ");
		String crmMedico = teclado.nextLine();
		System.out.println("Especialidade: ");
		String especialidadeMedico = teclado.nextLine();
		Medico medico = new Medico(nomeMedico,crmMedico, especialidadeMedico);
		//System.out.println("Data da consulta(dd/mm/aaaa): ");
		LocalDate dataC = LocalDate.now();
		//Convers�o de String em Local Date;
		//DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		//LocalDate dataConsulta = LocalDate.parse(dataC, fmt2);
		LocalTime horaCorrente = LocalTime.now();
		Consultas.add(new Consulta(paciente, medico,dataC,horaCorrente)); 

	}
	/**Exibe a lista de consultas cadastradas na cole��o*/
	public void listagemConsultas(){
		if(Consultas.isEmpty()){
			System.out.println("A lista de consultas est� vazia.");
		}
		for(Consulta c: Consultas){
			System.out.println(c);
		}
	}
	/**Exibe a quantidade de consultas em determinada data*/
	public void qtdConsultasporData(){
		int consulta =0;
		if(Consultas.isEmpty()){
			System.out.println("A lista de consultas est� vazia.");
			return;
		}
		System.out.println("Digite a data: ");
		Scanner teclado = new Scanner(System.in);
		String data = teclado .nextLine();
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataconsulta = LocalDate.parse(data, fmt2);
		for(Consulta c: Consultas){
			if(dataconsulta.equals(c.getData())){
				consulta++;
			}
		}
		System.out.print(consulta+" para esta data.");

	}
	/**Exibe a quantidade de consultas por m�dico*/
	public void qtdConsultasPorMedico(){
		int consulta = 0;
		if(Consultas.isEmpty()){
			System.out.println("A lista de consultas est� vazia");
			return;
		}
		System.out.println("Digite o nome do m�dico: ");
		Scanner teclado = new Scanner(System.in);
		String medico = teclado .nextLine();
		for(Consulta c: Consultas){
			if(c.getMedico().getNome().contains(medico)){
				consulta++;
			}
		}
		System.out.println(consulta+"  consultas para o m�dico "+ medico);
	
	}
	/**Exibe a quantidade de consultas por pacientes*/
	public void ConsultasPorPaciente(){
		int consulta = 0;
		if(Consultas.isEmpty()){
			System.out.println("A lista de consultas est� vazia");
			return;
		}
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o nome do paciente: ");
		String p = teclado .nextLine();
		for(Consulta c: Consultas){
			if(c.getPaciente().getNome().contains(p)){
				consulta++;
			}
		}
		System.out.println("Existem" +consulta+ " consulta(s) para o paciente "+p);

	}
}
