package Main;

import Character.*;
import Map.PotionStore;
import Map.WeaponStore;

import java.util.Scanner;


// 게임의 메인 동작을 관리하는 클래스
public class Main {
    public static void main(String[] args) {
        // 게임 실행 코드
        Scanner sc = new Scanner(System.in);

        PotionStore potionstore = new PotionStore();
        WeaponStore weaponStore = new WeaponStore();


        Hero hero = null;
        Monster monster = null;

        System.out.println("*******RPG GAME*******");

        System.out.print("영웅의 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.println("영웅의 이름이 입력되었습니다.");

        System.out.println("1. 전사");
        System.out.println("2. 마법사");
        System.out.println("3. 궁수");
        System.out.print("직업의 번호를 입력하세요 : ");
        int hero_job = sc.nextInt();
        sc.nextLine();
        if (hero_job == 1){
            hero = new Warrior();
            hero.setName(name);
        }else if (hero_job == 2) {
            hero = new Magician();
            hero.setName(name);
        }else if (hero_job == 3){
            hero = new Archer();
            hero.setName(name);
        }else {
            System.out.println("잘못 입력하셨습니다. 번호를 다시 입력하세요.");
        }


        System.out.println("게임에 입장하였습니다.");


        //game
        while (true) {
            int v =1;
            int w =1;
            int k =1;

            if (hero.cnt == -1) {
                System.out.println("죽었습니다.");
                System.out.println("남은 부활 가능 횟수가 0이 되어 게임을 종료합니다.");
                break;
            } else if (hero.level>=25) {
                System.out.println("레벨이 30가 되었습니다. ");
                System.out.println("----------------- game clear -----------------");
                System.out.println("게임을 종료합니다.");
            }
            hero.hero_state();
            System.out.println("1. 사냥터");
            System.out.println("2. 포션 상점");
            if (hero.level>=2) {
                System.out.println("3. 무기 상점");
            }
            System.out.print("입장할 장소를 입력하세요. : ");
            int place_ = sc.nextInt();
            sc.nextLine();
            if (place_==1) {
                System.out.println("사냥터에 입장하였습니다.");
                System.out.println("1. 너구리");
                if (hero.level >= 2) {
                    System.out.println("2. 살쾡이");
                } if (hero.level >= 4) {
                    System.out.println("3. 들개");
                } if (hero.level >= 5) {
                    System.out.println("4. 멧돼지");
                }
                System.out.print("전투할 상대를 입력하세요. : ");
                int MMonster = sc.nextInt();
                sc.nextLine();

                if (MMonster ==1 ){
                    monster = new Racoon();

                } else if (MMonster==2 ) {
                    monster = new wildcat();
                    v+=100;

                } else if (MMonster==3 ) {
                    monster = new dingo();
                    w+=200;

                } else if (MMonster==4) {
                    monster = new wildboar();
                    k+=300;

                }else{
                    System.out.println("잘못 입력하셨습니다. 번호를 다시 입력하세요.");
                }

                while (true) {
                    int u =0;
                    System.out.println(hero.getName()+ "의 공격입니다.");
                    System.out.println("1. 기본공격");
                    hero.Weaponstate();
                    System.out.print("공격을 선택하세요 : ");
                    int skill = sc.nextInt();
                    sc.nextLine();

                   if (skill == 2){
                        u+=20*v;
                        u*=hero.weaponstat1;
                    } else if (skill == 3) {
                        u+=30*w;
                        u*=hero.weaponstat2;
                    } else if (skill == 4) {
                        u+=40*k;
                        u*=hero.weaponstat3;
                    }
                    monster.attacked(hero.attack(u));

                    if (monster.hp <= 0) {
                        hero.experience += monster.experience;
                        hero.money += monster.money;
                        monster.die();
                        hero.Level_Up();
                        break;
                    }
                    System.out.println(monster.name + "의 공격입니다.");
                    int my_Damage = monster.attack();
                    hero.attacked(my_Damage);
                    if (hero.hp <= 0) {
                        hero.revive();
                        break;
                    }
                }


            } else if (place_==2) {
                potionstore.potion(hero);
            } else if (place_==3) {
                weaponStore.Weapon(hero);
            } else {
                System.out.println("잘못 입력하셨습니다. 번호를 다시 입력하세요.");
            }
        }

    }

}



