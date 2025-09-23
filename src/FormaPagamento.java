import java.math.BigDecimal;

public abstract class FormaPagamento {
    public abstract void validarPagamento(String dados) throws Exception;
    public abstract void processarPagamento(BigDecimal valor);
}
