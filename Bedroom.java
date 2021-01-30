public class Bedroom {
    public String name;
    public Walls wall;
    public Ceiling ceiling;
    public Bed bed;
    public Lamp lamp;

    public Bedroom(String name, Walls wall,Ceiling ceiling, Bed bed, Lamp lamp){
        this.name = name;
        this.wall = wall;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }
    public Lamp getLamp(){
        return lamp;
    }
    public void makeBed(){
        System.out.println("the bed is being made");
    }
}
