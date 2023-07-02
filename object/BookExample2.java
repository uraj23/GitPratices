public class BookExample2 {
    public static void main(String[] args) {
        
        Book b1=new Book();
        Book b2=new Book();
        Book b3=new Book();
        System.out.println(b1+" "+b2+" "+b3);
         
        //Reference varible holds addres of the object 
        System.out.println(b1==b2);//false
        System.out.println(b1==b3);//false
        System.out.println(b2==b3);//false
    }
}
