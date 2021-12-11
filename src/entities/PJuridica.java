package entities;

public class PJuridica extends Imposto {
	
	private Integer funcionarios;
	
	public PJuridica() {
		super();
	}

	public PJuridica(String nome, Double rendaAnual, Integer funcionarios) {
		super(nome, rendaAnual);
		this.funcionarios = funcionarios;
	}

	public Integer getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(Integer funcionarios) {
		this.funcionarios = funcionarios;
	}

	@Override
	public double taxa() {
		if(funcionarios < 10) {
			return getRendaAnual() * 16 / 100;
		}
		else {
			return getRendaAnual() * 14 / 100;
		}
	}

}
