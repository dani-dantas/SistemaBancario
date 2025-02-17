public class ContaPoupanca extends Conta {
    public ContaPoupanca(String tipoCliente, String dataAbertura, double saldo) {
        super("Poupança", tipoCliente, dataAbertura, saldo);
    }

    @Override
    public double calculaValorTarifaManutencao() {
        return 5.0;
    }
}
