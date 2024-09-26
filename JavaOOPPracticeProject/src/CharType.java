import java.util.Scanner;

public class CharType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个字符: ");
        char ch = scanner.next().charAt(0);

        if (ch >= '0' && ch <= '9') {
            System.out.println(ch + "是数字。");
        } else if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println(ch + "是字母。");
        } else {
            System.out.println(ch+"是其他字符。");
        }

        scanner.close();
    }
}
