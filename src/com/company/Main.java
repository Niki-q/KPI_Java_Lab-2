package com.company;

import java.util.*;
import static java.lang.System.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        String choise;
        do {
            Utility.printDelimiter(0);
            String input_line = Utility.inputString("Enter value: ");
            out.println(add(input_line));
            choise = Utility.inputString("Reset task ? (YES - y, No - any symbol): ");
        }
        while (Objects.equals(choise, "y"));
    }
    static int add(String input){
        final String delimiter = ",";
        List<String> number_elements = Arrays.asList(input.split(delimiter));
        out.println(number_elements);
        int sum = Utility.sumOfListItem(number_elements);
        return sum;
    }
}
