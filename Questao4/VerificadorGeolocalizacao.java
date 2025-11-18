package Questao4;

public class VerificadorGeolocalizacao extends VerificadorFraude {
    @Override
    public boolean verificar(Transacao transacao) {
        if ("Coreia do Norte".equalsIgnoreCase(transacao.getPaisOrigem())) {
            System.out.println("FRAUDE: Geolocalização bloqueada.");
            return false;
        }
        System.out.println("Geolocalização OK.");
        return verificarProximo(transacao);
    }
}
