package entities;

public class Terceiro extends Funcionario{
	
	public double adicional;

	public Terceiro(String matricula, int horasTrabalhadas, double valorHora, double adicional) {
		super(matricula, horasTrabalhadas, valorHora);
		this.adicional = adicional;
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	@Override
	public double salario() {
		return (horasTrabalhadas*valorHora)+adicional;
	}

}
