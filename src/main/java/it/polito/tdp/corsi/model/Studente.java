package it.polito.tdp.corsi.model;

import java.util.Objects;

public class Studente {
	
	private Integer matricola;
	private String cognome;
	private String nome;
	
	public Studente(Integer matricola, String cognome, String nome) {
		super();
		this.matricola = matricola;
		this.cognome = cognome;
		this.nome = nome;
	}
	
	
	public Integer getMatricola() {
		return matricola;
	}
	public void setMatricola(Integer matricola) {
		this.matricola = matricola;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	@Override
	public String toString() {
		return "Studente [matricola=" + matricola + ", cognome=" + cognome + ", nome=" + nome + "]";
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(matricola);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Studente other = (Studente) obj;
		return Objects.equals(matricola, other.matricola);
	}

	
}
