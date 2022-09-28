import java.io.FileReader;

class Start {
    public static void main(String[] cookies) {
        try {
            FileReader f = new FileReader("data.txt");
            while(true) {
                    int k = f.read();
                    if (k < 0) {
                        break;
                    }
                System.out.print((char)k);
            }
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }
}

sealed class Vehicle permits Car, Truck { }

final class Car extends Vehicle { }
non-sealed class Truck extends Vehicle { }

final class Truck10Wheel extends Truck {  }