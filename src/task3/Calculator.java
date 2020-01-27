package task3;

import static java.lang.Math.pow;

public class Calculator {
    boolean isEven(int var1){
        boolean result;
        if (var1 % 2 == 0){
           return result = true;
        } else {
           return result = false;
        }
    }

    boolean isOdd(int var1){
        boolean result;
        if (var1 % 2 == 1){
            return result = true;
        } else {
            return result = false;
        }
    }
    double circleField(double r){
        double field = 3.14*pow(r, 2);
        return field;
    }

    int power(int var1){
        return var1*var1;
    }

}
