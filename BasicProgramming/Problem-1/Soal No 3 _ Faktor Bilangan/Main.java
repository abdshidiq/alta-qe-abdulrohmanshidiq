import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Masukan Angka : ");
        int bilanganPrima = myObj.nextInt();  // Read user input
        for (int i=1; i<=bilanganPrima; i++){
            if(bilanganPrima % i == 0){
                System.out.println(i);
            }

        }

        int bilangan = 0;
        int i = 1;
        while(i<=bilangan){
            if (bilangan %i == 0){
                System.out.println(i);
            }
            i++;
        }
    }
}
