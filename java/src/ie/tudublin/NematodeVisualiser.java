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

	

	

	public void draw()
	{	
		background(0);

		int cy = this.height / 2;
    	int cx = this.width / 2;

		// color of lines
		stroke(118+X*7, 218+X*3, 193+X*6);


		

		

		for (int i = 0; i < nematodes.get(X).getLength() ; i++) {
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
			
			fill(0,0,0);

			
			circle(cx, (cy + 70) - i * 30, 30);

			if (nematodes.get(X).getLimbs() == 1) {
			

				//left limb
				line(cx - 18,  ((cy + 70) - i * 30), cx-40,  (cy + 70) - i * 30);
				//right limb
				
				line(cx + 18,  ((cy + 70) - i * 30), cx+40,  (cy + 70) - i * 30);
			}

			fill(118+X*2, 218+X*3, 193+X*6);
			textAlign(CENTER);
			textSize(40);
			text("im habeeb and i like OOP and its cool", cx, 150);

			fill(118+X*7, 218+X*3, 193+X*6);
			textAlign(CENTER);
			textSize(100);
			text(nematodes.get(X).getName(), cx, 100);



			if (nematodes.get(X).getGender() == "m") {
				
				if(i == 0){
					line(cx, ((cy + 70) - i * 30) + 30, cx, ((cy + 70) - i * 30)+ 60);
				}
			}

			if (nematodes.get(X).getGender() == "f") {

			}

			if (nematodes.get(X).getGender() == "h") {

			}

			if (nematodes.get(X).getGender() == "n") {

			}


			

			if (nematodes.get(X).getEyes() == 1) {
				if (i + 1 == nematodes.get(X).getLength()) {
					line(cx+5,  ((cy + 70) - i * 30)-15, cx+20, ((cy + 70) - i * 30)-30);
					line(cx-5,  ((cy + 70) - i * 30)-15, cx-20, ((cy + 70) - i * 30)-30);
					circle(cx-20, ((cy + 70) - i * 30)-30, 10);
					circle(cx+20, ((cy + 70) - i * 30)-30, 10);
				}
			}

		}

	}
}
