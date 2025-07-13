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
        return "TS09AB1234";
    }

    public String getOwnerName() {
        return "Rachana Jyothi";
    }

    public int getSpeed() {
        return 80;
    }

    public void radio() {
        System.out.println("Radio is ON. Playing FM...");
    }
}

class Honda extends Vehicle {
    public String getModelName() {
        return "Honda Activa";
    }

    public String getRegistrationNumber() {
        return "AP10XY5678";
    }

    public String getOwnerName() {
        return "Rachana Jyothi";
    }

    public int getSpeed() {
        return 60;
    }

    public void cdPlayer() {
        System.out.println("CD Player is playing your favorite track...");
    }
}

class Logan extends Vehicle {
    public String getModelName() {
        return "Renault Logan";
    }

    public String getRegistrationNumber() {
        return "MH12PQ7890";
    }

    public String getOwnerName() {
        return "Rachana Jyothi";
    }

    public int speed() {
        return 120;
    }

    public int gps() {
        System.out.println("GPS Navigation is now active.");
        return 1;
    }
}

class Ford extends Vehicle {
    public String getModelName() {
        return "Ford Ecosport";
    }

    public String getRegistrationNumber() {
        return "KA05GH4321";
    }

    public String getOwnerName() {
        return "Rachana Jyothi";
    }

    public int speed() {
        return 140;
    }

    public int tempControl() {
        System.out.println("Air conditioning temperature adjusted.");
        return 1;
    }
}

public class Sample14 {
    public static void main(String[] args) {
        Hero hero = new Hero();
        System.out.println(hero.getModelName());
        System.out.println(hero.getRegistrationNumber());
        System.out.println(hero.getOwnerName());
        System.out.println(hero.getSpeed());
        hero.radio();

        Honda honda = new Honda();
        System.out.println(honda.getModelName());
        System.out.println(honda.getRegistrationNumber());
        System.out.println(honda.getOwnerName());
        System.out.println(honda.getSpeed());
        honda.cdPlayer();

        Logan logan = new Logan();
        System.out.println(logan.getModelName());
        System.out.println(logan.getRegistrationNumber());
        System.out.println(logan.getOwnerName());
        System.out.println(logan.speed());
        logan.gps();

        Ford ford = new Ford();
        System.out.println(ford.getModelName());
        System.out.println(ford.getRegistrationNumber());
        System.out.println(ford.getOwnerName());
        System.out.println(ford.speed());
        ford.tempControl();
    }
}


