package Character;

public class Magician extends Hero {
    public Magician() {
        super.setState(15, 20, 80, 300000);
        this.job = "마법사";
        super.setWeapon("불 속성 마법 지팡이","물 속성 마법 지팡이","전기 속성 마법 지팡이");

    }


}
