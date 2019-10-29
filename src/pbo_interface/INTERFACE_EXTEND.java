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
public class INTERFACE_EXTEND extends PBO_INTERFACE {
    private int b = 8;
    protected void BacaSuper()
    {
        System.out.println("Nilai b : "+b);
        terpotek();
        info ();
    }
}
