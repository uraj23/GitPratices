 class DriverBook {
    public static void main(String[] args) {
        //create three objects for Book class
        Book b1=new Book();
        Book b2=new Book();
        Book b3=new Book();
        //assign data for 1st book
        b1.title="haripoter";
        b1.price=1200;

        //to print properties of 1st book
        System.out.println(b1.title);
        System.out.println(b1.price);
      //assign data for 2st book
        b2.title="titanic";
        b2.price=1250;
        //to print properties of 2nd book
        System.out.println(b2.title);
        System.out.println(b2.price);
        //assign data for 2st book
        b3.title="poter";
        b3.price=1000;
        //to print properties of 3rd book
        System.out.println(b3.title);
        System.out.println(b3.price);

    }
}
