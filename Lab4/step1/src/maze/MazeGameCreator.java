/*
 * SimpleMazeGame.java
 * Copyright (c) 2008, Drexel University.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *     * Neither the name of the Drexel University nor the
 *       names of its contributors may be used to endorse or promote products
 *       derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY DREXEL UNIVERSITY ``AS IS'' AND ANY
 * EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL DREXEL UNIVERSITY BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package maze;

import maze.ui.MazeViewer;

import java.io.File;
import java.util.*;

/**
 * 
 * @author Sunny
 * @version 1.0
 * @since 1.0
 */
public class MazeGameCreator
{

	/**
	 * Creates a small maze.
	 */
	public  Wall makeWall() {
		return new Wall();
	}

	public  Room makeRoom(int roomNumber){
		return new Room(roomNumber);
	}

	public  Door makeDoor(Room r1, Room r2) {
		return new Door(r1, r2);
	}

	public Maze createMaze()
	{
		
		Maze maze = new Maze();

		Room r0 = makeRoom(0);

		r0.setSide(Direction.North, makeWall());
		r0.setSide(Direction.South, makeWall());
		r0.setSide(Direction.West, makeWall());
		maze.addRoom(r0);

		Room r1 = makeRoom(1);

		r1.setSide(Direction.North, makeWall());
		r1.setSide(Direction.South, makeWall());
		r1.setSide(Direction.East, makeWall());
		maze.addRoom(r1);

		Door door = makeDoor(r0, r1);

		r0.setSide(Direction.East, door);
		r1.setSide(Direction.West, door);

		maze.setCurrentRoom(r0);

		door.setOpen(true);
		return maze;
		

	}

	public Maze loadMaze(final String path) throws Exception
	{
		Maze maze = new Maze();
		File file = new File(path);
		Scanner reader = new Scanner(file);
		HashMap<String, ArrayList<String>> roomMap = new HashMap<>();
		HashMap<String, Door> doorMap = new HashMap<>();
		while(reader.hasNextLine()){
			String[] line = reader.nextLine().split(" ");
			if (line[0].equals("room")) {
				maze.addRoom(makeRoom(Integer.parseInt(line[1])));
                ArrayList<String> sides = new ArrayList<String>(Arrays.asList(line).subList(2, 6));
				roomMap.put(line[1], sides);
			}
			else {
				doorMap.put(line[1], makeDoor(maze.getRoom(Integer.parseInt(line[2])), maze.getRoom(Integer.parseInt(line[3]))));
                doorMap.get(line[1]).setOpen(line[4].equals("open"));
			}

		}
		for(HashMap.Entry<String, ArrayList<String>> entry : roomMap.entrySet() ) {
			String key = entry.getKey();
			ArrayList<String> value = entry.getValue();
			int i = 0;
			for (Direction direction : Direction.values()){
				if(value.get(i).equals("wall")) {
					maze.getRoom(Integer.parseInt(key)).setSide(direction, makeWall());
				}
				else if (value.get(i).startsWith("d")) {
					maze.getRoom(Integer.parseInt(key)).setSide(direction, doorMap.get(value.get(i)));
				}
				else {
					maze.getRoom(Integer.parseInt(key)).setSide(direction, maze.getRoom(Integer.parseInt(value.get(i))));
				}
				i++;
			}
		}
		maze.setCurrentRoom(0);
		reader.close();
		return maze;
	}

	public static void main(String[] args) throws Exception
	{

		Scanner input = new Scanner(System.in);  // Create a Scanner object
		System.out.println("Enter what type of maze you would like to display ");
		System.out.println("basic, red, blue: ");

		String selection = input.nextLine();  // Read user input

		MazeGameCreator mazeGame;
		switch (selection){

			case "red":
				mazeGame = new RedMazeGameCreator();
				break;
			case "basic":
				mazeGame = new MazeGameCreator();
				break;
			case "blue":
				mazeGame = new BlueMazeGameCreator();
				break;
			default:
				mazeGame = new MazeGameCreator();

		}



		Maze maze = mazeGame.loadMaze("large.maze");
	    MazeViewer viewer = new MazeViewer(maze);
	    viewer.run();
	}
}
