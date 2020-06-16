import java.util.*;

public class ProductList  
{
    ArrayList<Product> Items ;
 
    public ProductList(){
        Items = new ArrayList<Product>() ;
    }
}

/*
 public void ProductList()
    {
    Scanner in = new Scanner(System.in);    
        int i = 1; //for forloop
        int ProdLiOpt = 0;
       
        String ProdDesc;
        double ProdPrice;
        int QtyOnHand=0;
        int MinOrderQty=0;
        int CaseOpt=0;
        
        
        
    System.out.println("*****Product List*****");
    System.out.println("*Available Products = ");
    System.out.println("*Total Sale in aud = ");
    
    for(i=1;i<=10;i++)
    {
       // System.out.println("Name : \n\t"+ ProdName);
       // System.out.println("Description : \n\t"+ ProdDesc);
        System.out.println("Quantity : \n\t"+ QtyOnHand);
       // System.out.println("Price : \n\t"+ ProdPrice);
        System.out.println("Min. Order Quantity : \n\t"+ MinOrderQty);
    }
    
    
    
    System.out.println("--> Press 1 To Go Back \n\t");
    System.out.println("--> Press 0 For Exit \n\t");
    
    ProdLiOpt = in.nextInt();
    switch(ProdLiOpt)
    {
        case 1: 
            //Sale();
            break;
        case 0: 
            System.exit(0);
            break;
    
    }
    
    }
 */