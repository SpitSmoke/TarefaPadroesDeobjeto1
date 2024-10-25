package FabricaDeCarros;

public class Cliente {
    public static void main(String[] args) {

        FabricaDeCarros fabricaSUV = new FabricaDeCarrosSUV();
        Carro carroSUV = fabricaSUV.criarCarro();
        carroSUV.exibirInfo();


        FabricaDeCarros fabricaSedan = new FabricaDeCarrosSedan();
        Carro carroSedan = fabricaSedan.criarCarro();
        carroSedan.exibirInfo();
    }
}