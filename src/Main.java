import java.util.Scanner;

import static sun.net.util.IPAddressUtil.scan;

public class Main {
    public static String scan() {
        System.out.println("введите строку");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public static void main(String[] args) {
        WordCount count = new WordCount(scan());
        count.printResult();

    }
}