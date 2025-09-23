import java.math.BigDecimal;

public class Estrategias {
    public static final CalculadoraFrete SEDEX = pedido -> new BigDecimal("30.00");
    public static final CalculadoraFrete PAC = pedido -> new BigDecimal("15.00");
    public static final CalculadoraFrete RETIRADA = pedido -> BigDecimal.ZERO;
    public static final CalculadoraFrete PROMO = pedido ->
            pedido.getValor().compareTo(new BigDecimal("200")) > 0 ? BigDecimal.ZERO : new BigDecimal("20.00");
}
