class Enemy{
    protected String enemyName;
    protected int health;

    Enemy(String enemyName ,int health){
        this.enemyName = enemyName;
        this.health = health;
    }

    public void showHealth(){
        System.out.println("Your health is: " + health);
    }
}

class Boss extends Enemy{
    protected int shield;

    public Boss(String enemyName ,  int health , int shield){
        super( enemyName ,  health);
        this.shield = shield;
    }

    public void activateShield(){
        System.out.println("Boss " + enemyName + " activated shield on " + shield  + " units.");
    }
}

public class InheritanceBoss {
    public static void main(String[] args) {
        Boss boss1 = new Boss("Ruslan", 100 , 100);
        boss1.showHealth();
        boss1.activateShield();
    }
}