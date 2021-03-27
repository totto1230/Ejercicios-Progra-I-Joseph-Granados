package examenPracticaDrive;

import java.util.Scanner;

public class CompuGrama2 {

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int a = entry.nextInt();

    
            for (int i = 1; i <= a; i++) {
            System.out.print("- ");
            if (a==i){
                System.out.println(" >");
          }
            }
            for (int j = 1; j <= a; j++) {
            System.out.print("- ");
            if (a==j){
                System.out.println(" >");
          }}
            for (int q = 1; q <= a; q++) {
            System.out.print("- ");
            if (a==q){
                System.out.println(" >");
          }}
    }
}
