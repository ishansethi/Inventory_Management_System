import java.util.*;

public class Product
{
    private String ProdName;
    private  String ProdDesc;
    private double ProdPrice;
    private int QtyOnHand;
    private int MinOrderQty;
    public Product(){
        
    }

    public void setProdName(String ProdName){
        if(ProdName.length()>=3 && ProdName.length()<=25){

            this.ProdName = ProdName;

        }

    }

    public String GetProdName(){
        return ProdName;
    }

    public void setProdDesc(String ProdDesc){
        if(ProdDesc.length()>=1 && ProdDesc.length()<=50){

            this.ProdDesc = ProdDesc;
        }
    }

    public String GetProdDesc(){
        return ProdDesc;
    }

    public void setProdPrice(double ProdPrice){

        if(ProdPrice>0){
            this.ProdPrice = ProdPrice;
        }
    }

    public double GetProdPrice(){
        return ProdPrice;
    }

    public void setQtyOnHand(int QtyOnHand){

        if(QtyOnHand>=0 && QtyOnHand<=10){
            this.QtyOnHand = QtyOnHand;
        }
    }

    public int GetQtyOnHand(){
        return QtyOnHand;
    }

    public void setMinOrderQty(int MinOrderQty){
        if(MinOrderQty >=1 && MinOrderQty <=5 ){
            this.MinOrderQty = MinOrderQty;
        }
    }

    public double GetMinOrderQty(){
        return MinOrderQty;
    }

}

/*

public void Product()
{
Scanner in = new Scanner(System.in);
/* char ProdName;
String ProdDesc;
double ProdPrice;
int QtyOnHand=0;
int MinOrderQty=0;
int ProdOpt=0;
System.out.println("**#**#**#**#**#**#**#**#**#**#**#");
System.out.println("Enter The Details For The Product");
System.out.println("**#**#**#**#**#**#**#**#**#**#**#");
System.out.println("Enter Product Name : ");
String ProdName = in.nextLine();

System.out.println("Enter Product Description : ");
ProdDesc = in.nextLine();
System.out.println("Product Price : ");
ProdPrice = in.nextDouble();
System.out.println("Voila!!Product added to the list");
System.out.println("Product Name : \n\t"+ProdName);
System.out.println("Description : \n\t"+ ProdDesc);
System.out.println("Quantity: \n\t"+ QtyOnHand);
System.out.println("Price: \n\t"+ ProdPrice);
System.out.println("Min. Order Quantity : \n\t"+ MinOrderQty);

System.out.println("Enter 0 to Exit ");
System.out.println("Enter 1 to add another Product ");
System.out.println("Enter 2 to go to Main Menu ");
ProdOpt=in.nextInt();
switch(CaseOpt)
{
case 0:
System.exit(0) ;
break;
case 1:
Product();
break;
case 2:
//   head();
break;
}
}
 */
