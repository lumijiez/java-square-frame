import javax.swing.JFrame;

@SuppressWarnings("serial")
public class WindowHandler extends JFrame {
   
	 WindowHandler(ObjectHandler[] obj, int windowsize) {
		 this.setSize(windowsize, windowsize);
		 this.setResizable(false);
		 this.setVisible(true);
		 this.setLayout(null);
		 for (ObjectHandler x : obj) {
			 this.add(x);
		 }
	 }
	
	 
}
