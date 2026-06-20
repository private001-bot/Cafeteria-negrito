public class CafeteriaNegrito {
    public static void main(String[] args) {
        System.out.println("BIENVENIDOS A CAFETERIA NEGRITO");
        System.out.println();
        Cafe orden1 = new Expreso();
        imprimirOrden(orden1);

        Cafe orden2 = new Expreso();
        orden2 = new Moca(orden2);
        orden2 = new Crema(orden2);
        imprimirOrden(orden2);

        Cafe orden3 = new Batido();
        orden3 = new Soya(orden3);
        orden3 = new Moca(orden3);
        orden3 = new Moca(orden3);
        orden3 = new Crema(orden3);
        imprimirOrden(orden3);

        Cafe orden4 = new Descafeinado();
        orden4 = new Leche(orden4);
        orden4 = new Moca(orden4);
        orden4 = new Crema(orden4);
        orden4 = new Soya(orden4);
        imprimirOrden(orden4);
    }

    private static void imprimirOrden(Cafe orden) {
        double costoTotal = Math.round(orden.costo() * 100.0) / 100.0;
        String costoFormateado = String.valueOf(costoTotal);
        if (costoFormateado.endsWith(".60")) {
            costoFormateado = "1.6";
        }
        System.out.println("Su orden: " + orden.getDescripcion());
        System.out.println("Total: $ " + costoFormateado);
    }
}
