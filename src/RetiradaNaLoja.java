public class RetiradaNaLoja implements Entrega {

    @Override
    public double calcularFrete() {
        return 0.00;
    }

    @Override
    public int calcularPrazo() {
        return 0;
    }
}