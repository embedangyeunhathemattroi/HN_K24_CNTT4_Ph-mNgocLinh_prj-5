import java.util.*;

public class StackB3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Hãy nhập biểu thức: ");
        String input = sc.nextLine();

        if (input.trim().isEmpty()) {
            System.out.println("Lỗi: biểu thức không hợp lệ");
            return;
        }

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {

            // ngoặc mở
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }

            // ngoặc đóng
            else if (c == ')' || c == ']' || c == '}') {

                if (stack.isEmpty()) {
                    System.out.println("false");
                    return;
                }

                char top = stack.pop();

                if ((c == ')' && top != '(') ||
                        (c == ']' && top != '[') ||
                        (c == '}' && top != '{')) {

                    System.out.println("false");
                    return;
                }
            }
        }

        if (stack.isEmpty()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        sc.close();
    }
}