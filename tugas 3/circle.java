// nama class circle.java
class circle {
		//variabel radius
		//radius -> double
		//color -> string

		private double radius;
		private String color;
		//konstruktor untuk class circle??
			//karena nama kelas sama dengan nama fungsi
	public circle (){
		radius= 1.0;
		color ="pink";
	}
	public circle (double r){
		radius = r;
		color = "pink";

	}
		public circle (double r, String c  ){
		radius= r;
		color = c;
	}

	public double getRadius () {
		return radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String c){
		color = c;
	}
	public void setRadius(double r){
		radius= r;
	}

	public double getArea (){
		return radius*radius*Math.PI;
	}

}