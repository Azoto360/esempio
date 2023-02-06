package it.renato.esempi;

public class Persona {
	
	String nome;
	String cognome;
	int eta;
	
	public Persona() {
		
	}
	
	Persona(String nome, String cognome, int eta){
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public int getEta(int eta) {
		return eta;
	}
	
	public void setEta(int eta) {
		if(eta > 143) {
		System.err.println("l'età non va bene");
	} else {
		
		this.eta = eta;
		
	}
	}	
}
