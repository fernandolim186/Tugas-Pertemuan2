package app;

import java.util.Scanner;

public class kubus {
    public static void main(String[] args) {
        float sisi;

        Scanner Input = new Scanner(System.in);

        System.out.println("Program Menghitung Volume dan Luas Kubus");
        System.out.println("sisi ? ");
        sisi = Input.nextFloat();

        float Luas = 6 *(sisi*sisi);
        float Volume = sisi*sisi*sisi;

        System.out.println("Luas Permukaan Kubus adalah : " + Luas);
        System.out.println("Volume kubus adalah : " + Volume);
        Input.close();
    }

}