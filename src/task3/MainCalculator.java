package task3;

public class MainCalculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        boolean numberIsEven;
        boolean numberIsOdd;
        double circleField;
        int powerVar;
        numberIsEven = calculator.isEven(41);
        System.out.println("Czy liczba jest parzysta: " + numberIsEven);
        numberIsOdd = calculator.isOdd(41);
        System.out.println("Czy liczba jest nieparzysta: " + numberIsOdd);
        circleField = calculator.circleField(2.5);
        System.out.println("Pole koła: " + circleField);
        powerVar = calculator.power(5);
        System.out.println("Liczna podniesiona do kwadratu to : " + powerVar);

    }
}
