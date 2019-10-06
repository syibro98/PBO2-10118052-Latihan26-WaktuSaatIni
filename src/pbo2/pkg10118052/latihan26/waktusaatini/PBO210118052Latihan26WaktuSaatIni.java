/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118052.latihan26.waktusaatini;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
/**
 * @author 
 * NAMA      : Bagus Syibro Malisi
 * KELAS     : PBO2
 * NIM       : 10118052
 * Deskripsi Program : Program ini bertujuan untuk melihat waktu sekarang
 * 
 */
public class PBO210118052Latihan26WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SimpleDateFormat df = new SimpleDateFormat("EEEE, dd MMM"
                + " YYYY HH:mm:ss", new Locale("id"));
        System.out.println(df.format(new Date()));
    }
    
}