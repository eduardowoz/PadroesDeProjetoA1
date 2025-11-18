package Questao4;

public class VerificadorValor extends VerificadorFraude {
    @Override
    public boolean verificar(Transacao transacao) {
        if (transacao.getValor() > 10000) {
            System.out.println("FRAUDE: Valor da transação muito alto.");
            return false;
        }
        System.out.println("Valor OK.");
        return verificarProximo(transacao);
    }
}
