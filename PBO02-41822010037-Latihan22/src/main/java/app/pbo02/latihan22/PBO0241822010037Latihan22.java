/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package app.pbo02.latihan22;
import java.util.Scanner;
/**
 *
 * @author DelDel
 * Nama : Syadella Putri
 * NIM  : 41822010037
 * Nama : Anastasya Azami
 * NIM  : 41822010081
 */
public class PBO0241822010037Latihan22 {
     public static boolean cekInput(String diameter){
        try{
            Double.valueOf(diameter);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
     }
    public static void main(String[] args) {
        System.out.println("FOrmat Latihan PBO");
        
        Scanner input = new Scanner(System.in);
        boolean Cekinputan = false;
        
        while (!Cekinputan) {
            System.out.print("Masukkan nilai diameter lingkaran : ");
            String diameter = input.nextLine();

            if (cekInput(diameter)) {
                double jariJari = Double.parseDouble(diameter) / 2;
                double luas = Math.PI * Math.pow(jariJari, 2);
                double keliling = 2 * Math.PI * jariJari;
                
                String formatJariJari = String.format("%.2f", jariJari);
                String formatLuas = String.format("%.2f", luas);
                String formatKeliling = String.format("%.2f", keliling);
                
                System.out.println("Jari Jari Lingkaran : " + formatJariJari + " cm");
                System.out.println("Luas Lingkaran : " + formatLuas + " cm");
                System.out.println("Keliling Lingkaran : " + formatKeliling + " cm");
                
                Cekinputan = true; 
            } else {
                System.out.println("Nilai Diameter Tidak Sesuai");
            }
        }
    }
}
