package FabricaDeCarros;

class FabricaDeCarrosSedan implements FabricaDeCarros {
    @Override
    public Carro criarCarro() {
        return new CarroSedan();
    }
}
