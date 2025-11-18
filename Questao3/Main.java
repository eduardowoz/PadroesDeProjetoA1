package Questao3;

public class Main {

    public static void main(String[] args) {
        System.out.println(">>> MONITORAMENTO AMBIENTAL EM TEMPO REAL <<<\n");

        SensorAmbiental sensor = new SensorAmbiental();

        ModuloObservador painel = new PainelControle();
        ModuloObservador alertas = new ModuloAlertas();
        ModuloObservador historico = new ModuloHistorico();

        sensor.adicionarObservador(painel);
        sensor.adicionarObservador(alertas);
        sensor.adicionarObservador(historico);

        System.out.println("--- Nova Leitura: Manhã ---");
        sensor.setMedicoes(28.5, 60.0, 40.0);

        System.out.println("\n--- Nova Leitura: Tarde (Crítica) ---");
        sensor.setMedicoes(42.0, 30.0, 150.0);
    
    }

}




