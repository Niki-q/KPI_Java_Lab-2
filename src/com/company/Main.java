package com.company;

import java.util.*;
import static java.lang.System.*;
public class Main {

    public static void main(String[] args) throws NegativeException {
        String main_choise;
        do {
            Utility.printDelimiter(0);
            String input_line = Utility.inputString("Enter value: ");
            out.println(add(input_line));
            main_choise = Utility.inputString("Reset task ? (YES - y, No - any symbol): ");
        }
        while (Objects.equals(main_choise, "y"));
    }
    static int add(String input) throws NegativeException{
        final String[] delimiters = new String[] {"\\n"};

        ArrayList<String> delimiter_list = new ArrayList<>(Arrays.asList(delimiters));

        if (isDelimiterParams(input)){
            String delimiters_params = input.substring(2,input.indexOf("\\n"));
            delimiters_params = delimiters_params.substring(1,delimiters_params.length()-1);
            String[] delimiters_arr = delimiters_params.split("]\\[");
            delimiter_list.addAll(Arrays.asList(delimiters_arr));
            input = input.replace(input.substring(0,input.indexOf("\\n")+2),"");
        }
        else
            delimiter_list.add(",");

        input = Utility.delimiterConverter(input, delimiter_list,"`");
        out.println(input);
        List<String> number_elements = Arrays.asList(input.split("`"));
        out.println(number_elements);
            if (isHaveNegativeValues(number_elements))
                throw new NegativeException(negative_values.toString());
        number_elements = Utility.removeNumberBiggerThan(1000, number_elements);
        int sum = Utility.sumOfListItem(number_elements);
        return sum;
    }
    static boolean isDelimiterParams(String str){
        return str.contains("//");
    }
    static ArrayList<Integer> negative_values = new ArrayList<Integer>();
    static boolean isHaveNegativeValues(List<String> list){
        boolean A = false;
        for (int i = 0; i< list.size(); i++){
            try {
                if (Integer.parseInt(list.get(i)) < 0) {
                    A = true;
                    negative_values.add(Integer.parseInt(list.get(i)));
                }
            }catch (Exception ignored){};
        }
        return A;
    }
}