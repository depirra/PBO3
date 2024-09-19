/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nomor2;

/**
 *
 * @author Lenovo AMD3020E
 */
public class DemoKonversiSuhu {
    public static void main(String[] args){
        KonversiSuhu ks = new KonversiSuhu();
        KonversiSuhu2 ks2 = new KonversiSuhu2();
        
        double celciusToFahrenheit = ks.celciusToFahrenheit(36);
        System.out.println("Konversi Suhu Celcius ke Fahrenheit \n36 Celcius = " +celciusToFahrenheit+ " Fahrenheit");
        System.out.println();
        double celciusToReamur = ks.celciusToReamur(30);
        System.out.println("Konversi Suhu Celcius ke Reamur \n30 Celcius = " +celciusToReamur+ " Reamur");
        System.out.println();
        double fahrenheitToReamur = ks2.fahrenheitToReamur(68);
        System.out.println("Konversi Suhu Fahrenheit ke Reamur \n68 Fahrenheit = " +fahrenheitToReamur+ " Reamur");
        System.out.println();
    }
}
