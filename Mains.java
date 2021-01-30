public class Mains {
    public static void main(String[] args) {
        Walls wall = new Walls("West","East","South","North");

        Ceiling ceiling = new Ceiling(12,55);
        Bed bed = new Bed("Modern",4,3,2,1);
        Lamp lamp = new Lamp("Classic",false,75);
        Bedroom bedRoom = new Bedroom("YOUR NAME HERE", wall, ceiling, bed, lamp);
        bedRoom.makeBed();
        lamp.turnOn();
        bed.make();
    }
}
