public class sprint3_parte1 {
    public static void main(String[] args) {
        
        //variantes
        //piscina 1
        double largo1 = 300.3;
        double ancho1 = 150.5;
        double profundidad1 = 20.5;

        //piscina 2
        double largo2 = 300.3;
        double ancho2 = 80.5;
        double profundidad2 = 35.5;

        //calculamos areas
        double area1 = ancho1 * largo1;
        double area2 = ancho2 * largo2;
        System.out.println("La piscina 1 tiene un area de " + area1 +
        " y la piscina 2 tiene un area de " + area2);

        //calculamos volumenes
        double volumen1 = area1 * profundidad1;
        double volumen2 = area2 * profundidad2;
        System.out.println("La piscina 1 tiene un volumen de " + volumen1 + 
        " y la piscina 2 tiene un volumen de " + volumen2);

        //calculamos ancho y largo de las piscinas juntas
        double largonuevo = largo1;
        double anchonuevo = ancho1 + ancho2;
        System.out.println("El largo de las dos piscinas juntas es de " + largonuevo + 
        " y el nuevo ancho de las piscinas juntas es de " + anchonuevo);

        //calculamos el area e las dos piscinas juntas
        double areanueva = largonuevo * anchonuevo;
        System.out.println("El area de las dos piscinas juntas es de " + areanueva);

        //calculamos el volumen de las dos juntas
        double volumennuevo = volumen1 + volumen2;
        System.out.println("El volumen de las dos piscinas juntas es de " + volumennuevo);

        //intercambiamos los valores de profundidad
        double aux = profundidad1;
        profundidad1 = profundidad2;
        profundidad2 = aux;

        //calculamos los nuevos volumenes
        double volumennuevo1 = area1 * profundidad1;
        System.out.println("El nuevo volumen de la piscina 1 con las profundidades intercambiadas es de " + volumennuevo1);
        double volumennuevo2 = area2 * profundidad2;
        System.out.println("El nuevo volumen de la piscina 2 con las profundidades intercambiadas es de " + volumennuevo2);

    }
}
