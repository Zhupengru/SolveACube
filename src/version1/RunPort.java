package version1;

import java.util.Stack;

public class RunPort {
	public static void main(String[] args) {
		Cube         myCube = new Cube();
		EditCube   editCube = new EditCube();
		Rotate       rotate = new Rotate();
		TrySteps    tryStep = new TrySteps();
		Stack<String>    op = new Stack<String>();
		
		myCube = editCube.PaintCube();
		
		rotate.r1(myCube);
		
		rotate.b1(myCube);
		
		rotate.d1(myCube);
		System.out.println(myCube.corner2.Z+" "+ myCube.corner3.Z);
		System.out.println(myCube.corner1.Z+" "+ myCube.corner0.Z);
		System.out.println(myCube.corner1.Y+" "+ myCube.corner0.Y);
		System.out.println(myCube.corner5.Y+" "+ myCube.corner4.Y);
		System.out.println(myCube.corner0.X+" "+ myCube.corner3.X);
		System.out.println(myCube.corner4.X+" "+ myCube.corner7.X);
		
		System.out.println(myCube.corner7.Z+" "+ myCube.corner6.Z);
		System.out.println(myCube.corner4.Z+" "+ myCube.corner5.Z);
		System.out.println(myCube.corner4.Y+" "+ myCube.corner3.Y);
		System.out.println(myCube.corner7.Y+" "+ myCube.corner6.Y);
		System.out.println(myCube.corner5.X+" "+ myCube.corner4.X);
		System.out.println(myCube.corner6.X+" "+ myCube.corner7.X);
		rotate.l1(myCube);
		
		rotate.f1(myCube);
		rotate.r1(myCube);
		rotate.b1(myCube);
		rotate.d1(myCube);
		rotate.l1(myCube);
		rotate.f1(myCube);
		
		
		
		
		
		
		
		//tryStep.recursionTry(myCube, 0, op);
		
		
	}
	
}
