package Questao3;

public class PainelControle implements ModuloObservador {
    @Override
    public void atualizar(double temperatura, double umidade, double indicePoluicao) {
        System.out.println("[PAINEL] Temperatura: " + temperatura + "°C | Umidade: " + umidade + "% | Poluição: " + indicePoluicao);
    }
}
