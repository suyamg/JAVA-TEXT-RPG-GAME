package Character;

public class Warrior extends Hero {
        public Warrior() {
            super.setState(20, 20, 80, 1600);
            this.job = "전사";
            super.setWeapon("망치","도끼","대검");
        }
}
