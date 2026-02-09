class SmartLamp{
    String brand;
    int brightness;
    boolean isOn;

    public SmartLamp(String brandName){
        this.brand = brandName;
        this.brightness = 50;
        this.isOn = false;
    }

    public void switchPower(){
        this.isOn = !this.isOn;
        System.out.println("Lapm is " + (isOn ? " On " : "Off"));
    }

    public void setBrightness(int newBrightness){
        if (newBrightness >= 0 && newBrightness <= 100) this.brightness = newBrightness;
        else System.out.println("Error! Brightness must be from 0 to 100.");
    }

    public void showStatus(){
        System.out.println("Lamp: " + brand + " | Brightness: " + brightness + "% | On or Off: " + isOn);
    }

}

public class Lamp {
    public static void main(String[] args) {
        SmartLamp myLamp = new SmartLamp("Xiaomi");

        myLamp.showStatus();
        myLamp.switchPower();
        myLamp.setBrightness(85);
        myLamp.setBrightness(100);
        myLamp.showStatus();
        myLamp.switchPower();

    }
}