/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan_5;

/**
 *
 * @author H4NS
 */
public class TRUCK {
    public int cadence;
    public int gear;
    public int speed;
    
    public  TRUCK(int startCadence, int startSpeed, int startGear){
        gear= startGear;
        cadence= startCadence;
        speed = startSpeed;
    }
    public void setCadence (int newValue){
        cadence = newValue;
    }
    public void setGear(int newValue){
        gear=newValue;
    }
    public void applybeake(int decrement){
        speed=decrement;
    }
    public void speedUp(int increment){
        speed = increment;
    }
    
}
