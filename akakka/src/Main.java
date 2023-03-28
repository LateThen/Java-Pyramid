import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    int height = scanner.nextInt();
    int heighttwo = height;
    int numbercount = 1;
        for (int i = 1; i <= height; i++) {
            for (int y = heighttwo; y > 0; y--) {
                System.out.print(" ");
            }
            heighttwo--;
            for (int j = 0; j < numbercount; j++) {
                System.out.print((i % 2 == 0) ? 2: 1);
            }
                numbercount++;
                System.out.println(" ");
            }

        }}