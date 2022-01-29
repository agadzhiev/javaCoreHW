package ru.geekbrains.qa.java2.lesson2.Lesson5HW;

import java.io.*;
import java.lang.management.BufferPoolMXBean;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class AppData {

    private static final String RAZDELITEL = ";";

    public String[] header;
    public Integer[][] data;

    public void readFromFail(String s) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(s));
        ArrayList<Integer[]> rowsList = new ArrayList<>();
        header = (reader.readLine().split(RAZDELITEL));
        String line;
        while ((line = reader.readLine()) != null){
            String[] strArr = line.split(RAZDELITEL);
            Integer[] intArr = new Integer[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                intArr[i] = Integer.parseInt(strArr[i]);
            }
            rowsList.add(intArr);
        }
        data = rowsList.toArray(new Integer[][]{});

    }
    public void writeToCSV(String s) throws IOException {
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(s), StandardCharsets.UTF_8));

        StringBuffer line = new StringBuffer();
        for (int i = 0; i < header.length; i++) {
            line.append(header[i]);
            line.append(RAZDELITEL);
        }

        writer.write(line.toString());
        writer.newLine();

        for (int i = 0; i < data.length; i++) {
            Integer[] rowData = data[i];
            line.delete(0, line.length());

            for (int j = 0; j < rowData.length; j++) {
                line.append(rowData[j]);
                line.append(RAZDELITEL);
            }
        }
    }

    public String[] getHeader() {
        return header;
    }

    public Integer[][] getData() {
        return data;
    }


}
