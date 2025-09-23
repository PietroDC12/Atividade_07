import java.math.BigDecimal;

public class CartaoCredito extends FormaPagamento {
    @Override
    public void validarPagamento(String numero) throws Exception {
        if (numero == null || numero.length() != 16)
            throw new Exception("Número de cartão inválido.");
    }

    @Override
    public void processarPagamento(BigDecimal valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com Cartão de Crédito.");
    }
}
