
package pharmasy;

public class bills extends order{
    public String bills;
    public int price ;
   
    public int price_cost(){
return price;
}
 public void price_cost(int data_price){
   price=data_price;
   }   
 
    public String bills_info(){
return bills;
}
 public void bills_info(String data_bills){
   bills=data_bills;
   }   
 void code_for_sickness(){
     System.out.println("need to eat bills six time in day");
 }
}
