public class Leche implements Complemento {
    private Cafe cafe;

    public Leche(Cafe cafe) {
        this.cafe = cafe;
    }
    public Tamano getTamano() {
        return cafe.getTamano();
    }
    public void setTamano(Tamano tamano) {
        cafe.setTamano(tamano);
    }
    public String getDescripcion() {
        return cafe.getDescripcion() + ", Leche";
    }
    public double costo() {
        double costoComplemento = 0.10;
        if (cafe.getTamano() == Tamano.MEDIANO) costoComplemento = 0.15;
        if (cafe.getTamano() == Tamano.GRANDE) costoComplemento = 0.20;
        return costoComplemento + cafe.costo();
    }
}


