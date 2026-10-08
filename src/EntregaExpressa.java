public class EntregaExpressa implements Entrega {

    @Override
    public double calcularFrete() {
        return 40.00;
    }

    @Override
    public int calcularPrazo() {
        return 2;
    }
}