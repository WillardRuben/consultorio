package consultorio;

/**Classe que representa o paciente*/

import java.time.LocalDate;
//import java.time.Year;


public class Paciente {

	private String documento;
	private String nome;
	private String sexo;
	private Endereco endereco;
	private LocalDate dataNascimento;
	private int idade;
	/**Construtores*/
	Paciente(String documento,String nome,String sexo,Endereco endereco,LocalDate dataNascimento){
		this.documento = documento;
		this.nome = nome;
		this.sexo = sexo;
		this.endereco = endereco;
		this.dataNascimento = dataNascimento;
		this.idade = calcDataNascimento(dataNascimento);
	}
	Paciente(String nome,String documento) {
		this.nome = nome;
		this.documento = documento;
	}
	/**Geters and Sters*/
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String[] iniciais(String nome){
		String[] parts = nome.split(" ");
		return parts;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public int calcDataNascimento(LocalDate dataNascimento){
		//String[] dataseparada = dataNascimento.split("/");
		
		//LocalDate nascimento = LocalDate.of(Integer.parseInt(dataseparada [0]),Integer.parseInt(dataseparada [1]),Integer.parseInt(dataseparada [2]));
		
		LocalDate dataAtual = LocalDate.now();
		int datafinal, datainicial,idade;
		datafinal = dataAtual.getYear();
		datainicial = dataNascimento.getYear();
		idade = datafinal - datainicial;
		//System.out.println("Idade do Paciente é: "+idade);
		return idade;
	}

	@Override
	public String toString() {
		return 	 "Paciente "
				+"documento=" + documento+
				 "\nnome=" + nome + 
				 "\nsexo=" + sexo + 
				 "\nendereco=" + endereco+
				 "\ndataNascimento=" + dataNascimento +
				 "\nidade=" + idade;
	}
}
