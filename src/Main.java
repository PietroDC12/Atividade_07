import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Exercício 1 e 2
        Produto p1 = new Produto("Notebook", 3000, 5);
        p1.aplicarDesconto(10);
        System.out.println(p1);

        // Exercício 3
        List<Funcionario> funcionarios = Arrays.asList(
                new Gerente("Carlos", new BigDecimal("10000")),
                new Desenvolvedor("Ana", new BigDecimal("8000"))
        );
        funcionarios.forEach(f -> System.out.println(f.getNome() + " bônus: " + f.calcularBonus()));

        // Exercício 4
        List<IMeioTransporte> transportes = Arrays.asList(new Carro(), new Bicicleta(), new Trem());
        transportes.forEach(t -> { t.acelerar(); t.frear(); });

        // Exercício 5
        try {
            FormaPagamento cartao = new CartaoCredito();
            cartao.validarPagamento("1234567890123456");
            cartao.processarPagamento(new BigDecimal("500"));
        } catch (Exception e) { System.out.println("Erro: " + e.getMessage()); }

        // Exercício 7
        InMemoryRepository<ProdutoIdentificavel, Integer> repo = new InMemoryRepository<>();
        repo.salvar(new ProdutoIdentificavel(1, "Teclado"));
        repo.salvar(new ProdutoIdentificavel(2, "Mouse"));
        repo.listarTodos().forEach(p -> System.out.println(p.getNome()));

        // Exercício 8
        Pedido pedido = new Pedido(new BigDecimal("250"), "12345678", Estrategias.SEDEX);
        System.out.println("Frete: " + pedido.calcularFrete());
        pedido.setEstrategia(Estrategias.PROMO);
        System.out.println("Frete promo: " + pedido.calcularFrete());
    }
}
