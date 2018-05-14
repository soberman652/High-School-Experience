import processing.core.PApplet;

public class Classroom extends Room
{	
	public Classroom(String name)
	{
		super(name);
	}
	@Override
	public void display(int direction, PApplet drawer) 
	{
		drawer.image(drawer.loadImage("img\\Classroom.png"), 0, 0);
		drawer.pushStyle();
		drawer.fill(0);
		drawer.textSize(20);
		drawer.text(this.getMarker(), drawer.width/2, drawer.height/2);
		if(direction == GameWindow.NORTH)
		{
			drawer.text('N', drawer.width/2, 30);
			for(Door d: this.getExits())
			{
				if(d.getDirection() == GameWindow.NORTH)
					d.display(drawer);
				else
					d.invisible();
			}
		}
		else if(direction == GameWindow.EAST)
		{
			drawer.text('E', drawer.width/2, 30);
			for(Door d: this.getExits())
			{
				if(d.getDirection() == GameWindow.EAST)
					d.display(drawer);
				else
					d.invisible();
			}
		}
		else if(direction == GameWindow.SOUTH)
		{
			drawer.text('S', drawer.width/2, 30);
			for(Door d: this.getExits())
			{
				if(d.getDirection() == GameWindow.SOUTH)
					d.display(drawer);
				else
					d.invisible();
			}
		}
		else if(direction == GameWindow.WEST)
		{
			drawer.text('W', drawer.width/2, 30);
			for(Door d: this.getExits())
			{
				if(d.getDirection() == GameWindow.WEST)
					d.display(drawer);
				else
					d.invisible();
			}
		}
		drawer.popStyle();
	}
}
