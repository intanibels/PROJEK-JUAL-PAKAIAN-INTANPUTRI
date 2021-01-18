/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projek.penjualanpakaian;
/**
 *
 * @author Intan
 */
public class PROJEKPenjualanPakaian {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //membuat judul
        System.out.println("<< PENJUALAN PAKAIAN >>");
        Program output = new Program();
        //menampilkan hasil output dari class Program
        output.Pendataan();
        System.out.println("Jenis Pakaian  : "+output.jenis());
        System.out.println("Warna Pakaian  : "+output.warna());
        System.out.println("Ukuran Pakaian : "+output.ukuran());
        System.out.println("Harga Pakaian  : "+output.harga());
        System.out.println("Bayar          : "+output.bayar());
        output.kembali();
    }    
}
