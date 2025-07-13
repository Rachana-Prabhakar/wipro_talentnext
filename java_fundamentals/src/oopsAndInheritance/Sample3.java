package oopsAndInheritance;

public class Sample3 {
	
	    String name;
	    String taste;
	    int size;

	    public Sample3(String name, String taste, int size) {
	        this.name = name;
	        this.taste = taste;
	        this.size = size;
	    }

	    public void eat() {
	        System.out.println("This is a " + name + " and it tastes " + taste + ".");
	    }

	    public static void main(String[] args) {
	        Apple apple = new Apple();
	        Orange orange = new Orange();

	        apple.eat();
	        orange.eat();
	    }
	}

	class Apple extends Sample3 {
	    public Apple() {
	        super("Apple", "Sweet", 5);
	    }

	    public void eat() {
	        System.out.println(name + " tastes " + taste + " and is crunchy.");
	    }
	}

	class Orange extends Sample3 {
	    public Orange() {
	        super("Orange", "Sour", 4);
	    }

	    public void eat() {
	        System.out.println(name + " tastes " + taste + " and is juicy.");
	    }
	}


