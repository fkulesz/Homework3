package task1;

public class MainDoor {
    public static void main(String[] args) {
        Door door1 = new Door("Drzwi Zewnętrzne", "lewe",90,220,false);
        System.out.println("Nazwa drzwi " + door1.name);
        System.out.println("Strona drzwi " + door1.side);
        System.out.println("Szerokość drzwi " + door1.width + "cm");
        System.out.println("Wysokość drzwi " + door1.height + "cm");
        System.out.println("Czy drzwi są przeszklone " + door1.withGlass);

        Door door2 = new Door("Drzwi Wewnętrzne","prawe", 120, 220,true);
        System.out.println("Nazwa drzwi " + door2.name);
        System.out.println("Strona drzwi " + door2.side);
        System.out.println("Szerokość drzwi " + door2.width + "cm");
        System.out.println("Wysokość drzwi " + door2.height + "cm");
        System.out.println("Czy drzwi są przeszklone " + door2.withGlass);

    }
}
