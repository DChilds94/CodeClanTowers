public abstract class Room {

    private int capacity;
//    private Arralist<guest> guests;

    public Room(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}
