package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class NematodeVisualiser extends PApplet
{

	ArrayList <Nematode> nematodes = new ArrayList<Nematode>();

	



	public void keyPressed()
	{		
		if (keyCode == LEFT)
		{
			System.out.println("pressed");
		}		
		if (keyCode == RIGHT)
		{
			System.out.println("pressed");
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

	

	public void draw()
	{	

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



	}
}
