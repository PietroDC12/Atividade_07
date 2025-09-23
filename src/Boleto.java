import java.math.BigDecimal;

public class Boleto extends FormaPagamento {
    @Override
    public void validarPagamento(String codigo) throws Exception {
        if (codigo == null || codigo.length() != 47)
            throw new Exception("Boleto inválido.");
    }

    @Override
    public void processarPagamento(BigDecimal valor) {
        System.out.println("Boleto gerado no valor de R$" + valor);
    }
}
