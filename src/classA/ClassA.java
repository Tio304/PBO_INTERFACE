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
public class ClassA {
    private int a;
    public void setA (int nilai){
        a = nilai;
    }
    public int getA(){
        return a;
    }
    public void tampilkanNilai(){
        System.out.println("Nilai a : "+ getA());
    }
}

