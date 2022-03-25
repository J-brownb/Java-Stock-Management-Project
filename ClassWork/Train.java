package uk.ac.uos.i2p.s223358;

public class Train {
	public String trainModel;
	public int trainTopspeed;
	public int trainWheels;
	public int trainCarriages;

public void printTrainDetails() {
	System.out.println("---TRAIN STATS---");
	System.out.println("Model -> " + trainModel + ", " + "Top Speed -> " + trainTopspeed + "mph");
	System.out.println("Number of Wheels -> " + trainWheels + ", " + "Number of Carriages -> " + trainCarriages);}

}
