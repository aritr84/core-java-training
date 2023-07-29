



//POJO class or a Bean class
//It will hand over the lifecycle of the bean to IOC container.

public class Book {
	private int isbn; String author; float price;
	 //Object within object. This is called containment.
	Book(){
		//Predefined.
		System.out.println("Book created...");
	}
	Book(int isbn, String author)
	{
		this.isbn=isbn;  this.author=author;
		System.out.println("Book created with ISBN and Author");
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
		System.out.println("Changed ISBN to " + this.isbn);
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
		System.out.println("Author name set as " + this.author);
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
		System.out.println("Price set as " + this.price);
	}
}
