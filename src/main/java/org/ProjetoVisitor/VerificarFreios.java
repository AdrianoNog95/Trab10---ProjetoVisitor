package org.ProjetoVisitor;

public class VerificarFreios implements VisitorVeiculos {
    public void visitar(Carro carro) {
        carro.getCondicaoFreios();
    }

    public void visitar(Moto moto) {
        moto.getCondicaoFreios();
    }

    public void visitar(Caminhao caminhao) {
        caminhao.getCondicaoFreios();
    }
}