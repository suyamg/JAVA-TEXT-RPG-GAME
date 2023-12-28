package Map;

import Character.Hero;

import java.util.Scanner;

public class PotionStore extends Map {
    // 포션 상점 관련 코드
    Scanner in = new Scanner(System.in);
    Hero hero = new Hero();

    public void potion(Hero hero) {
        System.out.println("1. 힘 증강 포션 (30원)");
        System.out.println("2. 방어력 증강 포션 (30원)");
        System.out.println("3. 경험치 증강 포션 (100원)");
        System.out.println("4. HP 증강 포션 (10원)");
        System.out.println("5. MP 증강 포션 (10원)");
        System.out.print("원하는 포션의 해당 번호를 입력하세요. : ");
        int a = in.nextInt();
        System.out.println();

        System.out.println("포션 상점에서 물건을 구매 시도하는 중입니다.");
        if (a == 1) {
            if (hero.money >= 30) {
                hero.money -= 30;
                hero.power += 3;
                System.out.println("구입이 완료되었습니다.");
                System.out.println("현재 잔액 : " + hero.money);
            } else {
                System.out.println("잔액 부족");
                System.out.println("현재 잔액 : " + hero.money);

            }
        } else if (a == 2) {
            if (hero.money >= 30) {
                hero.money -= 30;
                hero.defense += 3;
                System.out.println("구입이 완료되었습니다.");
                System.out.println("현재 잔액 : " + hero.money);
            } else {
                System.out.println("잔액 부족");
                System.out.println("현재 잔액 : " + hero.money);


            }
        } else if (a == 3) {
            if (hero.money >= 100) {
                hero.money -= 100;
                hero.experience += 50;
                System.out.println("구입이 완료되었습니다.");
                System.out.println("현재 잔액 : " + hero.money);
            } else {
                System.out.println("잔액 부족");
                System.out.println("현재 잔액 : " + hero.money);

            }
        } else if (a == 4) {
            if (hero.money >= 10) {
                hero.money -= 10;
                hero.hp += 50;
                System.out.println("구입이 완료되었습니다.");
                System.out.println("현재 잔액 : " + hero.money);
            } else {
                System.out.println("잔액 부족");
                System.out.println("현재 잔액 : " + hero.money);

            }
        } else if (a == 5) {
            if (hero.money >= 10) {
                hero.money -= 10;
                hero.mp += 50;
                System.out.println("구입이 완료되었습니다.");
                System.out.println("현재 잔액 : " + hero.money);
            } else {
                System.out.println("잔액 부족");
                System.out.println("현재 잔액 : " + hero.money);

            }
        } else {
            System.out.println("잘못 입력하셨습니다. 번호를 다시 입력하세요.");

        }
    }
}
