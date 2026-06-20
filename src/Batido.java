public class Batido implements Cafe{

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
        return "Cafe Batido (" + tamano + ")";
    }
    public double costo() {
        switch (tamano) {
            case MEDIANO: return 0.99;
            case GRANDE: return 1.09;
            case NORMAL: default: return 0.89;
        }
    }
}