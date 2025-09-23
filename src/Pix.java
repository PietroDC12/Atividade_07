import java.math.BigDecimal;

public class Pix extends FormaPagamento {
    @Override
    public void validarPagamento(String chave) throws Exception {
        if (chave == null || chave.isEmpty())
            throw new Exception("Chave Pix inválida.");
    }

    @Override
    public void processarPagamento(BigDecimal valor) {
        System.out.println("Pagamento via Pix no valor de R$" + valor);
    }
}
