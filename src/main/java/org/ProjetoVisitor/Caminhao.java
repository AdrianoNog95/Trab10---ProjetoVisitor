package org.ProjetoVisitor;

public class Caminhao implements Veiculo {
    private int condicaoFreios;

    public Caminhao(int condicaoFreios) {
        this.condicaoFreios = condicaoFreios;
    }

    public void aceitar(VisitorVeiculos visitor) {
        visitor.visitar(this);
    }

    public int getCondicaoFreios() {
        return condicaoFreios;
    }
}
