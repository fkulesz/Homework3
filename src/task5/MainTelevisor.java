package task5;

public class MainTelevisor {
    public static void main(String[] args) {
        Televisor televisor = new Televisor();
        televisor.showStatus();
        televisor.turnOn();
        televisor.showStatus();
        televisor.turnOff();
        televisor.showStatus();
    }
}
