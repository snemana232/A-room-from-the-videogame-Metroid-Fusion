import java.awt.Color;
import java.awt.Graphics;
public class Type {

	public static void main(String[] args) {
		// method for the student designed drawing
		// NOT restricted to chapters 1 - 3 of Building Java Programs
		// DO NOT ADD ANY PARAMETERS TO THIS METHOD!!! {
		// DO NOT ADD ANY PARAMETERS TO THIS METHOD!!!

		// CS312 Students, you may increase the size of the drawing panel if
		// doing a non standard drawing.
		final int WIDTH = 800;
		final int HEIGHT = 400;
		DrawingPanel dp = new DrawingPanel(WIDTH, HEIGHT);
		// CS312 Students, add your code, including method calls here
		Graphics g = dp.getGraphics();
		dp.setBackground(Color.BLACK);
		walls(g, 0, 20);
		walls(g, 780, 20);
		floorAndCeilings(g, 380, 20);
		floorAndCeilings(g, 0, 20);
		floorAndCeilings(g, 300, 20);
		drawEntranceBlue(g);
		drawEntryRed(g);
		pillars(g, 100);
		podium(g);
		helmet(g);

	}

	//This method fills the vertical walls of the image
	public static void walls(Graphics g, int xPosition, int sideLength) {
		//This for loop iterates the sequence of gray colored squares and black lines that makes up the walls
		for (int height = 0; height < 20; height++) {
			g.setColor(Color.DARK_GRAY);
			//here, the x position that the squares and lines are drawn from stays constant because the walls are vertical, while the y position changes by 20 pixels every time
			g.fillRect(xPosition, height*20, sideLength, sideLength);
			g.setColor(Color.BLACK);
			g.drawLine(xPosition, height*20, xPosition + sideLength, height*20 );
		}			
	} 

	//This method fills the horizontal floor and ceilings of the figure
	public static void floorAndCeilings(Graphics g, int yPosition, int sideLength) {
		//This for loop iterates through the sequence of gray colored squares and black lines that make up the floors and ceilings
		for (int width = 0; width < 40; width++) {
			//here, the y position that the squares and lines are drawn from stays constant because the walls are horizontal, while the x position changes by 20 pixels every time
			g.setColor(Color.DARK_GRAY);
			g.fillRect(width*20, yPosition, sideLength, sideLength);
			g.setColor(Color.BLACK);
			g.drawLine(width*20, yPosition, width*20, yPosition + sideLength);
		}
	}

	//This method prints out the pillars that support the second floor in the image
	public static void pillars(Graphics g, int xPosition) {
		g.setColor(Color.GRAY);
		//This for loop is used to iterate through the ovals that make up the pillars. The outer loop causes 4 pillars to be drawn 200 pixels apart horizontally
		for (int numOfPillars = 1; numOfPillars <= 4; numOfPillars++ ) {
			//The inner for loop draws small ovals that make up each pillar
			for (int height = 0; height < 15 ; height++) {
				g.fillOval(xPosition, 320 + 5*height, 20, 5);
			}
			//The x position that each pillar is drawn from is increased by 200 pixels
			xPosition += 200;
		}
	}

	//This method draws an oval that represents the energy shield that covers the entrance
	public static void drawEntranceBlue(Graphics g) {
		g.setColor(Color.CYAN);
		g.fillOval(760, 180, 40, 120);

	}
	//This method draws the entrance
	public static void drawEntryRed(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(780, 180, 20, 120);
	}

	//This method draws the stand in the center of the image
	public static void podium(Graphics g) {
		g.setColor(Color.GRAY);
		g.fillRect(400, 260, 25, 40);
	}

	//This method draws Samus' helmet
	public static void helmet(Graphics g) {
		g.setColor(Color.ORANGE);
		g.fillRect(405, 245, 15, 15);
		g.setColor(Color.BLUE);
		g.fillRect(405, 250, 15, 5);
	}
}
