package uk.ac.uos.i2p.s223358;

public class Shoe {
     public String shoeManufacturer;
     public String shoeDescription;
     public double shoeSize;
     public String mainColor;
     public String mainMaterial;
     
    public void printShoeDetails() {
    	System.out.println("---SHOE DETAILS---");
    	System.out.println(shoeManufacturer + ", " + shoeDescription);
    	System.out.println(shoeSize + ", " + mainColor + ", " +mainMaterial);}

	}


