import java.awt.Color;
import java.util.Random;

public class ThreadHelper implements Runnable {

	Random rand = new Random();
	
	ObjectHandler[] obj;
	int windowsize;
	ThreadHelper(ObjectHandler[] obj, int windowsize) {
		this.obj = obj;
		this.windowsize = windowsize;
	}
	
	@Override
	public void run() {
		while(true) {
			for (ObjectHandler x : obj) {
			x.setBounds(rand.nextInt(windowsize - 300), rand.nextInt(windowsize - 300), rand.nextInt(windowsize - 800)+100, rand.nextInt(windowsize - 800)+100);
			x.setBackground(new Color(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255)));
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
