/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projek.penjualanpakaian;
import java.util.Scanner;
/**
 *
 * @author Intan
 */
public class Program {
    //deklarasi variabel
    String jenis, warna, ukuran;
    int harga, kembali, bayar;
    //method void pendataan
    void Pendataan(){
        //membuat scanner
        Scanner sc = new Scanner(System.in);
        //menerima inputan dari user
        System.out.println("==================================");
        System.out.print("Masukkan Jenis Pakaian      : ");
        jenis = sc.nextLine();
        System.out.print("Masukkan warna Pakaian      : ");
        warna = sc.nextLine();
        System.out.print("Masukkan Ukuran Pakaian     : ");
        ukuran = sc.nextLine();
        System.out.print("Masukkan Harga Pakaian      : ");
        harga = sc.nextInt();
        System.out.print("Jumlah Uang yang anda bayar : ");
        bayar = sc.nextInt();
        System.out.println("==================================");
    }
    //method nonvoid jenis
    String jenis(){
        return jenis; 
    }
    //method nonvoid warna
    String warna(){
        return warna;
    }
    //method nonvoid ukuran
    String ukuran(){
        return ukuran;
    }
    //method nonvoid harga
    int harga(){
        return harga;
    }
    //method nonvoid bayar
    int bayar(){
        return bayar;
    }
    //method nonvoid kembali
    int kembali(){
        //percabangan
        if(bayar>=harga){ //untuk menampilkan kembalian
            kembali = bayar-harga;
            System.out.println("Kembalian Uang Anda      : "+kembali);
        }else{ //untuk menampilkan uang yang kurang
            kembali = harga-bayar;
            System.out.println("Uang anda Kurang sebesar : "+kembali);
        }
        return kembali;
    }
}
