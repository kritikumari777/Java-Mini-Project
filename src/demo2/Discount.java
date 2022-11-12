//actual price after 10% discount and 5% tex

package demo2;

public class Discount {

	public static void main(String[] args) {
		int product_price=100;
		
		//after 10% discount
		double newPrice = product_price - (product_price*10)/100;
		
		// after 5% text
		
		double finalPrice = newPrice + (newPrice*5)/100;

		System.out.println(finalPrice);
	}

}
