public class Shipping 

paymentVerify p = new paymentVerify();
  
  if (p.paymentVerify(2, 5).equals("payment has been deducted to the balance./nThe payment is complete.")){
      System.out.println("The order has been shipped");
  }
  else if (p.paymentVerify(2, 5).equals("This purchase is through cash-on-delivery")){
      System.out.println("The order has been shipped");
  }
  else { 
      System.out.println("Transaction failed please try again");
  }
break;
