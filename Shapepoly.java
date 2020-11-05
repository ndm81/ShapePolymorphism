class Shape{
	void draw(){
		System.out.println("Draw the Shape");
	}
}
 class Rectangle extends Shape{
 	void draw(){
 		System.out.println("Draw the Rectangle");
 	}
 }

 class Circle extends Shape{
 	void draw(){
 		System.out.println("Draw the Circle");
 	}
 }

 class Triangle extends Shape{
 	void draw(){
 		System.out.println("Draw the Triangle");
 	}
 }

 class MainClass{
 	public static void main(String[] args) {
 		Shape s=new Shape();
 		Rectangle r=new Rectangle();
 		Circle c=new Circle();
 		Triangle t=new Triangle();
 		         s.draw();
 	             r.draw();
 	             c.draw();
                 t.draw();
 	            
 	}
 }