package abstractfactorymethod;

public class Carro {

    Roda roda;
    Som som;

    public Roda getRoda() {
        return roda;
    }

    public Som getSom() {
        return som;
    }

    public void setRoda(Roda roda) {
        this.roda = roda;
    }

    public void setSom(Som som) {
        this.som = som;
    }
}
