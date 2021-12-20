/*Qiqi Hu, CS 211, 01/12/2021, assignment #10*/
public class DiscountApp extends GroceryBill{
   private boolean discount; //only one filed, others inherited
   
   public DiscountApp(){ //zero constructor 
     super();
     discount = false;
   }
   
   public DiscountApp(Employee name){ //single parameter inherited
     super(name);
   }
   
   //ACCESSORS 
   public boolean add(Item i, int num){ //if same, change the num; if not, add behind
     if(super.receipt.size()!=0 && super.receipt.contains(i)){
       int first = super.receipt.indexOf(i);
       int last = super.receipt.lastIndexOf(i);
       for(int j=last; j>=first; j--){ //remove all the same items
         super.receipt.remove(j);
       }  
     }
     
     for(int j=0; j<num; j++){ //add the numbers of items
       super.receipt.add(i);
     }  
     return true;
   }
   
   public double getTotal(){ 
     double count = 0;
     double price = 0;
     for(int i=0; i<super.receipt.size(); i++){ //check for discount
       count += super.receipt.get(i).getDiscount();
       price += super.receipt.get(i).getPrice();
     }
     
     if(discount){   //apply discounts
       return price-count;  
     }
     return price;
   }
   
   // MUTATORS       
   public void setDiscount(boolean discount){
     this.discount = discount;
   }
   
   // complicated toString methods
   public String toString(){
     String build = "";
     for(int i = 0; i < super.receipt.size(); i++) {
			build += super.receipt.get(i);
			if(i != super.receipt.size() - 1) 
				build += "\n";
     }
     return build;       
   }    
}   
