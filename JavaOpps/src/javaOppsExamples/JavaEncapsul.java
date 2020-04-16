/**
 * 
 */
package javaOppsExamples;

/**
 * @author kiran
 *
 */
public class JavaEncapsul {

	/**
	 * @param args
	 */

	
	
	
	
	public static void main(String[] args) {
		Faviroute fvr=new Faviroute();
		System.out.println("******Movie Name******");
		fvr.setMovieName("AVENGERS");
		System.out.println("\n");
		System.out.println("*********Cast name*******");
		fvr.setCastName("Robert Downey Jr.,\n Chris Evans \n Mark Ruffalo\n Chris Hemsworth\nScarlett Johansson\nJeremy Renner\nTom Hiddleston\nSamuel L. Jackson\nGwyneth Paltrow\nPaul Bettany");

		
		fvr.getMovieName();
		fvr.getCastName();
	}

}

class Faviroute{
	
	
	 private String movieName; 
		private String castName;
		
		public void setMovieName(String name) {
			System.out.println(name);
		}
		public void setCastName(String castname) {
			System.out.println(castname);
		}
		public void getMovieName() {
			System.out.println(this.movieName);
		}
		public void getCastName() {
			System.out.println(this.castName);
		}
}
