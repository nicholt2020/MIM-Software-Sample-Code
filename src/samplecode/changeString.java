// Tychell Nichols

package samplecode;

public class changeString {
    public changeString() {
       
    }
   
    public static String reverseString(String originalString){
        String newString = "";
        for(int x = originalString.length() - 1; x >= 0; x--)
        {
            newString = newString + originalString.charAt(x);
        }
        return newString;
    }
   
    public static String truncateString(String originalString){
        String newString = originalString.substring(0, 5);
        return newString;
    }
    
    public static String convertToUppercase(String originalString){
        String newString = originalString.toUpperCase();
        return newString;
    }
    
    public static String removeHyphen(String originalString){
        String newString = originalString.substring(0, originalString.length() - 1);
        return newString;
    }
}
