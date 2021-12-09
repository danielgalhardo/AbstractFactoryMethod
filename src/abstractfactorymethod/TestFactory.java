package abstractfactorymethod;

public class TestFactory {

    private static Carro constroiCarro (String tipo)
    {
        CarroFactory carroFac = null;
        switch(tipo)
        {
            case "esporte" :
                carroFac = new CarroEsporteFactory();
            case "popular" :
                carroFac = new CarroPopularFactory();
        }
        Carro carro = new Carro();
        carro.setRoda(carroFac.montarRoda());
        carro.setSom(carroFac.montarSom());
        return carro;
    }

    public static void main(String[] args)
    {
        Carro c1 = constroiCarro("esporte");
        Carro c2 = constroiCarro("popular");
    }
}
