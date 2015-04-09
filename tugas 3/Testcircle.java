class Testcircle {
	public static void main(String[] args) {
	
circle cahya = new circle ();
circle ardi = new circle(30);
circle akbar = new circle(30,"merah");
cahya.setColor("pink");
System.out.println("radius= "+ cahya.getRadius() +" Color =" +cahya.getColor() + "Luas ="+cahya.getArea() );
System.out.println("Radius= "+ ardi.getRadius() +" Color =" +ardi.getColor() + "Luas ="+ardi.getArea() );
System.out.println("Radius= "+ akbar.getRadius() +" Color =" +akbar.getColor() + "Luas ="+akbar.getArea() );
	}
}