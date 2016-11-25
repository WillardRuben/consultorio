package consultorio;

/**Classe que representa um médico*/

public class Medico {
	private String crm; //atributos da classe Medico
	private String nome;
	private String especialidade;
	
	Medico(String nome,String crm,String especialidade){
		this.nome = nome;
		this.crm = crm;
		this.especialidade = especialidade;
	}
	
	
	public String getCrm() {
		return crm;
	}
	public void setCrm(String crm) {
		this.crm = crm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public String toString(){
		return	"CRM="+crm+ 
				"\nMédico=" + nome + 
				"\nEspecialidade=" + especialidade;
	}
	
}
