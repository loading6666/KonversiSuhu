/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konversisuhu;



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
                double fahrenheit ;



        System.out.println("masukan suhu dalam celcius");
        System.out.println("10");

        double celcius = 10;

        fahrenheit = celcius * 9/5 + 32;

        System.out.println("Hasil konversi suhu dari celcius ke fahrenheit:" +fahrenheit);
    }
    
}

