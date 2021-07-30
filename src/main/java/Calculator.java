import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введите число" );
        int i = in.nextInt();
        System.out.println("введите знак" );
        String s = in.next();
        System.out.println("введите число" );
        int j = in.nextInt();
        int rsl = 0;
        switch (s){
            case("+"):
                rsl = i + j;
                System.out.println(rsl);
                break;
            case("-"):
                rsl = i - j;
                System.out.println(rsl);
                break;
            case("*"):
                rsl = i * j;
                System.out.println(rsl);
                break;
            case("/"):
                rsl = i / j;
                System.out.println(rsl);
                break;
            default:
                System.out.println("Неправильный ввод" );
                break;

        }

    }
}
