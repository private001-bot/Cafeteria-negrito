public class Leche implements Complemento {
    private Cafe cafe;

    public Leche(Cafe cafe) {
        this.cafe = cafe;
    }

    public String getDescripcion() {
        return cafe.getDescripcion() + ", Leche";
    }
    public double costo() {
        return 0.10 + cafe.costo();
    }
}


