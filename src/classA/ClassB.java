/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classA;

/**
 *
 * @author H4NS
 */
public class ClassB extends ClassA{
    private int b ;
    public void setB(int nilai){
        b= nilai;
    }
    public int getB(){
        return b; 
    }
    public void tampilkanNilai(){
        super. tampilkanNilai();
        System.out.println("Nilai b : "+getB());
    }
}
