package Questao3;

public class ModuloAlertas implements ModuloObservador {
    @Override
    public void atualizar(double temperatura, double umidade, double indicePoluicao) {
        if (temperatura > 40 || indicePoluicao > 100) {
            System.out.println("[ALERTA] Condições críticas detectadas! Enviando notificações de emergência.");
        }
    }
}
