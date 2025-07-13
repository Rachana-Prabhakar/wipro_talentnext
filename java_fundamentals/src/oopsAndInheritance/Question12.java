package oopsAndInheritance;

	abstract class Vehicle {
	    public abstract String getModelName();
	    public abstract String getRegistrationNumber();
	    public abstract String getOwnerName();
	}

	class Hero extends Vehicle {
	    public String getModelName() {
	        return "Hero Splendor";
	    }

	    public String getRegistrationNumber() {
	        return "AP23AB1234";
	    }

	    public String getOwnerName() {
	        return "Rachana Jyothi";
	    }

	    public int getSpeed() {
	        return 60;
	    }

	    public void radio() {
	        System.out.println("Radio is ON - Playing Music.");
	    }
	}

	class Honda extends Vehicle {
	    public String getModelName() {
	        return "Honda Activa";
	    }

	    public String getRegistrationNumber() {
	        return "TS09CZ5678";
	    }

	    public String getOwnerName() {
	        return "Rachana Jyothi";
	    }

	    public int getSpeed() {
	        return 55;
	    }

	    public void cdPlayer() {
	        System.out.println("CD Player is ON - Playing CD.");
	    }
	}

	public class Question12 {
	    public static void main(String[] args) {
	        Hero hero = new Hero();
	        System.out.println("----- Hero Details -----");
	        System.out.println("Model: " + hero.getModelName());
	        System.out.println("Registration Number: " + hero.getRegistrationNumber());
	        System.out.println("Owner: " + hero.getOwnerName());
	        System.out.println("Speed: " + hero.getSpeed() + " km/h");
	        hero.radio();

	        System.out.println();

	        Honda honda = new Honda();
	        System.out.println("----- Honda Details -----");
	        System.out.println("Model: " + honda.getModelName());
	        System.out.println("Registration Number: " + honda.getRegistrationNumber());
	        System.out.println("Owner: " + honda.getOwnerName());
	        System.out.println("Speed: " + honda.getSpeed() + " km/h");
	        honda.cdPlayer();
	    }
	}


