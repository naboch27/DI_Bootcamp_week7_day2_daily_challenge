
public class Main {

    public static void main(String[] args) {


        Book book = new Book("Bernard Dadier B", "Climbié", 3000, 10);

        System.out.println("==========Result author==============");

        System.out.println("Resultat du livre ");

        System.out.println("Author name : " + book.getName());

        System.out.println("Book title : " + book.getTitle());

        System.out.println("Book price : " + book.getPrice() +" FCFA");

        System.out.println("Book Quantity  : " + book.getQty() );

        System.out.println("==========Resultat author 2 ==============");

        System.out.println(book.toString());
    }

}
