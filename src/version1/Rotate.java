package version1;

public class Rotate {
	public void r1(Cube cube) {
		String tempx = new String();
		String tempy = new String();
		String tempz = new String();
		
		tempy = cube.corner0.Y;
		tempz = cube.corner0.Z;
		
		cube.corner0.Y = cube.corner4.Z;
		cube.corner0.Z = cube.corner4.Y;
		
		cube.corner4.Y = cube.corner7.Z;
		cube.corner4.Z = cube.corner7.Y;
		
		cube.corner7.Y = cube.corner3.Z;
		cube.corner7.Z = cube.corner3.Y;
		
		cube.corner3.Y = tempz;
		cube.corner3.Z = tempy;
	}
	
	public void r2(Cube cube) {
		String tempx = new String();
		String tempy = new String();
		String tempz = new String();
		
		tempy = cube.corner0.Y;
		tempz = cube.corner0.Z;
		
		cube.corner0.Y = cube.corner3.Z;
		cube.corner0.Z = cube.corner3.Y;
		
		cube.corner3.Y = cube.corner7.Z;
		cube.corner3.Z = cube.corner7.Y;
		
		cube.corner7.Y = cube.corner4.Z;
		cube.corner7.Z = cube.corner4.Y;
		
		cube.corner4.Y = tempz;
		cube.corner4.Z = tempy;
	}
	
	public void l1(Cube cube) {
		String tempx = new String();
		String tempy = new String();
		String tempz = new String();
		
		tempy = cube.corner1.Y;
		tempz = cube.corner1.Z;
		
		cube.corner1.Y = cube.corner2.Z;
		cube.corner1.Z = cube.corner2.Y;
		
		cube.corner2.Y = cube.corner6.Z;
		cube.corner2.Z = cube.corner6.Y;
		
		cube.corner6.Y = cube.corner5.Z;
		cube.corner6.Z = cube.corner5.Y;
		
		cube.corner5.Y = tempz;
		cube.corner5.Z = tempy;
	}
	
	public void l2(Cube cube) {
		String tempx = new String();
		String tempy = new String();
		String tempz = new String();
		
		tempy = cube.corner1.Y;
		tempz = cube.corner1.Z;
		
		cube.corner1.Y = cube.corner5.Z;
		cube.corner1.Z = cube.corner5.Y;
		
		cube.corner5.Y = cube.corner6.Z;
		cube.corner5.Z = cube.corner6.Y;
		
		cube.corner6.Y = cube.corner2.Z;
		cube.corner6.Z = cube.corner2.Y;
		
		cube.corner2.Y = tempz;
		cube.corner2.Z = tempy;
	}
	
	public void f1(Cube cube) {
		String tempx = new String();
		String tempy = new String();
		String tempz = new String();
		
		tempx = cube.corner0.X;
		tempz = cube.corner0.Z;
		
		cube.corner0.X = cube.corner1.Z;
		cube.corner0.Z = cube.corner1.X;
		
		cube.corner1.X = cube.corner5.Z;
		cube.corner1.Z = cube.corner5.X;
		
		cube.corner5.X = cube.corner4.Z;
		cube.corner5.Z = cube.corner4.X;
		
		cube.corner4.X = tempz;
		cube.corner4.Z = tempx;
	}
	
	public void f2(Cube cube) {
		String tempx = new String();
		String tempy = new String();
		String tempz = new String();
		
		tempx = cube.corner0.X;
		tempz = cube.corner0.Z;
		
		cube.corner0.X = cube.corner4.Z;
		cube.corner0.Z = cube.corner4.X;
		
		cube.corner4.X = cube.corner5.Z;
		cube.corner4.Z = cube.corner5.X;
		
		cube.corner5.X = cube.corner1.Z;
		cube.corner5.Z = cube.corner1.X;
		
		cube.corner1.X = tempz;
		cube.corner1.Z = tempx;
	}
	
	public void b1(Cube cube) {
		String tempx = new String();
		String tempy = new String();
		String tempz = new String();
		
		tempx = cube.corner3.X;
		tempz = cube.corner3.Z;
		
		cube.corner3.X = cube.corner7.Z;
		cube.corner3.Z = cube.corner7.X;
		
		cube.corner7.X = cube.corner6.Z;
		cube.corner7.Z = cube.corner6.X;
		
		cube.corner6.X = cube.corner2.Z;
		cube.corner6.Z = cube.corner2.X;
		
		cube.corner2.X = tempz;
		cube.corner2.Z = tempx;
	}
	
	public void b2(Cube cube) {
		String tempx = new String();
		String tempy = new String();
		String tempz = new String();
		
		tempx = cube.corner3.X;
		tempz = cube.corner3.Z;
		
		cube.corner3.X = cube.corner2.Z;
		cube.corner3.Z = cube.corner2.X;
		
		cube.corner2.X = cube.corner6.Z;
		cube.corner2.Z = cube.corner6.X;
		
		cube.corner6.X = cube.corner7.Z;
		cube.corner6.Z = cube.corner7.X;
		
		cube.corner7.X = tempz;
		cube.corner7.Z = tempx;
	}
	
	public void u1(Cube cube) {
		String tempx = new String();
		String tempy = new String();
		String tempz = new String();
		
		tempx = cube.corner0.X;
		tempy = cube.corner0.Y;
		
		cube.corner0.X = cube.corner3.Y;
		cube.corner0.Y = cube.corner3.X;
		
		cube.corner3.X = cube.corner2.Y;
		cube.corner3.Y = cube.corner2.X;
		
		cube.corner2.X = cube.corner1.Y;
		cube.corner2.Y = cube.corner1.X;
		
		cube.corner1.X = tempy;
		cube.corner1.Y = tempx;
	}
	
	public void u2(Cube cube) {
		String tempx = new String();
		String tempy = new String();
		String tempz = new String();
		
		tempx = cube.corner0.X;
		tempy = cube.corner0.Y;
		
		cube.corner0.X = cube.corner1.Y;
		cube.corner0.Y = cube.corner1.X;
		
		cube.corner1.X = cube.corner2.Y;
		cube.corner1.Y = cube.corner2.X;
		
		cube.corner2.X = cube.corner3.Y;
		cube.corner2.Y = cube.corner3.X;
		
		cube.corner3.X = tempy;
		cube.corner3.Y = tempx;
	}
	
	public void d1(Cube cube) {
		String tempx = new String();
		String tempy = new String();
		String tempz = new String();
		
		tempx = cube.corner4.X;
		tempy = cube.corner4.Y;
		
		cube.corner4.X = cube.corner5.Y;
		cube.corner4.Y = cube.corner5.X;
		
		cube.corner5.X = cube.corner6.Y;
		cube.corner5.Y = cube.corner6.X;
		
		cube.corner6.X = cube.corner7.Y;
		cube.corner6.Y = cube.corner7.X;
		
		cube.corner7.X = tempy;
		cube.corner7.Y = tempx;
	}
	
	public void d2(Cube cube) {
		String tempx = new String();
		String tempy = new String();
		String tempz = new String();
		
		tempx = cube.corner4.X;
		tempy = cube.corner4.Y;
		
		cube.corner4.X = cube.corner7.Y;
		cube.corner4.Y = cube.corner7.X;
		
		cube.corner7.X = cube.corner6.Y;
		cube.corner7.Y = cube.corner6.X;
		
		cube.corner6.X = cube.corner5.Y;
		cube.corner6.Y = cube.corner5.X;
		
		cube.corner5.X = tempy;
		cube.corner5.Y = tempx;
	}
	
}
