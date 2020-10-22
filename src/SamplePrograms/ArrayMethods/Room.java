
package SamplePrograms.ArrayMethods;

public class Room {
    private String name;
    private int width;
    private int length;
    
    public Room(String n, int w, int l) {
        name = n;
        width = w;
        length = l;
    }
    
    public int getArea() {
        return width * length;
    }
    
    public String toString() {
        String str = "Room name:\t" + name;
        str +="\nArea: " + getArea();
        str += "\n=================";
        return str;
    }
}
