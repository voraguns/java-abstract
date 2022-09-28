import java.util.Date;

class Start {
    public static void main(String[] cookies) {
        Object[] list = { 8, 5, 2.5, 4, 4.0, 7.2 };
        // Write code to count number of instance of Integer
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] instanceof Integer) {
                count++;
            }
        }
        System.out.println("Count : " + count);
        
        Object[] a = { "Latte", 1.5, 8, new Date(), "Mocha" };
        
        System.out.println(a[0] instanceof String);
        System.out.println(a[1] instanceof Double);
        System.out.println(a[2] instanceof Integer);
        
        System.out.println("Hello");
    }
}

sealed class Vehicle permits Car, Truck { }

final class Car extends Vehicle { }
non-sealed class Truck extends Vehicle { }

final class Truck10Wheel extends Truck {  }