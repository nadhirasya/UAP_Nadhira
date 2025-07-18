package uap.models;

import uap.bases.CetakanDonat;
import uap.interfaces.Hitung;
import uap.interfaces.Konversi;
import uap.interfaces.Cetak;

public class Torus extends CetakanDonat implements Hitung, Konversi, Cetak {
    private double rTorus, rLubang;

    public Torus(double rTorus, double rLubang) {
        this.rTorus = rTorus;
        this.rLubang = rLubang;
    }

    @Override
    public double getVolume() {
        return 2 * PI * PI * rTorus * rLubang * rLubang;
    }

    @Override
    public double getLuasPermukaan() {
        return 4 * PI * PI * rTorus * rLubang;
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
        return (int) Math.ceil(konversiKg()) * 5000;
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
