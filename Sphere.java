package uap.models;

import uap.bases.CetakanDonat;
import uap.interfaces.Hitung;
import uap.interfaces.Konversi;
import uap.interfaces.Cetak;

public class Sphere extends CetakanDonat implements Hitung, Konversi, Cetak {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return 4.0 / 3.0 * PI * radius * radius * radius;
    }

    @Override
    public double getLuasPermukaan() {
        return 4 * PI * radius * radius;
    }

    @Override
    public double getMassa() {
        return getVolume() * DENSITAS * TEBAL;
    }

    @Override
    public double konversiKg() {
        return getMassa() / 1000.0;
    }

    @Override
    public int hitungBiayaKirim() {
        return (int) Math.ceil(konversiKg()) * 2000;
    }

    @Override
    public void printInfo() {
        System.out.printf("Volume          : %.2f%n", getVolume());
        System.out.printf("Luas permukaan  : %.2f%n", getLuasPermukaan());
        System.out.printf("Massa           : %.2f%n", getMassa());
        System.out.printf("Massa dalam kg  : %.2f%n", konversiKg());
        System.out.printf("Biaya kirim     : Rp%d%n", hitungBiayaKirim());
    }
}
