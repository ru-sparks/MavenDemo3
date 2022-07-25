package com.sparkco;
import java.util.List;

 public class Main {
    public static void main(String[] args){

        DataHelper dataHelper = new DataHelper();
        List<Book> books = dataHelper.readBooks();


        for (var book : books) {
            System.out.println(book);

        }

    }
}

