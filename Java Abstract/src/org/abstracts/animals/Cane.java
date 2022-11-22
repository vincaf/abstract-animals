package org.abstracts.animals;

public class Cane extends Animale {

	public Cane(String nome) {
		super(nome);
	}
	
	@Override
	public void dormi() {
		System.out.println("zzz");

	}

	@Override
	public void verso() {
		System.out.println("wof");

	}

	@Override
	public void mangia() {
		System.out.println("cibo per cani");

	}

}
