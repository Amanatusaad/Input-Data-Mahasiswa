/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biodatamahasiswa;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Mahasiswa {
    int mennu, pilih;
    
    ArrayList<String> nama = new ArrayList<>();
    ArrayList<String> nim = new ArrayList<>();
    ArrayList<Integer> gender = new ArrayList<>();
    ArrayList<String> ttl = new ArrayList<>();
    void tambahData(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nama Mahasiswa \t:");
        nama.add(input.nextLine());
        System.out.println("NIM Mahasiswa \t:");
        nim.add(input.nextLine());
        System.out.println("Jenis Kelamin (0: Laki-laki, 1: Perempuan)\t:");
        gender.add(input.nextInt());
        input.nextLine();
        System.out.println("Tanggal Lahir \t:");
        ttl.add(input.nextLine());
        System.out.println("");
    }
    void hapusData(){
        System.out.println("Masukan NIM dari Data Mahasiswa yang ingin dihapus");
        Scanner input = new Scanner(System.in);
        String y = input.nextLine();
        int b = nim.indexOf(y);
        nama.remove(b); nim.remove(b); gender.remove(b); ttl.remove(b);
        
    }
    void cariData(){
        System.out.print("\nInput Data yang akan dicari :\n" + "1. Nama Mahasiswa\n" + "2. NIM\n");
        System.out.println("Pilih Nomor Menu : ");
        Scanner submenu = new Scanner(System.in);
        pilih = submenu.nextInt();
        if (pilih == 1){
            Scanner input = new Scanner(System.in);
            System.out.println("Masukan Nama");
            String y = input.nextLine();
            int b = nama.indexOf(y);
            System.out.println("Nama Mahasiswa \t:" + nama.get(b) + "\n" + "NIM \t\t:" + nim.get(b) + "\n"
                    + "Jenis Kelamin (0: Laki-laki, 1: Perempuan):" + gender.get(b) + "\n" + "Tangal Lahir \t:" + ttl.get(b));
        }
        else if (pilih == 2){
            Scanner masuk = new Scanner(System.in);
            System.out.println("Masukan NIM : ");
            String x = masuk.nextLine();
            int a = nim.indexOf(x);
            System.out.println("Nama Mahasiswa \t:" + nama.get(a) + "\n" + "NIM \t\t:" + nim.get(a)+ "\n" 
                    + "Jenis Kelamin (0: Laki-laki, 1: Perempuan):" + gender.get(a) + "\n" + "Tangal Lahir \t:" + ttl.get(a));
        }
        
    }
    void tampilData(){
        System.out.println("isi data Mahasiswa :\n" + "Nama Mahasiswa \t:" + this.nama + "\n" + "NIM \t\t:"
                + this.nim+ "\n" + "Jenis Kelamin (0: Laki-laki, 1: Perempuan):" + this.gender
                + "\n" + "Tangal Lahir \t:" + this.ttl);
    }
    void menu(){
        while(true){
            System.out.println("***************************\n" + "\tMenu Utama\n" + "***************************");
            System.out.println("Menu:\n" + "1. Tambah Data\n" + "2. Hapus Data\n" + "3. Cari Data\n" + "4. Tampil Data");
            System.out.println("Pilih Nomor Menu : ");
            Scanner angka = new Scanner(System.in);
            mennu = angka.nextInt();
            if (mennu==1){
                this.tambahData();
            }
            else if(mennu == 2){
                this.hapusData();
            }
            else if(mennu == 3){
                this.cariData();
            }
            else if(mennu == 4){
                this.tampilData();
            }
            else {
                break;
            }
        }
    }
}


