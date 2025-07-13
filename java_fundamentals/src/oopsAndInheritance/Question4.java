package oopsAndInheritance;

public class Question4 {
	
	    public void draw() {
	        System.out.println("Drawing Shape");
	    }

	    public void erase() {
	        System.out.println("Erasing Shape");
	    }

	    public static void main(String[] args) {
	        Question4 c = new Circle();
	        Question4 t = new Triangle();
	        Question4 s = new Square();

	        c.draw();
	        c.erase();

	        t.draw();
	        t.erase();

	        s.draw();
	        s.erase();
	    }
	}

	class Circle extends Question4 {
	
	    public void draw() {
	        System.out.println("Drawing Circle");
	    }

	    public void erase() {
	        System.out.println("Erasing Circle");
	    }
	}

	class Triangle extends Question4 {
	 
	    public void draw() {
	        System.out.println("Drawing Triangle");
	    }

	    public void erase() {
	        System.out.println("Erasing Triangle");
	    }
	}

	class Square extends Question4 {
	    
	    public void draw() {
	        System.out.println("Drawing Square");
	    }

	    public void erase() {
	        System.out.println("Erasing Square");
	    }
	}

