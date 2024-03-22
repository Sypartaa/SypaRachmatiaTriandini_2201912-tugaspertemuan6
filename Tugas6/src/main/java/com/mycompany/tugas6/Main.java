/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas6;

/**
 *
 * @author ASUS
 */
class PersegiPanjang {
private int panjang;
    private int lebar;

    public PersegiPanjang() {
        this.panjang = 0;
        this.lebar = 0;
    }

    public PersegiPanjang(int panjangBaru, int lebarBaru) {
        this.panjang = panjangBaru;
        this.lebar = lebarBaru;
    }

    public int getLuas() {
        return this.panjang * this.lebar;
    }

    public int getKeliling() {
        return 2 * (this.panjang + this.lebar);
    }

    public void setPanjang(int panjangBaru) {
        this.panjang = panjangBaru;
    }

    public void setLebar(int lebarBaru) {
        this.lebar = lebarBaru;
    }
}

public class Main {
    
    public static void main(String[] args) {
        PersegiPanjang persegiPanjang1 = new PersegiPanjang(1, 1);
        PersegiPanjang persegiPanjang2 = new PersegiPanjang(30, 40);
        PersegiPanjang persegiPanjang3 = new PersegiPanjang(25, 35);

        System.out.println("Persegi Panjang 1:");
        System.out.println("Luas: " + persegiPanjang1.getLuas());
        System.out.println("Keliling: " + persegiPanjang1.getKeliling());

        System.out.println("\nPersegi Panjang 2:");
        System.out.println("Luas: " + persegiPanjang2.getLuas());
        System.out.println("Keliling: " + persegiPanjang2.getKeliling());

        System.out.println("\nPersegi Panjang 3:");
        System.out.println("Luas: " + persegiPanjang3.getLuas());
        System.out.println("Keliling: " + persegiPanjang3.getKeliling());
    }
}