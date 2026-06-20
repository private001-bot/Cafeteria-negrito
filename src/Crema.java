public class Crema implements Complemento {
    private Cafe cafe;

    public Crema(Cafe cafe) {
        this.cafe = cafe;
    }
    public String getDescripcion() {
        return cafe.getDescripcion() + ", Crema";
    }
    public double costo() {
        return 0.10 + cafe.costo();
    }
}
