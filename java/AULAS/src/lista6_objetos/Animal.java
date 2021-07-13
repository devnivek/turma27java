package lista6_objetos;

public abstract class Animal {
	
	private String nome;
	private int Idade;
	private String som;
	
	public Animal(String nome, int idade, String som) {
		super();
		this.nome = nome;
		Idade = idade;
		this.som = som;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return Idade;
	}

	public void setIdade(int idade) {
		Idade = idade;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}
	
	public void movimento() {
		System.out.println("Este animal corre.");
	}
	
	

}
