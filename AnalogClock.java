import java.applet.*;
import java.awt.*;
/*
<applet code="AnalogClock" height=800 width=800></applet>
*/
public class AnalogClock extends Applet implements Runnable 
{
	int xMin[]={350,362,374,386,398,412,425,435,443,450,455,461,466,468,469,470,469,468,466,461,455,450,444,435,425,412,398,386,374,362,350,338,326,314,302,288,275,265,256,250,245,239,234,232,231,230,231,232,234,239,245,250,257,265,275,288,302,314,326,338};
	int yMin[]={220,221,222,225,228,234,241,249,259,269,280,293,307,319,333,350,367,381,391,405,418,429,435,440,448,455,461,464,467,468,470,468,467,464,461,455,448,440,435,429,418,405,391,381,367,350,333,319,307,293,280,269,259,249,241,234,228,225,222,221};
	Thread t;
	public void start()
	{
		t=new Thread(this,"Analog Clock");
		t.start();
	}
	public void run()
	{
		Graphics g = getGraphics();
		
		try
		{
		for(int i=0;i<60;i++)
		{
			update(g);
			g.drawOval(350,350,3,3);
			g.drawOval(200,200,300,300);
			g.drawString("12",343,220);
			g.drawString("3",480,355);
			g.drawString("6",345,495);
			g.drawString("9",210,355);
			g.drawLine(350,350,xMin[i],yMin[i]);
			Thread.sleep(1000);
		}
		}
		catch(InterruptedException ie){}
	}
}
