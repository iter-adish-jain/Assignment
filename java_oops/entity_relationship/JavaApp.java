/**
 * 
 */
package edu.jecrc.sdt.java_oops.entity_relationship;

/**
 * 
 */
public class JavaApp {
	public static void execution() {
		Engine engine = new Engine(1500, "Water Based", 4);
	    
		Car car = new Car("Hyundai", "Creta", "Made in India", 963963.962375, engine);
		
		car.displayCarDetails();
		
		car.getEngine().displayEngineDetails();
		
		
		MediaPlayer mediaPlayer = new MediaPlayer("Music Player", "Boat", 365269.368);
		
		car.setMediaPlayer(mediaPlayer);
		car.getMediaPlayer().displayMediaPlayerDetails();
	}
}
