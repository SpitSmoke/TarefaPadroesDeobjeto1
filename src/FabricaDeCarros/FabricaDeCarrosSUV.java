package FabricaDeCarros;

class FabricaDeCarrosSUV implements FabricaDeCarros {
    @Override
    public Carro criarCarro() {
        return new CarroSUV();
    }
}