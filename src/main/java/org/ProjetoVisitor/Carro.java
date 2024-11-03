package org.ProjetoVisitor;

public class Carro implements Veiculo {
    private VeiculoBasico veiculoBasico;

    public Carro(int condicaoFreios) {
        this.veiculoBasico = new VeiculoBasico(condicaoFreios);
    }

    public void aceitar(VisitorVeiculos visitor) {
        visitor.visitar(this);
    }

    public int getCondicaoFreios() {
        return veiculoBasico.getCondicaoFreios();
    }
}