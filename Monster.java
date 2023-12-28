package Character;

public class Monster extends Character {

    public int defense;
    public int power;
    public int experience;
    public int money;


    public Monster(String name, int level, int hp, int mp, int defense, int power, int experience, int money){
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.mp = mp;
        this.defense = defense;
        this.power = power;
        this.experience = experience;
        this.money = money;
    }

    public String getName() {
        return name;
    }
    public int getLevel()
    { return level;
    }
    public int getHp() {
        return hp;
    }
    public int getMp() {
        return mp;
    }
    public int getExperience() {
        return experience;
    }
    public int getMoney() {
        return money;
    }

    public void die() {
        System.out.println(this.name + "가 사망했습니다.");
    }

    public int attack() {
        return this.level * 10 + this.power * 60;
    }

    public void attacked(int sum) {
        if (this.defense < sum) {
            this.hp = this.hp + this.defense - sum ;
            System.out.println(this.name + "의 데미지는 " + sum + " 입니다.");
        }
    }




}








