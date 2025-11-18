package Questao4;

public abstract class VerificadorFraude {
    
    protected VerificadorFraude proximo;

    public VerificadorFraude definirProximo(VerificadorFraude proximo) {
        this.proximo = proximo;
        return proximo;
    }

    public abstract boolean verificar(Transacao transacao);

    protected boolean verificarProximo(Transacao transacao) {
        if (proximo == null) {
            return true;
        }
        return proximo.verificar(transacao);
    }
}
