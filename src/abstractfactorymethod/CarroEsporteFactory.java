package abstractfactorymethod;

public class CarroEsporteFactory extends CarroFactory {
    @Override
    public Roda montarRoda() {
        return new RodaLigaLeve();
    }

    @Override
    public Som montarSom() {
        return new SomBluetooth();
    }
}
