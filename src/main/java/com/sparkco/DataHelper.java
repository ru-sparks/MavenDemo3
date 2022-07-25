package com.sparkco;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.TypeFactory;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DataHelper {
    List<Book> readBooks() {
        List<Book> books = new ArrayList<>();

        try {
            // create object mapper instance
            ObjectMapper mapper = new ObjectMapper();

            InputStream inputStream = getResourceStream("/data/books.json");

            // convert JSON string to Book object
            CollectionType typeReference =
                    TypeFactory.defaultInstance().constructCollectionType(List.class, Book.class);

            books = mapper.readValue(inputStream, typeReference);



        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return books;
    }
    private InputStream getResourceStream(String name) {

        URL url = getClass().getResource(name);
        System.out.println("url: " + url);
        InputStream inputStream = null;
        try {
            inputStream  = url.openStream();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return inputStream;

    }
}
