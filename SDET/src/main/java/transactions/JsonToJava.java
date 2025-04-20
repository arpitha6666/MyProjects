package main.java.transactions;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JsonToJava {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        CustomerDetailsAppium cs =
                mapper.readValue(System.getProperty("user.dir")+"\\CustomerDetails0.json", CustomerDetailsAppium.class);
        System.out.println(cs.getStudentName());
    }
}
