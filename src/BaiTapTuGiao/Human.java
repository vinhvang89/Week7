package BaiTapTuGiao;

public class Human {
    private String name;
    private double strength ;
    private double hp;
    private String job;
    static double age = 80;
    public Human(String name,String job){
        this.name = name;
        this.job = job;
        switch (this.job) {
            case "Archer":
                this.strength = 250;
                this.hp = 1450;
                break;
            case "Assassin":
                this.strength = 350;
                this.hp = 1300;
                break;
            case "Warrior":
                this.strength = 300;
                this.hp = 2000;
                break;
            default:
                this.strength = 100;
                this.hp = 1000;
                break;
        }
    }
    public static void setAge(){
        age =  90;
    }
    public String getJob(){
        return this.job;
    }
    public String toString(){
        return this.name + " ,HP : "+this.hp+" , job : " +this.job +" age " +age;
    }
    protected void attack(Human someone){
        someone.hp -= this.strength;
    }
    protected void eat(){
        this.hp += 100;
    }
    protected double getStrength(){
        return  this.strength;
    }
    protected  double getHp(){
        return this.hp;
    }
    protected void setStrength(double strength){
        this.strength = strength;
    }
    protected void setHp(double hp){
        this.hp = hp;
    }
}

class Hero extends Human{
    public Hero(String name,String job){
        super(name,job);
        super.setStrength(super.getStrength() * 2);
        super.setHp(super.getHp()*3);
    }
    public String toString(){

        return super.toString();
    }

}
interface UpgradeToCyborg{
    public void setSkills();
    public void useSkill(Human someone);
    public void charger();

}
class Cyborg extends Human implements UpgradeToCyborg{
    String skill;
    Double power = 1000d;
    public Cyborg(String name,String job){
        super(name,job);
    }
    @Override
    public void setSkills() {
        switch (super.getJob()) {
            case "Assassin":
                this.skill = "Cyclone Strike";
                break;
            case "Warrior":
                this.skill = "Earthquake";
                break;
            case "Archer":
                this.skill = "Rain of fire";
                break;
            default:
                this.skill = "Heal";
                break;
        }
    }

    @Override
    public void useSkill(Human someone) {
        switch (this.getJob()) {
            case "Assassin":
                someone.setHp(someone.getHp() - 3 * super.getStrength());
                this.power -= 500;
                break;
            case "Archer":
                someone.setHp(someone.getHp() - 2 * super.getStrength());
                this.power -= 330;
                break;
            case "Warrior":
                someone.setHp(someone.getHp() - 1.5 * super.getStrength());
                this.power -= 250;
                break;
            case "Heal":
                someone.setHp(someone.getHp() + 500);
                this.power -= 500;
                break;
        }
    }

    @Override
    public void charger() {
        if (this.power <= 500)
            this.power += 500;
        else
            this.power = 1000d;
    }
    public String toString(){
        return super.toString() + " Skill : " +this.skill+
                " power: " + this.power;
    }
}