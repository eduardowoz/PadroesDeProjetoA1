package Questao3;

public class ModuloHistorico implements ModuloObservador {
    @Override
    public void atualizar(double temperatura, double umidade, double indicePoluicao) {
        System.out.println("[HISTÓRICO] Registrando dados no banco de dados...");
    }
}
