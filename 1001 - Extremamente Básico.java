import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);
		int a;
		int b;
		int x;
		
		a = dados.nextInt();
		b = dados.nextInt();
		
		x = a + b;
		
        System.out.printf("X = %d\n", x);
	}
}
