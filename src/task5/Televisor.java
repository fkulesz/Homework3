package task5;

public class Televisor {
    boolean isTelevisorOn = false;

    void turnOn(){
        isTelevisorOn = true;
    }
    void turnOff(){
        isTelevisorOn = false;
    }
    void showStatus(){
        System.out.println("Moj telewizor jest właczony: " + isTelevisorOn);
    }
}
