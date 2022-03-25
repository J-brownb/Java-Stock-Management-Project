package uk.ac.uos.i2p.s223358;

public class ShoeTester {

public static void main(String[] args) {

Shoe s1 = new Shoe(); //go into shoe and create a new class from the file shoe

s1.shoeManufacturer = "Adidas";
s1.shoeDescription = "Pro Bounce 2018 Shoes";
s1.shoeSize = 11;
s1.mainColor = "Blue";
s1.mainMaterial = "Leather";

s1.printShoeDetails();

Shoe s2 = new Shoe();

s2.shoeManufacturer = "Nike";
s2.shoeDescription = "Air VaporMax Plus";
s2.shoeSize = 6;
s2.mainColor = "Orange";
s2.mainMaterial = "Synthetic";

s2.printShoeDetails();

}	
}
	
