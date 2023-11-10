
package javaapplication1;
import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nama,alamat;
        int kode;
        int infus;
        int obat;
        int inap;
        int total_biaya;
        
        
        System.out.println("==============");
        System.out.println("=====IHCC=====");
        System.out.println("==============");
        
        
        System.out.print("Masukan nama pasien: ");
        nama = input.next();
        
        System.out.print("Masukan alamat pasien: ");
        alamat = input.next();
        
        System.out.print("Masukan kode pasien: ");
        kode = input.nextInt();
        
        System.out.print("Masukan jumlah infus: ");
        infus = input.nextInt();
        
        System.out.print("Masukan jumlah obat habis konsumsi oleh pasien: ");
        obat = input.nextInt();
        
        System.out.print("Masukan jumlah inap habis konsumsi oleh pasien: ");
        inap = input.nextInt();
        
        System.out.print("total_biaya: Rp. ");
        System.out.println(total_biaya = + inap*50_000 + obat*50_000 + infus*50_000);
        
        System.out.println("===================================");
                
        System.out.println( "pasien atas nama : " + nama); 
        System.out.println("dengan alamat : "+ alamat);
        System.out.println("kode : " + kode);
        System.out.println("total_biaya :"+" Rp."+total_biaya);
        
        
        System.out.println("=========Terimakasih================");
    }
    
}
