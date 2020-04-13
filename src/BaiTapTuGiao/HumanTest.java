package BaiTapTuGiao;

public class HumanTest {
    public static void main(String[] args) {

//        Team1:
        Human Lex = new Human("Lex", "Assassin");
        Hero HongYi = new Hero("HongYi", "Archer");
        Cyborg Franky = new Cyborg("Franky", "Warrior");
//        Team2:
        Cyborg Seraph = new Cyborg("Seraph", "Angel");
        Hero Hercule = new Hero("Hercule", "Warrior");
        Human Skye = new Human("Skye", "Assassin");
        System.out.println(Lex.toString());
        Franky.eat();
        Franky.charger();


    }
}