public class Pedido {

    private int numero;
    private String cliente;
    private double valorProdutos;
    private Entrega entrega;

    public Pedido(int numero, String cliente, double valorProdutos, Entrega entrega) {

        if (valorProdutos <= 0) {
            throw new IllegalArgumentException("O valor dos produtos deve ser positivo.");
        }

        if (entrega == null) {
            throw new IllegalArgumentException("O pedido deve possuir uma modalidade de entrega.");
        }

        this.numero = numero;
        this.cliente = cliente;
        this.valorProdutos = valorProdutos;
        this.entrega = entrega;
    }

    public double calcularFrete() {
        return entrega.calcularFrete();
    }

    public int calcularPrazo() {
        return entrega.calcularPrazo();
    }

    public double calcularTotal() {
        return valorProdutos + calcularFrete();
    }

    public int getNumero() {
        return numero;
    }

    public String getCliente() {
        return cliente;
    }

    public double getValorProdutos() {
        return valorProdutos;
    }
}