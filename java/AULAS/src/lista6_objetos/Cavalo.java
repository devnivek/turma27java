package lista6_objetos;

public class Cavalo extends Animal{
	
	private String porte;

	public Cavalo(String nome, int idade, String som, String porte) {
		super(nome, idade, som);
		this.porte = porte;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}
	

}
