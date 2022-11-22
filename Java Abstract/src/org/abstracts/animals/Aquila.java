package org.abstracts.animals;

public class Aquila extends Animale {

	public Aquila(String nome) {
		super(nome);
	}
	
	@Override
	public void dormi() {
		System.out.println("zzz");

	}

	@Override
	public void verso() {
		System.out.println("aaah");

	}

	@Override
	public void mangia() {
		System.out.println("conigli");
	}

}
