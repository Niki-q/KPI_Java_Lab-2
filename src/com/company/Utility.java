package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utility {
    static String inputString(String message){
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        String str = in.nextLine();
        return str;
    }
    static void printDelimiter(int format){
        if (format == 1)
            System.out.println("__________");
        else if (format==0)
            System.out.println("__________\n");
    }
    static int sumOfListItem(List<String> list){
        int sum = 0;
        try {
            for (int i = 0; i< list.size(); i++){
                sum += Integer.parseInt(list.get(i));
            }
        }catch (Exception ignored){};
        return sum;
    }
    static String delimiterConverter(String str, List<String> list, String general_delimiter){
        for (int i = 0; i< list.size(); i++) {
            str = str.replace(list.get(i), general_delimiter);
        }
        return str;
    }
    static List<String> removeNumberBiggerThan(int than, List<String> list){
        ArrayList arrlist = new ArrayList(list);
        for (int i = 0; i< list.size(); i++) {
            if (Integer.parseInt(list.get(i)) > than)
                arrlist.remove(list.indexOf(list.get(i)));
        }
        list = arrlist.stream().toList();
        return list;
    }
}
