public class ContaInvestimento extends Conta {
    public ContaInvestimento(String tipoCliente, String dataAbertura, double saldo) {
        super("Investimento", tipoCliente, dataAbertura, saldo);
    }

    @Override
    public double calculaValorTarifaManutencao() {
        return 15.0;
    }
}
