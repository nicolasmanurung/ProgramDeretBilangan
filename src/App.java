import java.util.Scanner;

public class App {
    // TODO("create variabel for Name, NIM, and numberInput")

    private final int MAX_LENGTH = 25;

    private final int MIN_LENGTH = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Sembarang Angka [5...20] : ");
        int batas = scanner.nextInt();
        int past = 0, current = 1, fibonacci, angka;
        int sumGanjil = 0, sumGenap = 0, sumFibonacci = 0;
        
        System.out.println(batas + " Bilangan Genap");
        for(angka = 1; angka <= batas * 2; angka++) {
            if(angka % 2 == 0) {
                System.out.print(angka + " ");
                sumGenap = sumGenap + angka;
            }
        }
        System.out.printf("\nHasil Penjumlahan = "+sumGenap);
        
        System.out.println("\n");

        System.out.println(batas + " Bilangan Ganjil");
        for(angka = 1; angka <= batas * 2; angka++) {
            if(angka % 2 == 1) {
                System.out.print(angka + " ");
                sumGanjil = sumGanjil + angka;
            }
        }
        System.out.printf("\nHasil Penjumlahan = "+sumGanjil);
        
        System.out.println("\n");
        
        
        System.out.println(batas + " Bilangan Fibonacci");
        for(angka = 1; angka <= batas ; angka++) {
            System.out.print(current + " ");
            fibonacci = past + current;
            past = current;
            current = fibonacci;
            sumFibonacci =  sumFibonacci + past;
        }
        System.out.printf("\nHasil Penjumlahan = "+sumFibonacci);

    }

    //TODO("create function to validate name length")

    //TODO("create function to validate nim length")

    //TODO("create function to validate inputNumber max size")

    //TODO("Refactor code from main to 1 function, we could create showResult function, etc")
}
