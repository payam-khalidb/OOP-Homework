package pharmasy;

public class Pharmasy {
 
    
    
    
    
    public static void main(String[] args) {
     
     ////bills   
        bills ob = new bills();
       ob.price_cost(1000);
       ob.bills_info("02na");
 System.out.println(""+ob.bills_info()+"  cost is "+ob.price_cost()+"$");
 ///bills
 
////sick
        sick obb=new sick();
        obb.sickness("diabetes");
        System.out.println("our person sick is: "+obb.sickness());
        ////sick
        ///order
        order obj=new order();
                obj.level();
   ///order
   order co[]=new order[3];
    co[0]=new bills();
     co[1]=new sick();
     co[2]=new order();
       for (int i = 0; i < 3 ; i++) {
            co[i].code_for_sickness();
        }
       income obt = new medicine("glimepiride (Amaryl)", 10);
       obt.name("gliclazide");
       obt.medicineup(15);
       obt.medicinedown(20);
       obt.out();
    }
    
}
