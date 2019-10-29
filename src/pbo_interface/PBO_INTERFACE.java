/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_interface;

/**
 *
 * @author H4NS
 */
public class PBO_INTERFACE {
private int a = 10;

protected void terpotek(){
    System.out.println("Method Ini Hanya Untuk Anaknya");
}
public void info(){
    System.out.println("a= "+a);
    System.out.println("Dipanggil pada = "+this.getClass().getName());
}
}
    

