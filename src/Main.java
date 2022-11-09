
public class Main {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int windowsize = 1000;
		int nrOfObjects = 50;
		ObjectHandler[] obj = new ObjectHandler[nrOfObjects];
		for (int i = 0; i!= obj.length; i++) {
			obj[i] = new ObjectHandler();
		}
		WindowHandler window = new WindowHandler(obj, windowsize);
	    ThreadHelper thread = new ThreadHelper(obj, windowsize);
	    new Thread(thread).start();
	}
}
