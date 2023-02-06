package it.renato.esempi;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {

	public static void main(String[] args) {
		
		int risultato = somma(10, 15);
		
		System.out.println(risultato);
		
		Persona p = new Persona();
				
		p.setNome("Renato");
		
		Persona personax = p; //l'inidirizzo di memoria non cambia, cambia il puntatore alla memoria --> da p a personax
		
		
		
		Persona p2 = new Persona();
		
		p2.setNome("Oreste");
		p2.setEta(145);
		//l'età è stata inizializzata a valore di default che per gli Integrer è uguale a 0
		
		String nomeOggettoP = p.getNome();
		
		System.out.println(nomeOggettoP);
		
		
				
				
		

	}
	
	public static int somma(int a, int b) {
		return a + b ;
	}

}
