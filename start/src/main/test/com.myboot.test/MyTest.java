package com.myboot.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by yaoyao on 2016/12/2.
 */
public class MyTest {
    public static void main(String[] args) throws IOException {
        File file =new File("C:\\Users\\yaoyao\\Desktop\\test.txt");
        String data = "3333";
        //if file doesnt exists, then create it
        if(!file.exists()){
            file.createNewFile();
        }

        //true = append file
//        FileWriter fileWritter = new FileWriter(file.getName(),true);
//        BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
//        bufferWritter.write(data);
//        bufferWritter.close();

        FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.newLine();
        bw.write(data);

        bw.close();
    }
}
