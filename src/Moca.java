public class Moca implements Complemento {
        private Cafe cafe;

        public Moca(Cafe cafe) {
            this.cafe = cafe;
        }

        public String getDescripcion() {
            return cafe.getDescripcion() + ", Moca";
        }
        public double costo() {
            return 0.20 + cafe.costo();
        }
}
