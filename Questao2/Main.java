package Questao2;

public class Main {
    public static void main(String[] args) {
        System.out.println(">>> PLATAFORMA DE ANÁLISE DE INVESTIMENTOS <<<\n");

        PlataformaInvestimento plataforma = new PlataformaInvestimento();

        plataforma.definirEstrategia(new AnaliseConservadora());
        plataforma.realizarAnalise();

        plataforma.definirEstrategia(new AnaliseModerada());
        plataforma.realizarAnalise();

        plataforma.definirEstrategia(new AnaliseAgressiva());
        plataforma.realizarAnalise();

    }

}
