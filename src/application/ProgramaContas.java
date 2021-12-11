package application;

import entities.Conta;
import entities.ContaEmpresa;
import entities.ContaPoupanca;

public class ProgramaContas {

	public static void main(String[] args) {

		Conta cc = new Conta(1001, "Alex", 0.0);
		ContaEmpresa cce = new ContaEmpresa(1002, "Maria", 0.0, 500.0);
		
		//UPCASTING
		
		Conta cc1 = cce;
		Conta cc2 = new ContaEmpresa(1003, "Bob", 0.0, 200.0);
		Conta cc3 = new ContaPoupanca(1004, "Ana", 0.0, 0.01);
		
		//DOWNCASTING
		
		ContaEmpresa cc4 = (ContaEmpresa)cc2; //Foi feito um casting manual entre ()
		cc4.emprestimo(100.0); //no cc2 nao daria para fazer emprestimo, precisaria fazer um downcasting manual para funcionar
		//ContaEmpresa cc5 = (ContaEmpresa)cc3;//Na compilação da erro pq o compilador da conta empresa nao reconhece a conta poupança, apenas conta normal.
		if(cc3 instanceof ContaEmpresa) {
			ContaEmpresa cc5 = (ContaEmpresa)cc3;
			cc5.emprestimo(200.0);
			System.out.println("Emprestimo!");
		}
		
		if(cc3 instanceof ContaPoupanca) {
			ContaPoupanca cc5 = (ContaPoupanca)cc3;
			cc5.atualizarSaldo();
			System.out.println("Atualizado!");
		}
	
	}

}
