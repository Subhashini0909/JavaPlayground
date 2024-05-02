package conditionallogic;

public class PayableAfterDiscount {

	public static void main(String[] args) 
	{
		int purchase_amount = 5000;
		double discount;
		if(purchase_amount>=8000)
		{
			discount = purchase_amount*0.10;
			System.out.println(purchase_amount - discount);
		}
		
		else if(purchase_amount>=5000)
		{
			discount = purchase_amount*0.08;
			System.out.println(purchase_amount - discount);
		}
		
		else if(purchase_amount>=8000)
		{
			discount = purchase_amount*0.04;
			System.out.println(purchase_amount - discount);
		}
		else
		{
			discount = 100;
		System.out.println(purchase_amount - discount);
		}
		
	}

}
