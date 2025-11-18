public class Main {

    public static void main(String[] args) {
        System.out.println("SISTEMA DE LOGISTICA - GERACAO DE RELATORIOS\n");

        FabricaRelatorio fabricaDiario = new FabricaRelatorioDiario();
        fabricaDiario.processarRelatorio();

        FabricaRelatorio fabricaSemanal = new FabricaRelatorioSemanal();
        fabricaSemanal.processarRelatorio();

        }

}



