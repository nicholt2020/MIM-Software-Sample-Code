package samplecode;

import java.util.ArrayList;
import java.util.Collections;

public class SampleCode {
    public static void main(String[] args) {
        String[] listOfStrings = {"fuzzball", "blackjacks", "HELLO there", "hyphensAreReallyCool-", "lastOneForToday !"};
        int charactersInputTotal = 0;
        int charactersOutputTotal = 0;
        ArrayList<String> newStringLength = new ArrayList<String>(); 
        
        for(int x = 0; x < listOfStrings.length; x++){
            int originalStringLength = listOfStrings[x].length();
            
            if(originalStringLength % 4 == 0){
                charactersInputTotal = charactersInputTotal + listOfStrings[x].length();
                listOfStrings[x] = changeString.reverseString(listOfStrings[x]);
                charactersOutputTotal = charactersOutputTotal + listOfStrings[x].length();
                newStringLength.add(listOfStrings[x].length() + "");
            }
            else if(originalStringLength % 5 == 0){
                charactersInputTotal = charactersInputTotal + listOfStrings[x].length();
                listOfStrings[x] = changeString.truncateString(listOfStrings[x]);
                charactersOutputTotal = charactersOutputTotal + listOfStrings[x].length();
                newStringLength.add(listOfStrings[x].length() + "");
            }
            else if(listOfStrings[x].endsWith("-")){
                charactersInputTotal = charactersInputTotal + listOfStrings[x].length();
                listOfStrings[x] = changeString.removeHyphen(listOfStrings[x]) + listOfStrings[x + 1];
                charactersOutputTotal = charactersOutputTotal + listOfStrings[x].length();
                newStringLength.add(listOfStrings[x].length() + "");
            }
        }
        
        Collections.sort(newStringLength);
        int median = newStringLength.size()/2;
        String finalMedian;
        if(newStringLength.size() % 2 == 0){
            finalMedian = (newStringLength.get(median).length() +  newStringLength.get(median + 1).length())/2 + "";
        }
        else{
            finalMedian = newStringLength.get(median).length() + "";
        }
                
        System.out.println("Final Report: ");
        System.out.println("Total characters in the input: " + charactersInputTotal);
        System.out.println("Total characters in the output: " + charactersOutputTotal);
        System.out.println("Median length of all strings: " + finalMedian);
    }
    
}
