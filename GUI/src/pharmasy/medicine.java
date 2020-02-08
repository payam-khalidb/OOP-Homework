package pharmasy;


public class medicine implements income{
    String name;
    int medicine;
public medicine (String n , int r)
{
     name=n;    
      medicine=r;                     
}

  

    
  
    public void name(String a) {
       name=a;
        
    }

  
    public void medicineup(int a) {
        medicine+=a;
        
    }

   
    public void medicinedown(int a) {
        medicine-=a;
           
    }    
    
    public void out ()
    {
        System.out.println("name is: "+name+"   ram is: "+medicine);
    }

}
