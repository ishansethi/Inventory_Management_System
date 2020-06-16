import java.util.*;
/**
 * Write a description of class Sale here.

 * @Ishan
 * @version-1
 */

public class Sale
{
    ProductList ProdList;
    SaleTransaction Transaction;

    public void head()
    {   
       // String ProdName = " Laptop" ;

        int option = 0;

        System.out.print('\u000C');
        ProdList = new ProductList();
        Scanner in = new Scanner(System.in);

        System.out.println("*********Welcome To IMS********* \n\t");
        System.out.println("******************************** \n\t");
        System.out.println("Please Select From The Given Options \n\t");
        System.out.println("******************************** \n\t");
        while(true){
        System.out.println("1) Register Product for Sale \n\t");
        System.out.println("2) Buy a Product to the cart \n\t");
        System.out.println("3) Remove Product from the cart \n\t");
        System.out.println("4) View all available Products \n\t");
        System.out.println("5) Check Out \n\t");     
        System.out.println("6) Get Help \n\t");
        System.out.println("7) Exit \n\t");
        System.out.println("Enter your choice to proceed  \n\t");

        option=in.nextInt();
        selectOptions(option, ProdList);
    }
        //System.out.print('\u000C'); //for clearing terminal
    }

    public void selectOptions(int option,ProductList ProdList){

       
        switch(option)
        {
            case 1 : 
            //System.out.print("done");
            RegisterProduct(ProdList);
            //System.out.print('\u000C');
            break;
            case 2 : 
            //BuyProductToCart() ;
            break;
            case 3 : 
            //RemProdFromCart() ;
            break;
            case 4 :
            DisplayAllProduct(ProdList) ;
            break;
            case 5 : 
            //CheckOutFromCart() ;
            break;
            case 6 : 
            helpuser();
            break;
            case 7 : System.exit(0) ;
            break;
            default : System.out.println(" Invalid Choice Please Try Again \n\t");
            break;
        }    

    }

    public void RegisterProduct(ProductList ProductList){

        Scanner in = new Scanner(System.in);
        String ProductName;
        Boolean isProductFound = false;
        RandomNumberGenerator RandNumb = new RandomNumberGenerator();
        
          if (ProductList.Items.size() == 5 ){
            System.out.println("Product List is Full");
            return;
        }
        
        System.out.println("**#**#**#**#**#**#**#**#**#**#**#");
        System.out.println("Enter The Details For The Product");
        System.out.println("**#**#**#**#**#**#**#**#**#**#**#");
        System.out.println("Enter Product Name : ");
        ProductName = in.nextLine();
    
      
        for(Product Product : ProductList.Items){

            if(Product.GetProdName().equalsIgnoreCase(ProductName)){
                System.out.println("Same Name");
                isProductFound = true;
                break;
            }

        }
        if(!isProductFound){
            Product Product = new Product();  

            Product.setProdName(ProductName);
            System.out.println("Enter Product Description : ");
            String ProductDesc = in.nextLine();
            Product.setProdDesc(ProductDesc);
            System.out.println("Product Price : ");
            Double ProdPrice = in.nextDouble();
            Product.setProdPrice(ProdPrice);

            Product.setQtyOnHand(RandNumb.GetQtyOnHandRand());
            Product.setMinOrderQty(RandNumb.GetMinOrderQtyRand());

            ProductList.Items.add(Product);
            System.out.println("Product Added and exiting to main menu");
            //System.out.println("Product size " + ProductList.Items.size() );
        }

    }

    public void DisplayAllProduct(ProductList ProductList){

       // System.out.print("done 1 " + ProductList.Items.size());
        for(Product Product : ProductList.Items){
            System.out.println("Product Name : "+Product.GetProdName());
            System.out.println("Description : "+ Product.GetProdDesc());
            System.out.println("Quantity: "+ Product.GetQtyOnHand());
            System.out.println("Price: "+ Product.GetProdPrice());
            System.out.println("Min. Order Quantity : "+ Product.GetMinOrderQty());

        }
         //System.out.print("DONE 1 " + ProductList.Items.size());
    }



        public void helpuser()
        {
        
        Scanner in = new Scanner(System.in);
        System.out.println("***************************");
        System.out.println("Welcome To IMS Help Center");
        System.out.println("***************************");
        
        System.out.println("a) Register Product for Sale \n\t");
        System.out.println("This section will help you to register a product for sale. \n The Registeration menu will ask for various fields to be filled out. \n **Min order quantity to be sold will be given by the System.");
        System.out.println("b) Buy a Product \n\t");
        System.out.println("This section will help you to buy a product. \n The List menu will show various available items. \n You will have to choose the product from the list. \n Then Proceed to the cart.");
        System.out.println("c) Remove Product from the cart \n\t");
        System.out.println("This section will help you to remove a product from cart. \n The List menu will show an option to delete the product ,you will have to enter product id to remove it . \n After deleting just proceed to the checkout. \n ");
        System.out.println("d) View all available Products \n\t");
        System.out.println("This section will help you to see all the available products and their details. \n The List menu will show an option to go back to the previous menu. \n Then proceed with your desirable option.");
        System.out.println("0) Exit \n\t");
        System.out.println("Enter 0 to exit  \n\t");
        
        int helpopt =in.nextInt();
        // Q = in.nextString();
        switch(helpopt)
        {
        
        case 0 : System.exit(0) ;
        break;
        default : System.out.println(" Invalid Choice Please Try Again \n\t");
        break;
        }
        
        }
    }
