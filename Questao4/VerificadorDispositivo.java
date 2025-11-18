package Questao4;

public class VerificadorDispositivo extends VerificadorFraude {
    @Override
    public boolean verificar(Transacao transacao) {
        if (!transacao.isDispositivoConhecido()) {
            System.out.println("FRAUDE: Dispositivo incomum detectado.");
            return false;
        }
        System.out.println("Dispositivo OK.");
        return verificarProximo(transacao);
    }
}
