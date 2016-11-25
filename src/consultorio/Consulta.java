package consultorio;

/**Classe que representa o médio*/

import java.time.LocalDate;

import java.time.LocalTime;

public class Consulta {
	
	private Paciente paciente;
	private Medico medico;
	private LocalDate data;
	private LocalTime hora;
	
	Consulta(Paciente paciente,Medico medico,LocalDate data,LocalTime hora){
		this.paciente = paciente;
		this.medico = medico;
		this.data = data;
		this.hora = hora;
	}
	
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	
	@Override
	public String toString() {
		return "Consulta: "	+
				"\nPaciente=" + paciente+
				"\nMedico=" + medico + 
				"\nData =" + data+
				"\nhora =" + hora;
	}
	
	
}
