package PRAKTIKUM_ASLI;

import java.util.Scanner;

public class SEKUNDER_1 extends PRIMER {
    Scanner input = new Scanner(System.in);
    public void PROFILGuru(){
        System.out.print("List : \n(1)Profil Guru\n(2) Karyawan\n\nPilihan Anda : ");
        int a = input.nextInt();
        if (a == 1){
            GURU();
            GURU2();
            GURU3();
        } else if (a == 2){
            KARYAWAN();
            KARYAWAN1();
            KARYAWAN2();

        }
    }
}
