package maze;

import maze.ui.MazeViewer;

import java.util.Scanner;

public class MazeGameDriver {
    public static Maze loadMaze(String path, MazeFactory factory) throws Exception {
        return factory.loadMaze(path);
    }
    public static void main(String[] args) throws Exception
    {
        Scanner input = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter what type of maze you would like to display ");
        System.out.println("red or blue: ");

        String selection = input.nextLine();  // Read user input

        MazeFactory mazeGame;
        Maze maze;
        if (selection.equals("red")){
            maze = loadMaze("large.maze", new RedMazeGameCreator());
        }
        else{
            maze  = loadMaze("large.maze", new BlueMazeGameCreator());
        }



        MazeViewer viewer = new MazeViewer(maze);
        viewer.run();
    }
}
