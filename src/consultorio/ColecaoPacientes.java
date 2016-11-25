package consultorio;

import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
//import consultorio.*;


public class ColecaoPacientes {
	private static final LocalDate LocalDate = null;
	/**Coleção de Pacientes*/
	ArrayList<Paciente> Pacientes = new ArrayList<>();
	
	/**
	 * Métodos de coleção Pacientes
	 * */
	
	/**
	 * Método que adiciona um paciente na coleção*/
	public void adicionarPaciente(){
		System.out.println("Digite o número do documento: ");
		Scanner teclado = new Scanner(System.in);
		String documento = teclado .nextLine();
		System.out.println("Digite o nome do paciente: ");
		String nome = teclado.nextLine();
		System.out.println("Digite o sexo do paciente(m ou f): ");
		String sexo = teclado.nextLine();
		Endereco endereco = new Endereco();
		System.out.println("Digite o nome da rua do paciente: ");
		String rua = teclado.nextLine();
		endereco.setRua(rua);
		System.out.println("Digite o CEP do paciente: ");
		String cep = teclado.nextLine();
		System.out.println("Digite o nome do bairro do paciente: ");
		String bairro = teclado.nextLine();
		endereco.setBairro(bairro);
		System.out.println("Digite o complemento: ");
		String complemento = teclado.nextLine();
		endereco.setComplemento(complemento);
		endereco.setCep(cep);					
		System.out.println("Digite a data de nascimento do paciente: ");
		System.out.println("Dia: ");
		int dia = leDia(teclado);
		System.out.println("Mes: ");
		int mes = leMes(teclado);
		System.out.println("Ano: ");
		int ano = leAno(teclado);
		LocalDate dataNascimento = java.time.LocalDate.of(ano, mes, dia);
		//Conversão de String em Local Date;
		//DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		//LocalDate dataNascimento = LocalDate.parse(data, fmt2);
		Pacientes.add(new Paciente(documento,nome,sexo,endereco,dataNascimento));
	}
	/**
	 * Método que pesquisa um paciente na coleção utilizando a referencia do documento*/
	public void pesquisaPeloDocumento(){
		
		if(Pacientes.isEmpty()){
			System.out.println("A lista de pacientes está vazia.");
			return;
		}
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o número do documento do paciente");
		String doc = teclado .nextLine();		
		
		for(Paciente p: Pacientes){
			if(p.getDocumento().equals(doc)){
				System.out.println(p);
				return;
			}
			if(!(p.getDocumento().equals(doc))){
				System.out.println("Paciente não encontrado");
				return;
			}
		}
	}
	/**
	 * Método que remove um paciente utilizando a referencia do documento*/
	public void removePeloDocumento(){
		
		if(Pacientes.isEmpty()){
			System.out.println("A lista de pacientes está vazia.");
			return;
		}
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o documento do paciente para remove-lo: ");
		String doc = teclado.nextLine();
		for(Paciente p: Pacientes){
			if(p.getDocumento().equals(doc)){
				Pacientes.remove(p);
				System.out.println("Paciente removido");
				return;
			}
			if(!(p.getDocumento().equals(doc))){
				System.out.println("Paciente não encontrado");
				return;
			}
		}
	}
	/**
	 * Método que exibe a quatidade de paciente de acordo com o sexo*/
	public void qtdPacientesPorSexo(){
		int contm = 0;
		int contf = 0;
		if(Pacientes.isEmpty()){
			System.out.println("A lista de pacientes está vazia.");
			return;
		}
		for(Paciente p: Pacientes){
			if(p.getSexo().equalsIgnoreCase("m")){
				contm++;
			}
			if(p.getSexo().equalsIgnoreCase("f")){
				contf++;
			}
		}
		System.out.println(contm+" pacientes do sexo masculino");
		System.out.println(contf+" pacientes do sexo feminino");
	}
	/**
	 * Método que lista todos os paciente que possuem endereço*/
	public void listagemPacienteComEndereco(){
		if(Pacientes.isEmpty()){
			System.out.println("A lista de Pacientes está vazia.");
			return;
		}
		for(Paciente p: Pacientes){
			if(!(p.getEndereco().equals(null))){
				System.out.println(p);
			}			
		}
	}
	/**Lista todos os pacientes que possuem mais de 60 anos de idade*/
	public void listagemDePacientesMaioresDe60anos(){
	
		if(Pacientes.isEmpty()){
			System.out.println("A lista de Pacientes está vazia");
			return;
		}
		for(Paciente p: Pacientes){
			if(p.getIdade()>60){
				System.out.println(p);
			}
		}
	
	}
	/**Método para le os números que representam os dias no mes*/
	public static int leDia(Scanner in){
		int r=0;
		do{
			r = in.nextInt();
			in.nextLine();
			while(!((r>1)&&(r<31))){
				System.out.println("Digite um inteiro entre 1 e 31: ");
				r = in.nextInt();
			}
		}while(r<1||r>31);
		
		return r;
	}
	/**Método para ler os meses no ano*/
	public static int leMes(Scanner in){
		//System.out.print("Digite um inteiro positivo: ");
		int r=0;
		do{
			r = in.nextInt();
			in.nextLine();
			while(!((r>=1)&&(r<=12))){
				System.out.println("Digite um inteiro entre 1 e 12: ");
				r = in.nextInt();
			}
		}while(r<1||r>=12);
		
		return r;
	}
	/**Método para ler os números correspondentes aos anos*/
	public static int leAno(Scanner in){
		//System.out.print("Digite um inteiro positivo: ");
		LocalDate dataatual = LocalDate.now();
		int ano = dataatual.getYear();
		int r=0;
		do{
			r = in.nextInt();
			in.nextLine();
			while(!((r>1)&&(r<=ano))){
				System.out.println("Digite um inteiro entre 1 e "+ano );
				r = in.nextInt();
			}
		}while(r<1||r>=ano);
		
		return r;
	}
}
