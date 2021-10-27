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
        final String[] delimiters = new String[] {"\\n"};

        ArrayList<String> delimiter_list = new ArrayList<>(Arrays.asList(delimiters));

        if (isDelimiterParams(input)){
            String delimiters_params = input.substring(2,input.indexOf("\\n"));
            String[] delimiters_arr = new String[] {delimiters_params};
            delimiter_list.addAll(Arrays.asList(delimiters_arr));
            input = input.replace(input.substring(0,input.indexOf("\\n")+2),"");
        }
        else
            delimiter_list.add(",");

        input = Utility.delimiterConverter(input, delimiter_list,"`");
        out.println(input);
        List<String> number_elements = Arrays.asList(input.split("`"));
        out.println(number_elements);
        int sum = Utility.sumOfListItem(number_elements);
        return sum;
    }
    static boolean isDelimiterParams(String str){
        return str.contains("//");
    }
}
