/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konversisuhu;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class KonversiSuhu {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                double fahrenheit , celcius ;

        Scanner input = new Scanner(System.in);

        System.out.println("masukan suhu dalam celcius");

        celcius = input.nextInt();

        fahrenheit = celcius * 9/5 + 32;

        System.out.println("Hasil konversi suhu dari celcius ke fahrenheit:" +fahrenheit);
    }
    
}

