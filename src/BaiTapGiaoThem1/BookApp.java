package BaiTapGiaoThem1;

import java.util.Scanner;

public class BookApp {
    public static void main(String[] args) {
        ProgrammingBook book1 = new ProgrammingBook(1000, "Java Island", 299000, "Azom Koner", "Khmer", "Java");
        ProgrammingBook book2 = new ProgrammingBook(1001, "Vitamin C", 499000, "Doctor Zero", "H'mong", "C#");
        ProgrammingBook book3 = new ProgrammingBook(1002, "Apple is dying", 1999000, "Steve Goodjob", "Indian", "Linux");
        ProgrammingBook book4 = new ProgrammingBook(1003, "Windows always broken down", 1499000, "Bill Golden Gate", "Hindu", "Windows");
        ProgrammingBook book5 = new ProgrammingBook(1004, "Spy on internet", 239000, "Jame Bond", "Laos", "Hacker");
        FictionBook book6 = new FictionBook(1005, "Love never true", 19000, "Venus", "Romantic");
        FictionBook book7 = new FictionBook(1006, "A chicken corpses", 999000, "Arthur Conan Doyle", "Detective");
        FictionBook book8 = new FictionBook(1007, "Koran", 29000, "Mohammad Allah", "Holy book");
        FictionBook book9 = new FictionBook(1008, "Gone the Dead End", 3999000, "Sanji Vinsmoke", "Cook");
        FictionBook book10 = new FictionBook(1009, "Aladin and a holy cylinder", 699000, "1001 nights", "Funny tale");
        Scanner scan = new Scanner(System.in);
        Book[] books = {book1, book2, book3, book4, book5, book6, book7, book8, book9, book10};
        ProgrammingBook[] book1s = {book1, book2, book3, book4, book5};
        FictionBook[] book2s = {book6, book7, book8, book9, book10};
        System.out.println("Enter a Name of book :");
        String word = scan.nextLine();
        for (Book book : books) {
            if (book.getName().contains(word)) {
                System.out.println(book.toString());
            }
        }

    }

}
