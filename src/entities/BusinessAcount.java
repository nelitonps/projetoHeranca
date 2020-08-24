package entities;

public class BusinessAcount extends Account {//Herdando os dados da classe Account

	private Double loanLimit;
	
	public BusinessAcount() {
		super();
	}

	public BusinessAcount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);//utilizando a logica do construtor da classe herdada
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10.0;// para usar variavel balance da classe herdada como ela foi declarada private la na classe usa se protected para manter protegida
		}
	}
	
}
