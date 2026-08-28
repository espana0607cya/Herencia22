public class BotellaDeAguardiente extends Botella {
    int cantidadbotellas = 0;

    public void mostrarDetalles() {
        System.out.println("Marca: " + marca);
        System.out.println("Porcentaje de alcohol: " + CantidadDeAlco + " %");
        System.out.println("Número de botellas: " + cantidadbotellas);
    }
}

