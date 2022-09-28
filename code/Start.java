import java.io.FileReader;
import java.util.Iterator;

class Start {
    public static void main(String[] cookies) {
        LineIterator li = new LineIterator("data.txt");
        while(li.hasNext()) {
            String s = li.next();
            System.out.println(s);
        }
    }
}

class LineIterator implements Iterator {
    LineIterator(String path) {
        try {
            reader = new FileReader(path);
        } catch (Exception e) { }
    }
    FileReader reader; // null
    String buffer;
    public boolean hasNext() {
        try {
            buffer = "";
            while (true) {
                int k = reader.read();
                if (k < 0) break;
                buffer += (char)k;
            }
            
            // check buffer size
        } catch (Exception e) { }
        return buffer.length() > 0;
    }
    public String next() {
        return buffer;
    }
}

sealed class Vehicle permits Car, Truck { }

final class Car extends Vehicle { }
non-sealed class Truck extends Vehicle { }

final class Truck10Wheel extends Truck {  }