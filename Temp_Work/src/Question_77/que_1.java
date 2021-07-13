package Question_77;

class Product
{
	double price;
}
public class que_1 {
	
	public void updateprice(Product product, double price)
	{
		price=price*2;
		product.price=product.price+price;
	}
	
	public static void main(String[] args) {
	Product prt= new Product();
	prt.price=200;
	double newprice= 100;
	
	que_1 que=new que_1();
	que.updateprice(prt, newprice);
	System.out.println(prt.price+" : "+ newprice);

	}

}
