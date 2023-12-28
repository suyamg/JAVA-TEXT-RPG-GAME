package Map;

import Character.Hero;

import java.util.Scanner;

public class WeaponStore extends Map {
    Scanner in = new Scanner(System.in);
    public Hero hero;

    public void Weapon(Hero hero) {
        this.hero = hero;
        System.out.println("*********************");
        System.out.println("****무기 상점에 온 것을 환영합니다*****");
        System.out.println("*********************");

        System.out.println("****무기 상점 튜토리얼*****");
        if (hero.job.equals("전사")) {
            System.out.println("당신의 직업은 전사입니다. 당신이 선택할 수 있는 무기는 망치, 도끼, 대검입니다. ");
            System.out.println("1. 망치 (200)");
            System.out.println(": 망치는 lv2부터 구매가능합니다. 살쾡이에게 치명적인 무기입니다.");
            System.out.println("2. 도끼 (400)");
            System.out.println(": 도끼는 lv3부터 구매가능합니다. 또한, 망치를 소유하고 있어야지만 구매가 가능합니다. 들개에게 치명적인 무기입니다.");
            System.out.println("3. 대검 (600)");
            System.out.println(": 대검은 lv5부터 구매가능합니다. 또한, 망치과 도끼를 소유하고 있어야지만 구매가 가능합니다. 멧돼지에게 치명적인 무기입니다.");

            System.out.println("*********************");
            System.out.println("***********상점**********");

            System.out.println("1. 망치 (400)");
            if (hero.level >= 3 && hero.weaponstat1 >= 1) {
                System.out.println("2. 도끼 (600)");
            } if (hero.level >= 5 &&  hero.weaponstat2 >= 1) {
                System.out.println("3. 대검 (800)");
            }
            System.out.println("원하는 무기의 해당 번호를 입력하세요: ");
            int a = in.nextInt();
            in.nextLine();

            if (a == 1) {
                if (hero.mp >= 400) {
                    hero.weaponstat1 += 1;
                    hero.mp -= 400;

                    System.out.println("구입이 완료되었습니다.");
                    System.out.println("현재 Magic Points : " + hero.mp);
                } else {
                    System.out.println("Magic Points 부족");
                    System.out.println("현재 Magic Points : " + hero.mp);

                }
            } else if (a == 2) {
                if (hero.level < 3 || hero.weaponstat1 == 0) {
                    System.out.println("현재 살 수 없는 무기 번호를 입력했습니다.");

                } else {
                    if (hero.mp >= 600) {
                        hero.weaponstat2 += 1;
                        hero.mp -= 600;

                        System.out.println("구입이 완료되었습니다.");
                        System.out.println("현재 Magic Points : " + hero.mp);
                    } else {
                        System.out.println("Magic Points 부족");
                        System.out.println("현재 Magic Points : " + hero.mp);

                    }
                }
            } else if (a == 3) {
                if (hero.level <= 4 && hero.weaponstat1 < 1 || hero.weaponstat2 < 1) {
                    System.out.println("현재 살 수 없는 무기 번호를 입력했습니다.");

                } else {
                    if (hero.mp >= 800) {
                        hero.weaponstat3 += 1;
                        hero.mp -= 800;

                        System.out.println("구입이 완료되었습니다.");
                        System.out.println("현재 Magic Points : " + hero.mp);
                    } else {
                        System.out.println("Magic Points 부족");
                        System.out.println("현재 Magic Points : " + hero.mp);

                    }
                }
            } else {
                System.out.println("잘못 입력하셨습니다. 번호를 다시 입력하세요.");
            }
        } else if (hero.job.equals("마법사")) {
            System.out.println("당신의 직업은 마법사입니다. 당신이 선택할 수 있는 무기는 불 속성 마법 지팡이, 물 속성 마법 지팡이, 전기 속성 마법 지팡이입니다. ");
            System.out.println("1. 불 속성 마법 지팡이 (400)");
            System.out.println(": 불 속성 마법 지팡이는 lv2부터 구매가능합니다. 살쾡이에게 치명적인 무기입니다.");
            System.out.println("2. 물 속성 마법 지팡이 (600)");
            System.out.println(": 물 속성 마법 지팡이는 lv3부터 구매가능합니다. 또한, 불 속성 마법 지팡이를 소유하고 있어야지만 구매가 가능합니다. 들개에게 치명적인 무기입니다.");
            System.out.println("3. 전기 속성 마법 지팡이 (800)");
            System.out.println(": 전기 속성 마법 지팡이는 lv5부터 구매가능합니다. 또한, 불 속성 마법 지팡이와 전기 속성 마법 지팡이를 소유하고 있어야지만 구매가 가능합니다. 멧돼지에게 치명적인 무기입니다.");
            System.out.println("*********************");
            System.out.println("***********상점**********");
            System.out.println("1. 불 속성 마법 지팡이 (400)");
            if (hero.level >= 3 && hero.weaponstat1 >= 1) {
                System.out.println("2. 물 속성 마법 지팡이 (600)");
            } if (hero.level >= 5 &&  hero.weaponstat2 >= 1) {
                System.out.println("3. 전기 속성 마법 지팡이 (800)");
            }
            System.out.println("원하는 무기의 해당 번호를 입력하세요: ");
            int a = in.nextInt();
            in.nextLine();


            if (a == 1) {
                if (hero.mp >= 400) {
                    hero.weaponstat1 += 1;
                    hero.mp -= 400;
                    System.out.println("구입이 완료되었습니다.");
                    System.out.println("현재 Magic Points : " + hero.mp);
                } else {
                    System.out.println("Magic Points 부족");
                    System.out.println("현재 Magic Points : " + hero.mp);

                }
            } else if (a == 2) {
                if (hero.level < 3 || hero.weaponstat1 == 0) {
                    System.out.println("현재 살 수 없는 무기 번호를 입력했습니다.");

                } else {
                    if (hero.mp >= 600) {
                        hero.weaponstat2 += 1;
                        hero.mp -= 600;

                        System.out.println("구입이 완료되었습니다.");
                        System.out.println("현재 Magic Points : " + hero.mp);
                    } else {
                        System.out.println("Magic Points 부족");
                        System.out.println("현재 Magic Points : " + hero.mp);

                    }
                }
            } else if (a == 3) {
                if (hero.level <= 4 && hero.weaponstat1 < 1 || hero.weaponstat2 < 1) {
                    System.out.println("현재 살 수 없는 무기 번호를 입력했습니다.");

                } else {
                    if (hero.mp >= 800) {
                        hero.weaponstat3 += 1;
                        hero.mp -= 800;

                        System.out.println("구입이 완료되었습니다.");
                        System.out.println("현재 Magic Points : " + hero.mp);
                    } else {
                        System.out.println("Magic Points 부족");
                        System.out.println("현재 Magic Points : " + hero.mp);

                    }
                }
            } else {
                System.out.println("잘못 입력하셨습니다. 번호를 다시 입력하세요.");
            }
        } else if (hero.job.equals("궁수")) {
            System.out.println("당신의 직업은 궁수입니다. 당신이 선택할 수 있는 무기는 활, 석궁, 창입니다. ");
            System.out.println("1. 활 (400)");
            System.out.println(": 활은 lv2부터 구매가능합니다. 살쾡이에게 치명적인 무기입니다.");
            System.out.println("2. 석궁 (600)");
            System.out.println(": 석궁은 lv3부터 구매가능합니다. 또한, 활을 소유하고 있어야지만 구매가 가능합니다. 들개에게 치명적인 무기입니다.");
            System.out.println("3. 창 (800)");
            System.out.println(": 창은 lv5부터 구매가능합니다. 또한, 활과 석궁을 소유하고 있어야지만 구매가 가능합니다. 멧돼지에게 치명적인 무기입니다.");
            System.out.println("*********************");
            System.out.println("***********상점**********");
            System.out.println("1. 활 (200)");
            if (hero.level >= 3 && hero.weaponstat1 >= 1) {
                System.out.println("2. 석궁 (400)");
            } if (hero.level >= 5 &&  hero.weaponstat2 >= 1) {
                System.out.println("3. 창 (600)");
            }
            System.out.println("원하는 무기의 해당 번호를 입력하세요: ");
            int a = in.nextInt();

            if (a == 1) {
                if (hero.mp >= 400) {
                    hero.weaponstat1 += 1;
                    hero.mp -= 400;

                    System.out.println("구입이 완료되었습니다.");
                    System.out.println("현재 Magic Points : " + hero.mp);
                } else {
                    System.out.println("Magic Points 부족");
                    System.out.println("현재 Magic Points : " + hero.mp);

                }
            } else if (a == 2) {
                if (hero.level < 3 && hero.weaponstat1 == 0) {
                    System.out.println("현재 살 수 없는 무기 번호를 입력했습니다.");

                } else {
                    if (hero.mp >= 600) {
                        hero.weaponstat2 += 1;
                        hero.mp -= 600;

                        System.out.println("구입이 완료되었습니다.");
                        System.out.println("현재 Magic Points : " + hero.mp);
                    } else {
                        System.out.println("Magic Points 부족");
                        System.out.println("현재 Magic Points : " + hero.mp);

                    }
                }
            } else if (a == 3) {
                if (hero.level < 4 && hero.weaponstat1 < 1 || hero.weaponstat2 < 1) {
                    System.out.println("현재 살 수 없는 무기 번호를 입력했습니다.");

                } else {
                    if (hero.mp >= 800) {
                        hero.weaponstat3 += 1;
                        hero.mp -= 800;

                        System.out.println("구입이 완료되었습니다.");
                        System.out.println("현재 Magic Points : " + hero.mp);
                    } else {
                        System.out.println("Magic Points 부족");
                        System.out.println("현재 Magic Points : " + hero.mp);

                    }
                }
            } else {
                System.out.println("잘못 입력하셨습니다. 번호를 다시 입력하세요.");

            }
        }
        System.out.println("*********************");
    }
}
