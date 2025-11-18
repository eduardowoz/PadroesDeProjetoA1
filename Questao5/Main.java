package Questao5;

public class Main {
    public static void main(String[] args) {
        System.out.println(">>> SISTEMA CORPORATIVO DE LOGS <<<\n");

        LoggerCorporativo logger1 = LoggerCorporativo.getInstancia();
        LoggerCorporativo logger2 = LoggerCorporativo.getInstancia();

        System.out.println("Verificação de instância única: " + (logger1 == logger2));
        System.out.println();

        logger1.registrarLog("INFO", "Aplicação iniciada com sucesso.");
        logger2.registrarLog("WARNING", "Uso de memória elevado.");
        logger1.registrarLog("ERROR", "Falha na conexão com o banco de dados.");
    
    }
    
}
