import java.util.*;

public class B1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng đơn hàng: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Lỗi số lượng đơn hàng ko hợp lệ");
            return;
        }

        List<Double> fees = new ArrayList<>();

        System.out.println("Nhập phí vận chuyển:");

        for (int i = 0; i < n; i++) {
            System.out.print("Đơn " + (i + 1) + ": ");
            fees.add(sc.nextDouble());
        }

        double min = fees.get(0);
        double max = fees.get(0);
        double sum = 0;

        int express = 0;

        for (double f : fees) {

            if (f < min)
                min = f;

            if (f > max)
                max = f;

            sum += f;

            if (f >= 50)
                express++;
        }

        Set<Double> unique = new HashSet<>(fees);
        List<Double> uniqueList = new ArrayList<>(unique);
        uniqueList.sort(Collections.reverseOrder());

        System.out.println("\nMin: " + min);
        System.out.println("Max: " + max);

        System.out.print("Unique(desc): ");
        for (double u : uniqueList) {
            System.out.print(u + " ");
        }

        System.out.println("\nExpress: " + express);
    }
}