package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		{
			StdDraw.setXscale(0,30);
			StdDraw.setYscale(0,16);
			   StdDraw.clear();
			   StdDraw.setPenColor(25, 25, 100);
			   StdDraw.filledRectangle(3, 3, 3, 3);
			   StdDraw.filledRectangle(3, 13, 3, 3);
			   StdDraw.filledRectangle(16, 3, 6, 3);
			   StdDraw.filledRectangle(16, 13, 6, 3);
			   StdDraw.setPenColor(14, 76, 172);
			   StdDraw.filledCircle(5, 5, 5);
			}
	}
}