public class Soya implements Complemento {
    private Cafe cafe;

    public Soya(Cafe cafe) {
        this.cafe = cafe;
    }

    public String getDescripcion() {
        return cafe.getDescripcion() + ", Soya";
    }
    public double costo() {
        return 0.15 + cafe.costo();
    }
}
