package Day01;

import java.util.Scanner;

public class ScannerMain {
        public static void main(String[] args)
            Scanner sc = new Scanner(System.in);
            System.out.println("정수를 하나만 입력해주세요");
            int a = sc.nextInt();

            sc.nextLine();
            System.out.println("a:" + a);
            System.out.println("문자를 입력해주세요");
            String str = sc.nextLine();
            System.out.println("str;" + str);
        }





