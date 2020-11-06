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

import java.util.Scanner;
public class TargetTabungan {

     static Scanner scan = new Scanner(System.in);
    private static Double saldoAwal, bungaAwal, targetSaldo;


    private static void masukkanSaldo(){
        System.out.print("Saldo Awal : Rp. ");
        saldoAwal =  Double.parseDouble(scan.next().replaceAll("[$,.]", ""));
        System.out.print("Bunga/Bulan(%) : ");
        bungaAwal = scan.nextDouble();
        System.out.print("Saldo Target : Rp. ");
        targetSaldo = Double.parseDouble(scan.next().replaceAll("[$,.]", ""));
    }

    public static void main(String[] args) {
        Latihan36TargetSaldoTabunganOO saldoTarget = new Latihan36TargetSaldoTabunganOO();
        masukkanSaldo();
        saldoTarget.hitungSaldo(bungaAwal, saldoAwal, targetSaldo);
        System.out.println("Developed by : Alfi Nurizkya");
    }
}
