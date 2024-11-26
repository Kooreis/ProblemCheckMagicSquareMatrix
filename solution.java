import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the square matrix:");
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];