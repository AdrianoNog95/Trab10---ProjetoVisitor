package org.ProjetoVisitor;

public class Moto implements Veiculo {
    private int condicaoFreios;

    public Moto(int condicaoFreios) {
        this.condicaoFreios = condicaoFreios;
    }

    public void aceitar(VisitorVeiculos visitor) {
        visitor.visitar(this);
    }

    public int getCondicaoFreios() {
        return condicaoFreios;
    }
}