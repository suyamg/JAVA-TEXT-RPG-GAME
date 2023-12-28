package Character;

import Map.Mission;

public class Hero extends Character {


    public String job;
    public int power;
    public int defense;
    public int experience;
    public int money;


    public int weaponstat1;
    public int weaponstat2;
    public int weaponstat3;

    public int cnt;

    public String weapon2;
    public String weapon3;
    public String weapon4;


    public Hero() {
        cnt = 5;
        weaponstat3 = 0;
        weaponstat2 = 0;
        weaponstat1 = 0;
        experience = 0;
        money = 0;
        level = 1;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void hero_state() {
        System.out.println("*********************");
        System.out.println("현재 Hero 의 이름 : " + this.name);
        System.out.printf("현재 %s의 직업 : %s \n", this.name, this.job);
        System.out.printf("현재 %s의 레벨 : %d\n", this.name, this.level);
        System.out.printf("현재 %s의 힘 : %d\n", this.name, this.power);
        System.out.printf("현재 %s의 방어력 : %d\n", this.name, this.defense);
        System.out.printf("현재 %s의 HP : %d\n", this.name, this.hp);
        System.out.printf("현재 %s의 MP : %d\n", this.name, this.mp);
        System.out.printf("현재 %s의 경험치 : %d\n", this.name, this.experience);
        System.out.printf("현재 %s의 돈 : %d원\n", this.name, this.money);
        System.out.printf("현재 %s의 무기 스탯 : %d, %d, %d\n", this.name, this.weaponstat1, this.weaponstat2, this.weaponstat3);
        System.out.println("*********************");
    }

    public void setState(int power, int defense, int hp, int mp) {
        this.power = power;
        this.defense = defense;
        this.hp = hp;
        this.mp = mp;
    }

    public void setPower(int power){
        this.power += power;
    }
    public void setDefense(int defense){
        this.defense += defense;
    }
    public void setHp(int hp){
        this.hp += hp;
    }
    public void setMp(int mp){
        this.mp += mp;
    }
    public void setExperience(int experience) {
        this.experience += experience;
    }
    public void setMoney(int money) {
        this.money += money;
    }


    public String getName() {
        return name;
    }
    public int getPower() {
        return power;
    }
    public int getLevel() {
        return level;
    }
    public int getHp() {
        return hp;
    }
    public int getMp(){
        return mp;
    }
    public int getDefense(){
        return defense;
    }
    public int getMoney() {
        return money;
    }
    public String getJob(){
        return job;
    }



    public void Level_Up(){
        Mission mission = new Mission();
        if (this.experience >= this.level ) { //* 80
            int ii = 0;
            ii += 100;
            this.level += 1;
            this.money += ii;
            System.out.printf("%s의 레벨이 %d이(가) 되었습니다.", this.name, this.level);
            System.out.println();
            System.out.printf("레벨업 기념으로 돈이 %d원 증가하여 ", this.money);
            System.out.println(this.money + "원이 되었습니다.");
            this.experience = 0;
            mission.Mission(this);
        }
    }

    public void revive() {

        if (this.cnt != 0) {
            System.out.println("사망하였습니다.");
            System.out.println("부활하였습니다.");
            this.cnt -= 1;
            this.hp = 80;
            System.out.printf("부활 가능 횟수 5번 중에 %d번 남았습니다. \n", this.cnt);
            System.out.println("다시 시작합니다.");
        }else {
            this.cnt--;
        }
    }

    public int attack(int skill) {
        return this.level * 10 + this.power * 60 + skill;
    }

    public void attacked(int sum) {
        if (this.defense < sum) {
            this.hp = this.hp + this.defense - sum;
            System.out.println(this.name + "의 데미지는 " + sum + " 입니다.");
        }
    }

    public void setWeapon(String weapon2, String weapon3, String weapon4 ) {
        this.weapon2 = weapon2;
        this.weapon3 = weapon3;
        this.weapon4 = weapon4;
        }
    public void Weaponstate()   {
        if(weaponstat1>=1){
            System.out.println("2. " + this.weapon2);
        } if (weaponstat2>=1) {
            System.out.println("3. "+ this.weapon3);
        } if (weaponstat3>=1) {
            System.out.println("4. "+ this.weapon4);
        }
    }

}


