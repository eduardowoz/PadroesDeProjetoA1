package Questao4;

public class VerificadorHistorico extends VerificadorFraude {
    @Override
    public boolean verificar(Transacao transacao) {
        if (transacao.isUsuarioSuspeito()) {
            System.out.println("FRAUDE: Histórico do usuário suspeito.");
            return false;
        }
        System.out.println("Histórico OK.");
        return verificarProximo(transacao);
    }
}
