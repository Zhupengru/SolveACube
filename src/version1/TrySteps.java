package version1;

import java.util.Stack;

public class TrySteps {
	Rotate rotate = new Rotate();
	CheckCube checkCube = new CheckCube();
	private static boolean found = false;
	
	public void recursionTry(Cube cube, int depth, Stack<String> operation) {
		if (checkCube.checkOriginal(cube)) {
			setFound(true);
			System.out.print(operation.toString());
		}
		
		if (depth > 9) {
			return;
		}
		
		if (!found) {
			rotate.r1(cube);
			operation.add("r1");
			recursionTry(cube, depth+1, operation);
			rotate.r2(cube);
			operation.pop();
		}
		if (!found) {
			rotate.r2(cube);
			operation.add("r2");
			recursionTry(cube, depth+1, operation);
			rotate.r1(cube);
			operation.pop();
		}
		if (!found) {
			rotate.l1(cube);
			operation.add("l1");
			recursionTry(cube, depth+1, operation);
			rotate.l2(cube);
			operation.pop();
		}
		if (!found) {
			rotate.l2(cube);
			operation.add("l2");
			recursionTry(cube, depth+1, operation);
			rotate.l1(cube);
			operation.pop();
		}
		if (!found) {
			rotate.f1(cube);
			operation.add("f1");
			recursionTry(cube, depth+1, operation);
			rotate.f2(cube);
			operation.pop();
		}
		if (!found) {
			rotate.f2(cube);
			operation.add("f2");
			recursionTry(cube, depth+1, operation);
			rotate.f1(cube);
			operation.pop();
		}
		if (!found) {
			rotate.b1(cube);
			operation.add("b1");
			recursionTry(cube, depth+1, operation);
			rotate.b2(cube);
			operation.pop();
		}
		if (!found) {
			rotate.b2(cube);
			operation.add("b2");
			recursionTry(cube, depth+1, operation);
			rotate.b1(cube);
			operation.pop();
		}
		if (!found) {
			rotate.u1(cube);
			operation.add("u1");
			recursionTry(cube, depth+1, operation);
			rotate.u2(cube);
			operation.pop();
		}
		if (!found) {
			rotate.u2(cube);
			operation.add("u2");
			recursionTry(cube, depth+1, operation);
			rotate.u1(cube);
			operation.pop();
		}
		if (!found) {
			rotate.d1(cube);
			operation.add("d1");
			recursionTry(cube, depth+1, operation);
			rotate.d2(cube);
			operation.pop();
		}
		if (!found) {
			rotate.d2(cube);
			operation.add("d2");
			recursionTry(cube, depth+1, operation);
			rotate.d1(cube);
			operation.pop();
		}
	}

	public static boolean isFound() {
		return found;
	}

	public static void setFound(boolean found) {
		TrySteps.found = found;
	}
}
