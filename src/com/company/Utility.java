package com.company;

import java.util.List;
import java.util.Scanner;

public class Utility {
    static String inputString(String message){
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        String str = in.nextLine();
        return str;
    }
    static char inputChar(String message){
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        char str = in.nextLine().charAt(0);;
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
            for (int i = 0; i<= list.size(); i++){
                sum += Integer.parseInt(list.get(i));
            }
        }catch (Exception ignored){};
        return sum;
    }
}
