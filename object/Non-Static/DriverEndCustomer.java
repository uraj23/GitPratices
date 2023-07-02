class DriverEndCustomer {
    public static void main(String[] args){
                //step 1:create objects 
                //create End customer three objects 
                EndCustomer c1=new EndCustomer();
                EndCustomer c2=new EndCustomer();
                EndCustomer c3=new EndCustomer();
                  //Step 2: Assign values
                //Assign details in EndCustomer Objects
                //assign values in 1st object 
                c1.cid="101";
                c1.name="potter";
                c1.pwd="****";
                //Assign values in 2nd object
                c2.cid="102";
                c2.name="Hari";
                c2.pwd="****";
                //Assign values in 3rd object
                c3.cid="103";
                c3.name="berlin";
                c3.pwd="****";

                //Step 3: print End customer objects
                //frist customer details
                System.out.println("1st customer details");
                System.out.println("customer id : "+c1.cid);
                System.out.println("customer name : "+c1.name);
                System.out.println("Customer password : "+c1.pwd);
                //second customer details
                System.out.println("2nd customer details");
                System.out.println("costomer id : "+c2.cid);
                System.out.println("customer name : "+c2.name);
                System.out.println("customer pwd : "+c2.pwd); 
                //3rd customer deatails
                System.out.println("3rd customer details ");
                System.out.println("customer id : "+c3.cid);
                System.out.println("customer name  : "+c3.name);
                System.out.println("customer password : "+c3.pwd);
                






    }
    
}
