package dai37kai;

import java.util.*;

public class Main {
    public static void main(String[] args){
        System.out.println("戦艦ゲーム");

        Scanner scanner = new Scanner(System.in);

        System.out.println("爆弾のX座標を入力してください(1-5)");
        int num1 = scanner.nextInt();
        System.out.println(num1);

        System.out.println("爆弾のY座標を入力してください(1-5)");
        int num2 = scanner.nextInt();
        System.out.println(num2);

        Random rnd = new Random();

        int value = rnd.nextInt(5);

        System.out.println(value);

        
    }
}
