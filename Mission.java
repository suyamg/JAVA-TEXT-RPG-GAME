package Map;

import Character.Hero;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
public class Mission extends Map {
    // 미션 관련 코드
    Scanner in = new Scanner(System.in);
    Random random = new Random();
    Hero hero = new Hero();
    int once = 1;

    public void Mission(Hero hero) {
        while (once == 1) {
            System.out.println("*********************");
            System.out.println("****LEVEL UP 기념 MISSION*****");
            System.out.println("MISSION 을 성공할 시 보상을 진행합니다.");
            System.out.println("1. 포트리스 난입: 암호 코드 전투");
            System.out.println("2. 지식의 마법");
            System.out.println("3. 보물 찾기");
            System.out.println("원하는 미션의 해당 번호를 입력하세요: ");
            int a = in.nextInt();
            once -= 1;


            if (a == 1) {
                System.out.println("*********************");
                System.out.println("<포트리스 난입: 암호 코드 전투> 맵에 입장하였습니다.");

                System.out.println("'포트리스 내부에서 경비병이 나타났습니다!'");
                System.out.println("'포트리스 내부의 암호 코드를 찾아주세요.'");

                System.out.println("암호코드는 1부터 10까지 중 하나이며 2번의 기회가 있습니다.");
                int enterFortress = 2;
                int damage = random.nextInt(10) + 1;

                while (enterFortress > 0) {
                    System.out.print("암호코드를 입력하세요 : ");
                    int userGuess = in.nextInt();
                    enterFortress -= 1;
                    in.nextLine();
                    if (damage == userGuess) {
                        System.out.println("암호코드를 맞췄습니다!");
                        System.out.println("보상으로 50원을 증정합니다.");
                        hero.money+=50;
                        System.out.println("*********************");
                        break;
                    } else {
                        System.out.println("암호코드를 틀렸습니다.");
                        if (enterFortress == 1) {
                            System.out.println("한 번 더 시도하세요.");
                        } else {
                            System.out.println("미션에 실패했습니다. 게임으로 돌아갑니다.");
                            System.out.println("*********************");
                            break;
                        }
                    }
                }

            } else if (a == 2) {
                int qna = random.nextInt(2) + 1;
                System.out.println("*********************");
                System.out.println("<지식의 마법> 맵에 입장하였습니다.");

                System.out.println("마법사: 이 곳은 지식을 중시하는 세계입니다.");
                System.out.println("마법사: 수호자 '드래곤'이 랜덤으로 내는 퀴즈를 맞추어야 합니다.");
                System.out.println("마법사: 단, 드래곤은 성질이 급해 시간을 초과하면 즉시 쫒겨납니다.");
                System.out.println("마법사: 문제마다 제한 시간은 다릅니다.");
                System.out.println("마법사: 행운을 빕니다.");

                System.out.println("드래곤: 우하하 안녕하신가");
                System.out.println("드래곤: 바로 문제를 내도록 하지.");

               if (qna == 1) {
                    System.out.println("드래곤: 자바에서 프로세스 내 독립적인 실행 흐름을 가지는 것으로 병렬 처리와 비동기 작업이 가능한 것을 뭐라고 하지?");
                    System.out.println("드래곤: 8초안에 영어로 대답해!");
                    long startTime = System.currentTimeMillis();
                    String ans = in.next();
                    long endTime = System.currentTimeMillis();
                    long elapsedTime = (endTime - startTime) / 1000;

                    System.out.println("소요된 시간: " + elapsedTime + " 초");

                    if (Objects.equals(ans, "thread") && elapsedTime < 8) {
                        System.out.println("드래곤: 정답이다.");
                        System.out.println("드래곤: 보상으로 30원을 주지");
                        hero.money+=30;

                    } else {
                        System.out.println("드래곤: 틀렸다.");
                        System.out.println("드래곤: 당장 나가!!");
                        System.out.println("미션에 실패했습니다. 게임으로 돌아갑니다.");
                    }

                } else if (qna == 2) {
                    System.out.println("드래곤: 자바에서 타입의 일반화를 통해 재사용성과 안전성을 높이는 기능으로 컴파일 시에 타입체크를 수행해 타입 안정성을 보장하는 것을 뭐라고 하지?");
                    System.out.println("드래곤: 영어로 대답해!");

                    long startTime = System.currentTimeMillis();
                    String ans = in.next();
                    long endTime = System.currentTimeMillis();
                    long elapsedTime = (endTime - startTime) / 1000;

                    System.out.println("소요된 시간: " + elapsedTime + " 초");

                    if (Objects.equals(ans, "generic") && elapsedTime < 8) {
                        System.out.println("드래곤: 정답이다.");
                        System.out.println("드래곤: 보상으로 30원을 주지");
                        hero.money+=30;

                    } else {
                        System.out.println("드래곤: 틀렸다.");
                        System.out.println("드래곤: 당장 나가!!");
                        System.out.println("미션에 실패했습니다. 게임으로 돌아갑니다.");
                    }
                }
            }
            //  System.out.println("*********************");


            else if (a == 3) {

                System.out.println("*********************");
                System.out.println("<보물 찾기> 맵에 입장하였습니다.");

// 무작위로 보물 위치 설정 (-3 ~ 3 사이)
                int treasureLocation = random.nextInt(7) - 3;

// 플레이어 위치 초기화
                int playerLocation = 0;

// 이동 횟수 초기화
                int moveCount = 0;

                while (moveCount < 3) { // 총 3번까지만 이동 가능
                    // 플레이어에게 현재 위치 표시
                    System.out.println("현재 위치: " + playerLocation);

                    // 플레이어에게 이동할 방향 선택 요청
                    System.out.print("이동할 방향을 선택하세요. (1: 앞으로, -1: 뒤로) ");
                    int move = in.nextInt();

                    // 한 번에 2칸 이상 움직이려는 경우 게임 실패
                    if (Math.abs(move) > 1) {
                        System.out.println("너무 많이 움직였습니다. 게임에서 실패하였습니다.");
                        System.out.println("미션에 실패했습니다. 게임으로 돌아갑니다.");
                        break;
                    }

                    // 플레이어 위치 업데이트
                    playerLocation += move;

                    // 이동 횟수 증가
                    moveCount++;

                    // 보물 찾기 성공 여부 체크
                    if (playerLocation == treasureLocation) {
                        System.out.println("축하합니다! 보물을 찾았습니다!");
                        System.out.println("보상으로 50원을 증정합니다.");
                        hero.Level_Up();
                        hero.money+=50;

                        System.out.println("*********************");
                        break;
                    } else if (moveCount >= 3) { // 이동 횟수가 3번이 되면 게임 종료
                        System.out.println("아쉽지만, 보물은 찾지 못했습니다.");
                        System.out.println("미션에 실패했습니다. 게임으로 돌아갑니다.");
                    }
                }
            }
        }
    }
}