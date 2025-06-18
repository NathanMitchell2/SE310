package maze;

public class BlueMazeGameCreator extends MazeFactory {
    @Override
    public Wall makeWall(){
        return new BlueWall();
    }
    @Override
    public Room makeRoom(int roomNumber){
        return new GreenRoom(roomNumber);
    }
    @Override
    public Door makeDoor(Room r1, Room r2){
        return new BrownDoor(r1, r2);
    }
}
