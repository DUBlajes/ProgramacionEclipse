package Clases;

import java.util.Arrays;

public class Mundo {
	private Sim[] sims;
	private Animal[] animales;
	public Mundo(Sim[] sims, Animal[] animales) {
		super();
		this.sims = sims;
		this.animales = animales;
	}
	public Sim[] getSims() {
		return sims;
	}
	public void setSims(Sim[] sims) {
		this.sims = sims;
	}
	public Animal[] getAnimales() {
		return animales;
	}
	public void setAnimales(Animal[] animales) {
		this.animales = animales;
	}
	@Override
	public String toString() {
		return "Este mundo cuenta con:"
				+ "\n\t"+Arrays.toString(sims)+" Sims y "+ Arrays.toString(animales) + " animales";
	}
	
}
