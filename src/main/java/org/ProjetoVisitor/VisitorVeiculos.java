package org.ProjetoVisitor;

public interface VisitorVeiculos {
    void visitar(Carro carro);
    void visitar(Moto moto);
    void visitar(Caminhao caminhao);
}