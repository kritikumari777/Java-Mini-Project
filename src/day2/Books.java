package day2;
import java.util.Objects;
public class Books {
	    String  bid;
	    String bname ;
	    String bauthor;

	    public Books() {

	    }

	    public Books(String bid, String bname, String bauthor) {
	        this.bid = bid;
	        this.bname = bname;
	        this.bauthor = bauthor;
	    }

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        Books books = (Books) o;
	        return bid.equals(books.bid) && bname.equals(books.bname) && bauthor.equals(books.bauthor);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(bid, bname, bauthor);
	    }

	    @Override
	    public String toString() {
	        return "Book{" +
	                "bid='" + bid + '\'' +
	                ", bname='" + bname + '\'' +
	                ", bauthor='" + bauthor + '\'' +
	                '}';
	    }
	}