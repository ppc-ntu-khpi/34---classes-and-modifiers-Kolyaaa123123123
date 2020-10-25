## Customer
```

public class Customer {

    private int ID;
    private boolean isNew;  
    private float total;

    public int getID() {
        return ID;
    }
    public boolean isIsNew() {
        return isNew;
    }
    public float getTotal() {
        return total;
    }




    public void setID(int ID) {
       this.ID = ID;
    }
    public void setIsNew(boolean isNew) {
        this.isNew = isNew;
    }
    public void setTotal(float total) {
        this.total = total;
    }
      
    public Customer(){
    ID = 1;
    isNew = true;
    total = 1000;
    }

  
    public void displayCustomerInfo() {
    
    System.out.println("ID : " +ID);
    System.out.println("Is new : " + isNew);
    System.out.println("Total : " + total);
} 
}
 
 ```

 ## done.png 
![](https://github.com/ppc-ntu-khpi/34---classes-and-modifiers-Kolyaaa123123123/blob/main/Solution/done.png)

## Advanced
![](https://github.com/ppc-ntu-khpi/34---classes-and-modifiers-Kolyaaa123123123/blob/main/Solution/advanced.png)