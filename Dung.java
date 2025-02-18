import java.util.Scanner;

public class Dung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên để kiểm tra xem nó có phải số nguyên tố không: ");
        int n = scanner.nextInt();
        scanner.close();

        if (n < 2) {
            System.out.println(n + " không phải số nguyên tố đâu, bé quá!");
        } else if (isPrime(n)) {
            System.out.println(n + " là số nguyên tố! Thật tuyệt vời!");
        } else {
            System.out.println(n + " không phải số nguyên tố, tiếc ghê!");
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n/2; i++) {
            if (n % i == 0) {
                System.out.println("Ồ không! " + n + " chia hết cho " + i + " rồi!");
                return false;
            }
        }
        return true;
    }
}
