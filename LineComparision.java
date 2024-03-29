package linedistance;

class DistanceOfLine{
	

public int x1, x2, y1, y2;


public  DistanceOfLine(int x1, int x2, int y1, int y2) {
	 this.x1 = x1;
	 this.x2 = x2;
	 this.y1 = y1;
	 this.y2 = y2;
	 
}

public double calculateDistanceOfLine() {
	double distanceLine = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));

	return distanceLine;
}
}

public class LineComparision {

	
	public static void diffOfLine(double length1,double length2) {
		if (length1<length2) {
			System.out.println("line-1 is less than line-2.");
		} else if (length2<length1) {
			System.out.println("line-2 is less than line-1.");
		} else {
			System.out.println("Both line has equal lenth.");
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("Wellcome to the Line comparision Computatation problem");
		
		DistanceOfLine line1 = new DistanceOfLine(5, 8, 6, 9);
	
		double length1 = line1.calculateDistanceOfLine();	
		System.out.println("Length of line-1 = "+length1);
		
		
		DistanceOfLine line2 = new DistanceOfLine(11, 9, 8, 9);
	
		double length2 = line2.calculateDistanceOfLine();	
		System.out.println("Length of line-2 = "+length2);
		
		diffOfLine(length1, length2);	
}
}