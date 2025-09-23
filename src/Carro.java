public class Carro implements IMeioTransporte {
    private int velocidade = 0;

    public void acelerar() {
        if (velocidade >= 200) throw new RuntimeException("Velocidade máxima do carro atingida!");
        velocidade += 20;
        System.out.println("Carro acelerou: " + velocidade + " km/h");
    }

    public void frear() {
        if (velocidade <= 0) throw new RuntimeException("Carro já está parado!");
        velocidade -= 20;
        System.out.println("Carro freou: " + velocidade + " km/h");
    }
}
