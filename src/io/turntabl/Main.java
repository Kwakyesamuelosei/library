package io.turntabl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Borrow> borrowers = Arrays.asList(
                new Borrow("Doreen",BorrowType.CHILDREN,"12-12-2017",001),
                new Borrow("Ama",BorrowType.GOLD,"12-09-2014",002),
                new Borrow("Kate",BorrowType.PREMIUM,"12-02-2016",003),
                new Borrow("Angie",BorrowType.REGULAR,"12-12-2017",004),
                new Borrow("Yaa",BorrowType.PREMIUM,"17-07-2016",005),
                new Borrow("Kofi",BorrowType.CHILDREN,"14-12-2007",006),
                new Borrow("Keziah",BorrowType.GOLD,"31-12-2015",007),
                new Borrow("Akos",BorrowType.REGULAR,"23-12-2013",010),
                new Borrow("Kwame",BorrowType.GOLD,"18-12-2009",130),
                new Borrow("Padmore",BorrowType.CHILDREN,"23-10-2019",450),
                new Borrow("Obosu",BorrowType.PREMIUM,"28-05-2019",066),
                new Borrow("David",BorrowType.GOLD,"15-12-2008",045),
                new Borrow("John",BorrowType.CHILDREN,"16-11-2017",007),
                new Borrow("Adwoa",BorrowType.REGULAR,"14-09-2003",066),
                new Borrow("Dane",BorrowType.PREMIUM,"12-10-2008",034),
                new Borrow("Esi",BorrowType.CHILDREN,"03-12-2016",056)
        );

        List<Borrow> borrowerType = new ArrayList<>();
        for (Borrow borrow : borrowers){
            if (borrow.getBorrowType() == BorrowType.PREMIUM){
                borrowerType.add(borrow);
            }
        }

        printTotalPremiumBorrowers(borrowerType);

        List<String> borrowerNames = new ArrayList<>();

        for (Borrow borrowerName : borrowerType){
            borrowerNames.add(borrowerName.getName());
        }

        printPremiumBorrowerNames(borrowerNames);

        List<Book> books = Arrays.asList(
            new Book("Wild Dream",001,Category.FICTION,State.AVAILABLE),
            new Book("Dream Big",002,Category.ADVENTURE,State.BORROWED),
            new Book("GOT",003,Category.COMIC,State.LOST),
            new Book("In the Chest of a Woman",010,Category.COMIC,State.BORROWED),
            new Book("Husband Diary",006,Category.COMIC,State.LOST),
            new Book("Toast of Life",004,Category.HISTORIC,State.AVAILABLE),
            new Book("Confidence",005,Category.ROMANTIC,State.LOST)
        );

        List<Book> BookType = new ArrayList<>();
        for (Book book : books){
            if (book.getCategory() == Category.COMIC){
                BookType.add(book);
            }
        }

        List<String> bookNames = new ArrayList<>();
        for (Book book : BookType){
            bookNames.add(book.getTitle());
        }

        printComicBooks(bookNames);

    }

    private static void printComicBooks(List<String> bookNames) {
        System.out.println("Comic Book Names: " + bookNames);
    }

    private static void printPremiumBorrowerNames(List<String> borrowerNames) {
        System.out.println("Premium Borrower Names: " + borrowerNames);
    }

    private static void printTotalPremiumBorrowers(List<Borrow> borrowerType) {
        System.out.println("Total Premium Borrowers: " + borrowerType.size());
    }

}
