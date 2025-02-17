public class SistemaBancario {
    public static void main(String[] args) {
        Conta contaPoupanca = new ContaPoupanca("Cliente 2", "01/01/2025", 500.0);
        ContaInvestimento contaInvestimento = new ContaInvestimento("Cliente 3", "01/01/2025", 2000.0);

        contaPoupanca.sacar(600.0);
        contaInvestimento.sacar(1500.0);
    }
}
