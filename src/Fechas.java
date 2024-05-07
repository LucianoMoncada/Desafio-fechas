import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Fechas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la primera fecha como DD/MM/AAAA: ");
        String fecha1 = sc.next();
        System.out.println("Ingrese la segunda fecha como DD/MM/AAAA: ");
        String fecha2 = sc.next();
        int f1d = parseInt (fecha1.substring(0,2));
        int f1m = parseInt (fecha1.substring(3,5));
        int f1a = parseInt (fecha1.substring(6,10));

        int f2d = parseInt (fecha2.substring(0,2));
        int f2m = parseInt (fecha2.substring(3,5));
        int f2a = parseInt (fecha2.substring(6,10));

        if (f1a < f2a) {
            System.out.println("persona 2 es mayor");
        } else {
            if (f1a > f2a) {
                System.out.println("persona 1 es mayor");
            } else {

                if (f1m < f2m) {
                    System.out.println("persona 2 es mayor");
                } else {
                    if (f1m > f2m) {
                        System.out.println("persona 1 es mayor");

                        } else{

                            if (f1d < f2d) {
                                System.out.println("persona 2 es mayor");

                            } else {

                                if (f1d > f2d) {
                                    System.out.println("persona 1 es mayor");

                                } else {
                                    System.out.println("Tienen la misma edad" );

                                }

                            }
                        }
                    }
                }

            }
        }
    }
