package Questao4;

public class Transacao {
    private double valor;
    private String paisOrigem;
    private boolean usuarioSuspeito;
    private boolean dispositivoConhecido;

    public Transacao(double valor, String paisOrigem, boolean usuarioSuspeito, boolean dispositivoConhecido) {
        this.valor = valor;
        this.paisOrigem = paisOrigem;
        this.usuarioSuspeito = usuarioSuspeito;
        this.dispositivoConhecido = dispositivoConhecido;
    }

    public double getValor() { return valor; }
    public String getPaisOrigem() { return paisOrigem; }
    public boolean isUsuarioSuspeito() { return usuarioSuspeito; }
    public boolean isDispositivoConhecido() { return dispositivoConhecido; }
}