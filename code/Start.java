class Start {
    public static void main(String[] cookies) {
        System.out.println("Hello");
    }
}

sealed class Vehicle permits Car, Truck { }

final class Car extends Vehicle { }
non-sealed class Truck extends Vehicle { }

final class Truck10Wheel extends Truck {  }