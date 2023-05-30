package Cartão;

import java.util.ArrayList;
import java.util.List;

public class Credito {
    private double saldo;
    private double limite;

    private List<Compras> compras;


    public Credito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public boolean lancaCompra(Compras compras) {
        if (this.saldo > compras.getValor()) {
            this.saldo -= compras.getValor();
            this.compras.add(compras);
            return true;
        }
        else return false;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public List<Compras> getCompras() {
        return compras;
    }
}
