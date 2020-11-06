/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan36.targetsaldotabungan.oo;

/**
 *
 * @author Alfi Nurizkya
 * NAMA     : ALFI NURIZKYA
 * KELAS    : IF-1
 * NIM      : 10119036
 * DESKRIPSI PROGRAM : Membuat Data Program Saldo Tabungan Berbasis Object Oriented
 */

import java.util.Locale;
public class Latihan36TargetSaldoTabunganOO {

    Locale locale = Locale.forLanguageTag("id");
    private double bunga;

    private void hitungBunga(double bungaAwal){
        bunga = bungaAwal / 100;
    }

    public void hitungSaldo(Double bungaAwal, Double saldo, Double target   ){
        hitungBunga(bungaAwal);
        int num = 1;
        while(saldo <= target){
            saldo = saldo + (saldo * bunga);
            tampilSaldo(saldo, num);
            num++;
        }
    }

    private void tampilSaldo(double saldo, int num){
        System.out.print("Saldo di bulan ke-"+num+" Rp. ");
        System.out.printf(locale, "%,.0f%n", saldo);
    }
}