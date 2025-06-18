package maze;

public class RedMazeGameCreator extends MazeFactory {
    @Override
    public Wall makeWall(){
        return new RedWall();
    }
    @Override
    public Room makeRoom(int roomNumber){
        return new PinkRoom(roomNumber);
    }
}
