public class Trem implements IMeioTransporte {
    private int velocidade = 0;

    public void acelerar() {
        if (velocidade >= 300) throw new RuntimeException("Velocidade máxima do trem atingida!");
        velocidade += 50;
        System.out.println("Trem acelerou: " + velocidade + " km/h");
    }

    public void frear() {
        if (velocidade <= 0) throw new RuntimeException("Trem já está parado!");
        velocidade -= 50;
        System.out.println("Trem freou: " + velocidade + " km/h");
    }
}
