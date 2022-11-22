package org.abstracts.animals;

public class Delfino extends Animale {

	public Delfino(String nome) {
		super(nome);
	}
	
	@Override
	public void dormi() {
		 System.out.println("zzz");

	}

	@Override
	public void verso() {
		 System.out.println("ciao bello");

	}

	@Override
	public void mangia() {
		System.out.println("quello che vuole");

	}

}
