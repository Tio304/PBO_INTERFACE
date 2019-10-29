/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INTERFACE_LATIHAN_KE_2;

/**
 *
 * @author H4NS
 */
public class INTERFACE_LAT_2_BAG_1 {
    private String nama;
   private int usia;
 //konstruktor
   public INTERFACE_LAT_2_BAG_1(String nama, int usia){
       this.nama = nama;
       this.usia = usia;
   }
   //metode
   public void info (){
       System.out.println("Nama : "+this.nama);
       System.out.println("Usia : "+ this.usia);
   }
}
