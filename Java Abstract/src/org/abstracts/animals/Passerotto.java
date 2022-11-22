package org.abstracts.animals;

public class Passerotto extends Animale {

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
