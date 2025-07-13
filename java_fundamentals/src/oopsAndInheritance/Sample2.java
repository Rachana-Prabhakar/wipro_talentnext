package oopsAndInheritance;

public class Sample2 {

	    static class Animal {
	        public void eat() {
	            System.out.println("Animal is eating...");
	        }

	        public void sleep() {
	            System.out.println("Animal is sleeping...");
	        }
	    }
	    static class Bird extends Animal {
	     
	        public void eat() {
	            System.out.println("Bird is pecking food...");
	        }

	        public void sleep() {
	            System.out.println("Bird is sleeping in its nest...");
	        }

	        public void fly() {
	            System.out.println("Bird is flying...");
	        }
	    }

	    public static void main(String[] args) {
	        // Creating Animal object
	        Animal animal = new Animal();
	        animal.eat();
	        animal.sleep();

	        System.out.println("--------------------");

	        // Creating Bird object
	        Bird bird = new Bird();
	        bird.eat();
	        bird.sleep();
	        bird.fly();
	    }
	}



