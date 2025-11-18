package Questao3;

import java.util.ArrayList;
import java.util.List;

public class SensorAmbiental {
    private List<ModuloObservador> observadores = new ArrayList<>();
    private double temperatura;
    private double umidade;
    private double indicePoluicao;

    public void adicionarObservador(ModuloObservador observador) {
        observadores.add(observador);
    }

    public void removerObservador(ModuloObservador observador) {
        observadores.remove(observador);
    }

    public void setMedicoes(double temperatura, double umidade, double indicePoluicao) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.indicePoluicao = indicePoluicao;
        notificarObservadores();
    }

    private void notificarObservadores() {
        for (ModuloObservador observador : observadores) {
            observador.atualizar(temperatura, umidade, indicePoluicao);
        }
    }
}
