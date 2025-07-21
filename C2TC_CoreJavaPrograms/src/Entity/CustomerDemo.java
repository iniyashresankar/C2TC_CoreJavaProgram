package Entity;

public class CustomerDemo {

	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.setCid(101);
		c1.setCname("Rethika");
		c1.setCity("Puducherry");
		//this is using getter function
		/*System.out.println("Customer id "+ c1.getCid());
		System.out.println("Customer name "+ c1.getCname());
		System.out.println("Customer city "+ c1.getCity());*/
		
		System.out.println(c1);//using object printing
		
		Customer c2 = new Customer();
		c2.setCid(102);
		c2.setCname("Yakesh");
		c2.setCity("Pune");
		
		System.out.println(c2);
	}

}
