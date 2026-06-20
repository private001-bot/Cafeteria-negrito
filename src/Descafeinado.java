public class Descafeinado implements Cafe {

    private Tamano tamano = Tamano.NORMAL;
    @Override
    public void setTamano(Tamano tamano) {
        this.tamano = tamano;
    }
    @Override
    public Tamano getTamano() {
        return tamano;
    }
    public String getDescripcion() {
        return "Cafe Descafeinado (" + tamano + ")";
    }

    public double costo() {
        switch (tamano) {
            case MEDIANO: return 1.15;
            case GRANDE: return 1.25;
            case NORMAL: default: return 1.05;
        }
    }
}
