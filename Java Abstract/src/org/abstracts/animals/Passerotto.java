package org.abstracts.animals;

public class Passerotto extends Animale {

	public Passerotto(String nome) {
		super(nome);
	}
	
	@Override
	public void dormi() {
		System.out.println("zzz");

	}

	@Override
	public void verso() {
		System.out.println("cip");

	}

	@Override
	public void mangia() {
		System.out.println("frutta grattuggiata");
	}

}
