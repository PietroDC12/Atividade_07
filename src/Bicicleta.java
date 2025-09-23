public class Bicicleta implements IMeioTransporte {
    private int velocidade = 0;

    public void acelerar() {
        if (velocidade >= 40) throw new RuntimeException("Velocidade máxima da bicicleta atingida!");
        velocidade += 5;
        System.out.println("Bicicleta acelerou: " + velocidade + " km/h");
    }

    public void frear() {
        if (velocidade <= 0) throw new RuntimeException("Bicicleta já está parada!");
        velocidade -= 5;
        System.out.println("Bicicleta freou: " + velocidade + " km/h");
    }
}
