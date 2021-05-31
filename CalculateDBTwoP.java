package pSolve;

public class CalculateDBTwoP {

	public static void main(String[] args) {
		{
			int x1, x2, y1, y2;
			double calculate;
			x1 = 1;
			y1 = 1;
			x2 = 4;
			y2 = 4;
			calculate = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
			System.out.println("distance between two points " + "(" + x1 + "," + y1 + ")," + "(" + x2 + "," + y2 + ") \n" + calculate);
		}

	}

}
