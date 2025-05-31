package uap.mains;

import java.util.Scanner;
import uap.models.Torus;
import uap.models.Sphere;

public class KalkulatorPabrik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("Nadhira Rasya Alivia");
        System.out.println("245150707111030");
        System.out.println("=============================================");

        System.out.println("Donat dengan lubang");
        System.out.println("=============================================");
        System.out.print("Isikan Radius   : ");
        double rTorus = sc.nextDouble();
        System.out.print("Isikan radius   : ");
        double rLubang = sc.nextDouble();
        System.out.println("=============================================");

        Torus torus = new Torus(rTorus, rLubang);
        torus.printInfo();

        System.out.println("=============================================");
        System.out.println("Donat tanpa lubang");
        System.out.println("=============================================");
        System.out.print("Isikan radius   : ");
        double rSphere = sc.nextDouble();
        System.out.println("=============================================");

        Sphere sphere = new Sphere(rSphere);
        sphere.printInfo();
        System.out.println("=============================================");

        sc.close();
    }
}
