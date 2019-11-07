/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116584_latihan42_tabungan;

/**
 *
 * @author syhar
 */
public class Tabungan {
    
    public int saldo;
    public int jumlah;

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    public int tabungan (int parSaldo){
        return saldo;
    }
    public int ambilUang (int parJumlah){
        return tabungan(saldo) - jumlah;        
    }
    
    public void saldoSekarang(){
        System.out.println("Saldo Anda Sekarang = "+ambilUang(saldo));
        
    }
    
    
    
    
}
