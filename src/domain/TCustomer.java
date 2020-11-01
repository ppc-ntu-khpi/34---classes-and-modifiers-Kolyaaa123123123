

public class TCustomer {
   
    public static void main(String A[]){
        Customer d = new Customer();
        d.displayCustomerInfo();

        d.setID(2);
        d.setIsNew(true);
        d.setTotal(978);

        System.out.println("ID : " + d.getID());
        System.out.println("Is new : " + d.isIsNew());
        System.out.println("Total : " + d.getTotal());  
    }
}