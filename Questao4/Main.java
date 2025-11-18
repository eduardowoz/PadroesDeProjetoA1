package Questao4;

public class Main {
    public static void main(String[] args) {
        System.out.println(">>> SISTEMA ANTIFRAUDE - CHAIN OF RESPONSIBILITY <<<\n");

        VerificadorFraude cadeia = new VerificadorValor();
        cadeia.definirProximo(new VerificadorGeolocalizacao())
              .definirProximo(new VerificadorHistorico())
              .definirProximo(new VerificadorDispositivo());

        System.out.println("--- Analisando Transação 1 (Válida) ---");
        Transacao t1 = new Transacao(500.0, "Brasil", false, true);
        boolean r1 = cadeia.verificar(t1);
        System.out.println("Resultado: " + (r1 ? "APROVADA" : "RECUSADA") + "\n");

        System.out.println("--- Analisando Transação 2 (Valor Alto) ---");
        Transacao t2 = new Transacao(15000.0, "Brasil", false, true);
        boolean r2 = cadeia.verificar(t2);
        System.out.println("Resultado: " + (r2 ? "APROVADA" : "RECUSADA") + "\n");

        System.out.println("--- Analisando Transação 3 (Dispositivo Novo) ---");
        Transacao t3 = new Transacao(500.0, "Brasil", false, false);
        boolean r3 = cadeia.verificar(t3);
        System.out.println("Resultado: " + (r3 ? "APROVADA" : "RECUSADA"));
    }
    
}
