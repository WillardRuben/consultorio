package consultorio;
/**Classe que representa o objeto endereço*/

public class Endereco {

	/**
	 * Atributos da classe endereço;
	 * */
	private String cep;
	private String rua;
	private String bairro;
	private String complemento;

	/**Construtores*/
	Endereco(String cep,String rua,String bairro,String complemento){
		this.cep = cep;
		this.rua = rua;
		this.bairro = bairro;
		this.complemento = complemento;
	}
	Endereco(){
		
	}
	/**
	 * Métodos get e seters*/
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	@Override
	public String toString() {
		return "Endereco "+
				"\ncep=" + cep + 
				"\nrua=" + rua + 
				"\nbairro=" + bairro + 
				"\ncomplemento=" + complemento;
	}	
}
