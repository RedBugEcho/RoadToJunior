class SmartPhone{
    String name;
    int price;

    SmartPhone(String modelName, int initialPrice){
        name = modelName;
        price = initialPrice;
    }

    public void displaySmartPhones(){
        System.out.println("Model - " + name + " , price - " + price);
    }
}


public class ClassSmartphone {
    public static void main(String[] args) {
        SmartPhone phone1 = new SmartPhone("Iphone" , 1000);
        SmartPhone phone2 = new SmartPhone("Samsung" , 800);

        phone1.displaySmartPhones();
        phone2.displaySmartPhones();

    }
}