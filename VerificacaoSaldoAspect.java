import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.JoinPoint;

@Aspect
public class VerificacaoSaldoAspect {

    @Before("execution(void Conta.sacar(double)) && args(valor)")
    public void verificarSaldoInsuficiente(JoinPoint joinPoint, double valor) {
        Conta conta = (Conta) joinPoint.getThis(); // Captura a instância da conta
        if (conta.getSaldo() < valor) {
            System.out.println("Erro: Saldo insuficiente na conta " + conta.getTipoConta() + ". Saldo atual: " + conta.getSaldo());
        }
    }
}
