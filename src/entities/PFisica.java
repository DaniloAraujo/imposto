package entities;

public class PFisica extends Imposto {
	
	private double saude;
	
	public PFisica() {
		super();
	}
	
	public PFisica(String nome, Double rendaAnual, double saude) {
		super(nome, rendaAnual);
		this.saude = saude;
	}

	public double getSaude() {
		return saude;
	}


	public void setSaude(double saude) {
		this.saude = saude;
	}

	@Override
	public double taxa() {
		if(getRendaAnual() < 20000) {
			return getRendaAnual() * 15 / 100;
		}
		else {
			return (getRendaAnual() * 25 / 100) - (saude * 50 / 100);
		}
	}

}
