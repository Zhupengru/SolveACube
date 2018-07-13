package version1;

public class EditCube {
	public Cube PaintCube() {
		Cube cube = new Cube();
		
		cube.corner0.X = "O";
		cube.corner0.Y = "B";
		cube.corner0.Z = "W";
		
		cube.corner1.X = "R";
		cube.corner1.Y = "B";
		cube.corner1.Z = "W";
		
		cube.corner2.X = "R";
		cube.corner2.Y = "G";
		cube.corner2.Z = "W";
		
		cube.corner3.X = "O";
		cube.corner3.Y = "G";
		cube.corner3.Z = "W";
		
		cube.corner4.X = "O";
		cube.corner4.Y = "B";
		cube.corner4.Z = "Y";
		
		cube.corner5.X = "R";
		cube.corner5.Y = "B";
		cube.corner5.Z = "Y";
		
		cube.corner6.X = "R";
		cube.corner6.Y = "G";
		cube.corner6.Z = "Y";
		
		cube.corner7.X = "O";
		cube.corner7.Y = "G";
		cube.corner7.Z = "Y";
		
		return cube;
		
	}
}
