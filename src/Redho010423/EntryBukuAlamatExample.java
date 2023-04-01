/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Redho010423;

/**
 *
 * @author septa
 */
import java.util.Scanner;
public class EntryBukuAlamatExample {
    public static void main(String[] args){
        EntryBukuAlamat[] data = new EntryBukuAlamat[100];
        EntryBukuAlamat temp = new EntryBukuAlamat();
        Scanner in = new Scanner(System.in);
        int menu=0;
        int i =0;
        while(menu!=5){
            System.out.println("Pilih menu");
            System.out.println("1.Masukkan data");
            System.out.println("2.Menghapus data");
            System.out.println("3.menampilkan seluruh data");
            System.out.println("4.update data");
            System.out.println("5.Selesai");
            
            menu =in.nextInt();
            
            if(menu == 1){
                //menambahkan
                System.out.print("Masukkan nama: ");
                in.nextLine();
                String nama = in.nextLine();
                temp.setNama(nama);

                System.out.print("Masukkan alamat: ");
                String alamat = in.nextLine();
                temp.setAlamat(alamat);

                System.out.print("Masukkan notlp: ");
                String notlp = in.nextLine();
                temp.setNotlp(notlp);

                System.out.print("Masukkan alamatemail: ");
                String alamatemail = in.nextLine();
                temp.setAlamatemail(alamatemail);
                
                data[i]=temp;
                i++;
                temp = new EntryBukuAlamat();
            }
            else if (menu == 2 ){
                 //hapus data
                temp.setNama("");
                temp.setAlamat("");
                temp.setNotlp(""); 
                temp.setAlamatemail("");
                
                data[i-1]=temp;
                 i--;
                temp = new EntryBukuAlamat();
            }
            else if (menu == 3){
                //menampilkan
                for(int j = 0; j<i; j++){
                    
                System.out.println("=================================");
                System.out.println("Nama            :"+data[j].getNama());
                System.out.println("Alamat          :"+data[j].getAlamat());
                System.out.println("Notlp           :"+data[j].getNotlp());
                System.out.println("Alamatemail     :"+data[j].getAlamatemail());
                }
            }
            else if (menu == 4){
                //update data
                System.out.print("Masukkan nama: ");
                 in.nextLine();
                String nama = in.nextLine();
                temp.setNama(nama);

                System.out.print("Masukkan alamat: ");
                String alamat = in.nextLine();
                temp.setAlamat(alamat);

                System.out.print("Masukkan notlp: ");
                String notlp = in.nextLine();
                temp.setNotlp(notlp);

                System.out.print("Masukkan alamatemail: ");
                String alamatemail = in.nextLine();
                temp.setAlamatemail(alamatemail);
                
                data[i-1]=temp;
                temp = new EntryBukuAlamat();
            }
        }
       
    }
}
