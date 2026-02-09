class CoffeeMachine2{
    private String coffeeName; //The name of the coffee
    private int waterAmount; //Amount of water in the tank, ml
    private int beansAmount; //Amount of the beans , grams

    CoffeeMachine2(String coffeeName , int waterAmount , int beansAmount){
        this.coffeeName = coffeeName;
        this.waterAmount = waterAmount;
        this.beansAmount = beansAmount;
    }

    public void makeCoffee(){
        if (waterAmount >= 200 && beansAmount >= 20){
            waterAmount -= 200;
            beansAmount -= 20;
            System.out.println("Your " + coffeeName + " is ready.");
        }else System.out.println("Error. Not enough ingredients");
    }

    public void refill(int water , int beans){
        this.waterAmount += water;
        this.beansAmount += beans;
        System.out.println("Refill is over. ");
    }

    public void showStatus(){
        System.out.println("Water resudies: " + waterAmount +  ". Beans resudies: " + beansAmount);
    }
}

class SmartCoffeeMachine extends CoffeeMachine2{
    private int cocoaAmount;

    public SmartCoffeeMachine(String name, int water, int beans, int cocoa){
        super(name, water , beans);
        this.cocoaAmount = cocoa;
    }

    public void makeHotChocolate(){
        if (cocoaAmount >= 30){
            cocoaAmount -= 30;
            System.out.println("Your hot chocolate is ready!");
        } else System.out.println("No cocoa left!");
    }
}


public class InHeritanceCoffeeMachine {
    public static void main(String[] args) {

        SmartCoffeeMachine smartCup = new SmartCoffeeMachine("Capuccino" , 400 ,40 ,60);
        smartCup.makeCoffee();
        smartCup.showStatus();
        smartCup.refill(200,20);
        smartCup.makeHotChocolate();
    }
}