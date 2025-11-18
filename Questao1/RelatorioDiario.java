public class RelatorioDiario implements Relatorio {
    @Override
    public void gerarCabecalho() {
        System.out.println("--- RELATÓRIO DIÁRIO ---");
        System.out.println("Data: " + java.time.LocalDate.now());
    }

    @Override
    public void gerarCorpo() {
        System.out.println("Conteúdo: Consolidação de entregas das últimas 24 horas.");
        System.out.println("Métricas: Taxa de sucesso de 98%.");
    }

    @Override
    public void gerarRodape() {
        System.out.println("Fim do Relatório Diário.\n");
    }
}