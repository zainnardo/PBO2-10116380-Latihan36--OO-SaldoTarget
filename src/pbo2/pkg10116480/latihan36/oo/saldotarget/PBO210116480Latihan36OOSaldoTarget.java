/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116480.latihan36.oo.saldotarget;

/**
 * @author 
 * Nama  : Zain Achmad Rizqullah
 * Nim   : 10116380
 * Kelas : PBO2
 * Deskripsi Program : program ini tentang perhitungan saldo tabungan menggunakan
 * OO
 */
public class PBO210116480Latihan36OOSaldoTarget {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int saldoTab = 3500000;
        double bungaBul = 0.08;
        double saldoBul = 6000000;

        TargetSaldo tar = new TargetSaldo();
        tar.hitungTargetSaldo(saldoTab, bungaBul, saldoBul);
    }
    
}
