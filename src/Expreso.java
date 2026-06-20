public class Expreso implements Cafe{

    private Tamano tamano = Tamano.NORMAL;

    @Override
    public void setTamano(Tamano tamano) {
        this.tamano = tamano;
    }
    @Override
    public Tamano getTamano() {
        return tamano;
    }
    @Override
    public String getDescripcion() {
        return "Cafe Expreso (" + tamano + ")";
    }
    @Override
    public double costo() {
       switch (tamano) {
           case MEDIANO: return 2.09;
           case GRANDE: return 2.15;
           case NORMAL: default: return 1.99;
       }
    }
}
