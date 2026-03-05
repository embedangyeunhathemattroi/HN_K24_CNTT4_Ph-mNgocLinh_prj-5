import java.util.*;

public class CategoryB2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập chuỗi danh mục (cách nhau bởi dấu phẩy):");
        String input = sc.nextLine();

        if (input.trim().isEmpty()) {
            System.out.println("Lỗi chuỗi không hợp lệ");
            return;
        }

        String[] arr = input.split(",");

        Map<String, Integer> map = new HashMap<>();

        // đếm số lần xuất hiện
        for (String s : arr) {

            String key = s.trim().toLowerCase();

            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        System.out.println("Thong ke:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

        System.out.println("Nhập danh mục cần tìm:");
        String search = sc.nextLine().toLowerCase();

        int result = map.getOrDefault(search, 0);

        System.out.println("Search \"" + search + "\": " + result);

        sc.close();
    }
}