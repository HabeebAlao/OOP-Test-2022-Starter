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
		}		
	}

	public void settings()
	{
		size(800, 800);
	}

	public void setup() 
	{
		colorMode(HSB);
		background(0);
		smooth();				
	}
	

	public void loadNematodes()
	{
		Table table = loadTable("OOP-Test-2022-Starter/data/nematodes.csv", "header");

	}


	public void draw()
	{	
		
	}
}
