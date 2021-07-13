package lista6_objetos;

public class Preguica extends Animal{

	private String habitat;

	public Preguica(String nome, int idade, String som, String habitat) {
		super(nome, idade, som);
		this.habitat = habitat;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
	@Override
	public void movimento() {
		System.out.println("Este animal sobe em árvores.");
	}
	
}
