package task1;

public class MainDoor {
    public static void main(String[] args) {
        Door door1 = new Door();
        door1.name = "Drzwi Zewnętrzne";
        door1.side = "lewe";
        door1.width = 90;
        door1.height = 220;
        door1.withGlass = false;
        System.out.println("Nazwa drzwi" + door1.name);
        System.out.println("Strona drzwi" + door1.side);
        System.out.println("Szerokość drzwi" + door1.width + "cm");
        System.out.println("Wysokość drzwi" + door1.height + "cm");
        System.out.println("Czy drzwi są przeszklone" + door1.name);

        Door door2 = new Door();
        door2.name = "Drzwi Wewnętrzne";
        door2.side = "prawe";
        door2.width = 120;
        door2.height = 220;
        door2.withGlass = true;
        System.out.println("Nazwa drzwi" + door2.name);
        System.out.println("Strona drzwi" + door2.side);
        System.out.println("Szerokość drzwi" + door2.width + "cm");
        System.out.println("Wysokość drzwi" + door2.height + "cm");
        System.out.println("Czy drzwi są przeszklone" + door2.name);

    }
}
