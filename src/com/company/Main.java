package com.company;

import java.util.*;
import static java.lang.System.*;
public class Main {

    public static void main(String[] args) {
        String main_choise;
        do {
            Utility.printDelimiter(0);
            String input_line = Utility.inputString("Enter value: ");
            out.println(add(input_line));
            main_choise = Utility.inputString("Reset task ? (YES - y, No - any symbol): ");
        }
        while (Objects.equals(main_choise, "y"));
    }
    static int add(String input){
        final String[] delimiters = new String[] {"\\n",","};
        final List<String> delimiter_list = Arrays.asList(delimiters);
        input = Utility.delimiterConverter(input, delimiter_list,"`");
        out.println(input);
        List<String> number_elements = Arrays.asList(input.split("`"));
        out.println(number_elements);
        int sum = Utility.sumOfListItem(number_elements);
        return sum;
    }
}
