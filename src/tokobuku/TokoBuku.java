
package tokobuku;
import java.util.Scanner;
public class TokoBuku {

    public static void main(String[] args) {
        Scanner baca = new Scanner (System.in);
        System.out.println("===== Selamat Datang =====");
        
        String nama;
        String nb;
        double hargaBarang;
        int kodeBarang;
        double harga ;
        double hargaBayar;
        int jumlahBarang;
        double diskon1;
        double diskon2;
        double diskon3;
        // potongan harga
        double ph1;
        double ph2;
        double ph3;
        
        System.out.println("Nama Kasir : ");
        nama = baca.next();
        System.out.println("Nama Barang : ");
        nb = baca.next();
        System.out.println("Kode Barang : ");
        kodeBarang = baca.nextInt();
        System.out.println("Harga Barang : ");
        hargaBarang = baca.nextDouble();
        System.out.println("Jumlah Barang : ");
        jumlahBarang = baca.nextInt();
        
        // hitungan
        harga=hargaBarang*jumlahBarang;
        ph1= harga*0.1;
        diskon1=harga-ph1;
        ph2=harga*0.2;
        diskon2=harga-ph2;
        ph3=harga*0.5;
        diskon3=harga-ph3;
        
        
        if (harga<=100000){
            System.out.println("Harga : "+ harga);
        }
      
        else if (harga > 500000){
            System.out.println("Harga                  : "+ harga);
            System.out.println("Anda Mendapat potongan : "+ ph3);
            System.out.println("Harga Bayar            : "+diskon3);
        }
        else if (harga > 200000){
            System.out.println("Harga                  : "+ harga);
            System.out.println("Anda Mendapat potongan : "+ ph2);
            System.out.println("Harga                  : "+diskon2);     
        }
          else if (harga > 100000){
            System.out.println("Harga                  : "+ harga);
            System.out.println("Anda Mendapat potongan : "+ ph1);
            System.out.println("Harga                  : "+ diskon1);
        }
       
        System.out.println(" ");
        System.out.println("===== Terima Kasih =====");
        
 
       
        
        
        
        
        
        
     
  
    }
    
}
