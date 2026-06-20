public class Moca implements Complemento {
        private Cafe cafe;

        public Moca(Cafe cafe) {
            this.cafe = cafe;
        }
        public Tamano getTamano() {
            return cafe.getTamano();
        }
        public void setTamano(Tamano tamano) {
            cafe.setTamano(tamano);
        }
        public String getDescripcion() {
            return cafe.getDescripcion() + ", Moca";
        }
        public double costo() {
            double costoComplemento = 0.20;
            if (cafe.getTamano() == Tamano.MEDIANO) costoComplemento = 0.25;
            if (cafe.getTamano() == Tamano.GRANDE) costoComplemento = 0.30;
            return costoComplemento + cafe.costo();
        }
}
