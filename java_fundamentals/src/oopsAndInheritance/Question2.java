package oopsAndInheritance;


	class Author {
	    private String name;
	    private String email;
	    private char gender;

	 
	    public Author(String name, String email, char gender) {
	        this.name = name;
	        this.email = email;
	        this.gender = gender;
	    }

	    // Getters for Author class
	    public String getName() {
	        return name;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public char getGender() {
	        return gender;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }
	}

	class Book {
	    private String name;
	    private Author author;
	    private double price;
	    private int qtyInStock;

	   
	    public Book(String name, Author author, double price, int qtyInStock) {
	        this.name = name;
	        this.author = author;
	        this.price = price;
	        this.qtyInStock = qtyInStock;
	    }

	    public String getName() {
	        return name;
	    }

	    public Author getAuthor() {
	        return author;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public int getQtyInStock() {
	        return qtyInStock;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }

	    public void setQtyInStock(int qtyInStock) {
	        this.qtyInStock = qtyInStock;
	    }
	}

	public class Question2 {
	    public static void main(String[] args) {
	       
	        Author author = new Author("Madhuri Vijay", "madhurivijay07@gmail.com", 'F');

	       
	        Book book = new Book("The Far Field", author, 789.9, 100);


	        System.out.println("Book Details:");
	        System.out.println("Name: " + book.getName());
	        System.out.println("Author: " + book.getAuthor().getName());
	        System.out.println("Author Email: " + book.getAuthor().getEmail());
	        System.out.println("Author Gender: " + book.getAuthor().getGender());
	        System.out.println("Price: rs " + book.getPrice());
	        System.out.println("Quantity in Stock: " + book.getQtyInStock());
	    }
	}

