package cp1_hw;

public class BookTest {

	public static void main(String[] args) {
		 MajorBook majorBook = new MajorBook("Introduction to Java", "John Smith", 2021, "Computer Science");
		 majorBook.displayInfo();
		    
		 System.out.println();
		    
		 FictionBook fictionBook = new FictionBook("1984", "George Orwell", 1949, "SF");
		 fictionBook.displayInfo();
	}
}

class Book {
    String title;
    String author;
    int year;

    Book(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }
    
    void displayInfo() {
        System.out.println("제목 : " + title);
        System.out.println("저자 : " + author);
        System.out.println("출판년도 : " + year);
    }
}

class MajorBook extends Book {
    String major;
    
    MajorBook(String title, String author, int year, String major) {
    	super(title, author, year);
        this.major = major;
    }
    
    void displayInfo() {
        System.out.println("제목 : " + title);
        System.out.println("저자 : " + author);
        System.out.println("출판년도 : " + year);
        System.out.println("전공 : " + major);
    }
}

class FictionBook extends Book {
    String genre;
    
    FictionBook(String title, String author, int year, String genre) {
    	super(title, author, year);
        this.genre = genre;
    }
    
    void displayInfo() {
        System.out.println("제목 : " + title);
        System.out.println("저자 : " + author);
        System.out.println("출판년도 : " + year);
        System.out.println("장르 : " + genre);
    }
}