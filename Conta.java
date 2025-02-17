public abstract class Conta {
    private String tipoConta;
    private String tipoCliente;
    private String dataAbertura;
    private double saldo;

    public Conta(String tipoConta, String tipoCliente, String dataAbertura, double saldo) {
        this.tipoConta = tipoConta;
        this.setTipoCliente(tipoCliente);
        this.setDataAbertura(dataAbertura);
        this.saldo = saldo;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de " + valor + " realizado com sucesso.");
    }

    public double calculaValorTarifaManutencao() {
        return 10.0;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTipoConta() {
        return tipoConta;
    }

	public String getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	public String getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
}
