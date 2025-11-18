public class RelatorioSemanal implements Relatorio {
    @Override
    public void gerarCabecalho() {
        System.out.println("=== RELATÓRIO SEMANAL ===");
        System.out.println("Semana: " + java.time.LocalDate.now().with(java.time.temporal.TemporalAdjusters.previousOrSame(java.time.DayOfWeek.MONDAY)));
    }

    @Override
    public void gerarCorpo() {
        System.out.println("Conteúdo: Análise de tendências e KPIs acumulados.");
        System.out.println("Métricas: Custo por km rodado e eficiência de rota.");
    }

    @Override
    public void gerarRodape() {
        System.out.println("Fim do Relatório Semanal.\n");
    }
}