package pharmasy;

public class order {

    String level;
 
    
    public void level()
    {
        System.out.println("level 3");
    }
    void code_for_sickness(){
     System.out.println("need to stay 10 days");
 }
    
    class hight_level extends order
{
  public void level()
    {
        System.out.println(" level 2");
    }
    
    }
}
