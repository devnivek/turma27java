package objetos;

public class Pessoa {

	public String nome;
	public char sexo;
	public int anoNasc;

	public int calcularIdade(int anoAtual) {
		return anoAtual - anoNasc;
	}
}
