public class EntregaNormal implements Entrega {

    @Override
    public double calcularFrete() {
        return 20.00;
    }

    @Override
    public int calcularPrazo() {
        return 7;
    }
}