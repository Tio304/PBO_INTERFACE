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
 class EMPLOYES extends  INTERFACE_LAT_2_BAG_1  {
    private String noKaryawan;
    public EMPLOYES(String noKaryawan, String nama, int usia) {
        super(nama, usia);
        this.noKaryawan=noKaryawan;
    }

    
    public void info()
    {
        System.out.println("No. Karyawan : "+ this.noKaryawan);
        super.info();
    }
    
}
