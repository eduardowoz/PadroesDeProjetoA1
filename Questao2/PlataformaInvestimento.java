package Questao2;

public class PlataformaInvestimento {
    private EstrategiaAnalise estrategia;

    public void definirEstrategia(EstrategiaAnalise estrategia) {
        this.estrategia = estrategia;
    }

    public void realizarAnalise() {
        if (estrategia == null) {
            System.out.println("Nenhuma estratégia de análise definida.");
        } else {
            estrategia.calcularRisco();
        }
    }
    
}
