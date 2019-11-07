/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116584_latihan42_tabungan;

import java.util.Scanner;

/**
 *
 * @author syhar
 */
public class PBOUlang_10116584_Latihan42_Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tabungan tabungan = new Tabungan();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("====Program Penarikan Uang====");
        System.out.print("Masukan Saldo = ");
        tabungan.saldo = scan.nextInt();
        System.out.print("Jumlah Uang yang akan diambil = ");
        tabungan.jumlah = scan.nextInt();
       
        tabungan.saldoSekarang();
        
    }
    
}
