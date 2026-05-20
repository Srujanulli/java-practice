package basic;

public class Book {
        String title;
        String author;
        double price;

        Book(){
            this("Unknown","John",0);
        }
        Book(String title){
            this(title,"John",0);
        }
        Book(String title,String author,double price){
            this.title=title;
            this.author=author;
            this.price=price;
        }
        void displayBook(){
            System.out.print(title + "|" + author + "|" + price);
        }
        public static void main(String[] args){
            Book b1 = new Book("Right");
            Book b2 = new Book();
            Book b3 = new Book("Left","Ron",40);
            b1.displayBook();
            b2.displayBook();
            b3.displayBook();
        }
}
