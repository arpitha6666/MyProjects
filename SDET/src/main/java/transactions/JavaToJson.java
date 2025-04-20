package main.java.transactions;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.apache.commons.lang3.StringEscapeUtils;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class JavaToJson {
    public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
        // TODO Auto-generated method stub
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        Connection conn=null;
//        ArrayList<CustomerDetails> a=new ArrayList<CustomerDetails>();
//
//        conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Business", "root", "root");
//
////object of statement class will help us to execute queries
//        Statement st=conn.createStatement();
//        ResultSet rs=st.executeQuery("select * from CustomerInfo where location = 'Asia' and purchasedDate=curdate();");
//        while(rs.next())
//        {
//            CustomerDetails c=new CustomerDetails();
//            //3 different json files, 3 diff java objects
//            c.setCourseName(rs.getString(1));
//            c.setPurchasedDate(rs.getString(2));
//            c.setAmount(rs.getInt(3));
//            c.setLocation(rs.getString(4));
//            a.add(c);
//        }

        CustomerDetails c1 = new CustomerDetails();
        c1.setCourseName("Selenium");
        c1.setAmount(120);
        c1.setPurchasedDate(String.valueOf(new Date()));
        c1.setLocation("Asia");

        CustomerDetails c2 = new CustomerDetails();
        c2.setCourseName("Protractor");
        c2.setAmount(1120);
        c2.setPurchasedDate(String.valueOf(new Date()));
        c2.setLocation("Asia");

        CustomerDetails c3 = new CustomerDetails();
        c3.setCourseName("Appium");
        c3.setAmount(1000);
        c3.setPurchasedDate(String.valueOf(new Date()));
        c3.setLocation("Asia");


        ArrayList<CustomerDetails> arr = new ArrayList<>();
        arr.add(c1);
        arr.add(c2);
        arr.add(c3);
        for (int i = 0; i < arr.size(); i++) {
            ObjectMapper o = new ObjectMapper();
            o.writeValue(new File(System.getProperty("user.dir") + "//CustomerDetails" + i + ".json"), arr.get(i));
        }

        Gson gson = new Gson();
        JsonArray jsonArr = new JsonArray();
        JsonObject obj = new JsonObject();
        jsonArr.add(gson.toJson(c1));
        jsonArr.add(gson.toJson(c1));
        jsonArr.add(gson.toJson(c1));

        obj.add("data", jsonArr);
        System.out.println(obj);

        String finalString =StringEscapeUtils.unescapeJava(obj.toString())
                .replace("\"{","{")
                .replace("}\"","}");

        System.out.println(finalString);
        try(FileWriter fr = new FileWriter(System.getProperty("user.dir")+"//NestedJson.json")){
            fr.write(finalString);
        }
    }
}
