public abstract class FabricaRelatorio {
    
    public abstract Relatorio criarRelatorio();

    public void processarRelatorio() {
        Relatorio relatorio = criarRelatorio();
        relatorio.gerarCabecalho();
        relatorio.gerarCorpo();
        relatorio.gerarRodape();
    }
    
}