import java.util.*;
public class RandomNumberGenerator
{
  private int MinimumValue;
  private int MaximumValue;
  public RandomNumberGenerator(){
    
    }
  
  public int GetQtyOnHandRand()
  {
    int QtyOnHand;
    Random rand = new Random();
    MinimumValue = 0;
    MaximumValue =  10;
    QtyOnHand = rand.nextInt((MaximumValue - MinimumValue) + 1) + MinimumValue;
    return QtyOnHand;
   } 
    public int GetMinOrderQtyRand()
  {
    int MinOrderQty;
    Random rand = new Random();
    MinimumValue = 1;
    MaximumValue = 5;
    MinOrderQty = rand.nextInt((MaximumValue - MinimumValue) + 1) + MinimumValue;
    return MinOrderQty;
   } 
     
   }

   
   /*
    * public void RandomNumberGenerator()
    {
       Random rand = new Random();
       intmin=1,max=10,value=0;
       int QtyOnHand=0;
       int MinOrderQty=0;
       value = rand.nextInt(10); 
       value = rand.nextInt((max - min) + 1) + min;
       
       
    
    }
    
    */