public class Main {

    public static void main(String[] args) {

        Entrega entregaNormal = new EntregaNormal();

        Pedido pedido1 = new Pedido(
                1,
                "João",
                200.00,
                entregaNormal
        );

        System.out.println("=== PEDIDO 1 ===");
        System.out.println("Número: " + pedido1.getNumero());
        System.out.println("Cliente: " + pedido1.getCliente());
        System.out.println("Produtos: R$ " + pedido1.getValorProdutos());
        System.out.println("Frete: R$ " + pedido1.calcularFrete());
        System.out.println("Prazo: " + pedido1.calcularPrazo() + " dias");
        System.out.println("Total: R$ " + pedido1.calcularTotal());


        Entrega entregaExpressa = new EntregaExpressa();

        Pedido pedido2 = new Pedido(
                2,
                "Maria",
                300.00,
                entregaExpressa
        );

        System.out.println("\n=== PEDIDO 2 ===");
        System.out.println("Número: " + pedido2.getNumero());
        System.out.println("Cliente: " + pedido2.getCliente());
        System.out.println("Produtos: R$ " + pedido2.getValorProdutos());
        System.out.println("Frete: R$ " + pedido2.calcularFrete());
        System.out.println("Prazo: " + pedido2.calcularPrazo() + " dias");
        System.out.println("Total: R$ " + pedido2.calcularTotal());


        Entrega retiradaLoja = new RetiradaLoja();

        Pedido pedido3 = new Pedido(
                3,
                "Carlos",
                150.00,
                retiradaLoja
        );

        System.out.println("\n=== PEDIDO 3 ===");
        System.out.println("Número: " + pedido3.getNumero());
        System.out.println("Cliente: " + pedido3.getCliente());
        System.out.println("Produtos: R$ " + pedido3.getValorProdutos());
        System.out.println("Frete: R$ " + pedido3.calcularFrete());
        System.out.println("Prazo: " + pedido3.calcularPrazo() + " dias");
        System.out.println("Total: R$ " + pedido3.calcularTotal());
    }
}