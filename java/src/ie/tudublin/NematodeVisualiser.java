package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class NematodeVisualiser extends PApplet
{

	ArrayList <Nematode> nematodes = new ArrayList<Nematode>();

	
	int X = 6;


	public void keyPressed()
	{		
		if (keyCode == LEFT)
		{
			System.out.println("pressed LEFT");
			if (1 <= X-1)
				X--;
				System.out.println(X);
		}		
		if (keyCode == RIGHT)
		{
			System.out.println("pressed RIGHT");
			
			if (X+1 <= 12)
				X++;
				System.out.println(X);
		}	
	}

	public void settings()
	{
		size(800, 800);
		loadNematodes();	}

	public void setup() 
	{
		colorMode(HSB);
		background(0);
		smooth();				
	}
	

	public void loadNematodes()
	{
		Table table = loadTable("OOP-Test-2022-Starter/data/nematodes.csv", "header");

		for(TableRow ROW:table.rows())
		{
			
			Nematode nematode = new Nematode(ROW);
			nematodes.add(nematode);
			println(nematode);
		}

	}

	public void update(){

	}

	

	public void draw()
	{	
		background(0);

		int cy = this.height / 2;
    	int cx = this.width / 2;

		// color of lines
		stroke(118, 218, 193);


		//right down slant 
		line(cx + 70, cy-20, cx+150, cy);
		//horizontal line right
		line(cx + 50, cy, cx+150, cy);
		//right up slant
		line(cx + 70, cy+20, cx+150, cy);


		// left down slant
		line(cx - 150, cy, cx-80, cy-20);
		// horizontal line left
		line(cx - 150, cy, cx-50, cy);
		//lef up slant 
		line(cx - 150, cy, cx-80, cy+20);

		

		for (int i = 0; i < nematodes.get(X).getLength() ; i++) {
			
			fill(0,0,0);
			//left limb
			
			circle(cx, (cy + 70) - i * 30, 30);

			//right limb
			
			
		}


	}
}
