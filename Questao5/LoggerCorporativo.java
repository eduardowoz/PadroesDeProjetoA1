package Questao5;

public class LoggerCorporativo {

    private static volatile LoggerCorporativo instanciaUnica;

    private LoggerCorporativo() {
        System.out.println("Inicializando sistema de logs...");
    }

    public static LoggerCorporativo getInstancia() {
        if (instanciaUnica == null) {
            synchronized (LoggerCorporativo.class) {
                if (instanciaUnica == null) {
                    instanciaUnica = new LoggerCorporativo();
                }
            }
        }
        return instanciaUnica;
    }

    public void registrarLog(String nivel, String mensagem) {
        System.out.printf("[LOG - %s] %s%n", nivel, mensagem);
    }
}
