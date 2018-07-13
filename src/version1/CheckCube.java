package version1;

public class CheckCube {
	public boolean checkOriginal(Cube cube) {
		if  ((cube.corner0.Z == cube.corner1.Z & cube.corner1.Z == cube.corner2.Z
				& cube.corner2.Z == cube.corner3.Z & cube.corner3.Z == cube.corner1.Z)
			
			&(cube.corner0.X == cube.corner3.X & cube.corner3.X == cube.corner4.X
				& cube.corner4.X == cube.corner7.X & cube.corner7.X == cube.corner0.X)
			
			& (cube.corner0.Y == cube.corner1.Y & cube.corner1.Y == cube.corner4.Y
				& cube.corner4.Y == cube.corner5.Y & cube.corner5.Y == cube.corner0.Y)
			
			& (cube.corner1.X == cube.corner2.X & cube.corner2.X == cube.corner5.X
				& cube.corner5.X == cube.corner6.X & cube.corner6.X == cube.corner1.X)
			
			& (cube.corner2.Y == cube.corner3.Y & cube.corner3.Y == cube.corner6.Y
				& cube.corner6.Y == cube.corner7.Y & cube.corner7.Y == cube.corner2.Y))
			return true;
		return false;
	}
}
