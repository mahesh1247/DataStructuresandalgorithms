import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collectors;

public class SlidingWindowPattern {
    public static void main(String[] args) {
        String s = "abcdefefdbdbdb";
        int k = 3;

        findLagestSubString(s, k);
    }

    private static void findLagestSubString(String s, int k) {
        char[] charArray = s.toCharArray();
        int largestSubstringLength = 0;
        int leftIndex = 0;
        String substring = "";
        String trackingsubstring = "";
        Queue elements = new LinkedList();
        for (int currentPosition = 0; currentPosition < charArray.length; currentPosition++) {
            trackingsubstring = trackingsubstring+charArray[currentPosition];
            elements.add(charArray[currentPosition]);
            Set size = (Set) elements.stream().collect(Collectors.toSet());
            if(size.size()<=k){

                if(substring.length()<trackingsubstring.length()){
                    substring = trackingsubstring;
                    largestSubstringLength = substring.length();
                }
            }else{



                size = (Set) elements.stream().collect(Collectors.toSet());
                while(size.size()>k){
                    leftIndex = leftIndex +1;
                    elements.poll();
                    trackingsubstring = s.substring(leftIndex,currentPosition+1);
                    size = (Set) elements.stream().collect(Collectors.toSet());
                }

            }
        }
        System.out.println("Largest SubString Length ::-  " + largestSubstringLength);
        System.out.println("Largest SubString ----------- ::-  " + substring);
    }

    private static int getUniqueElement(int leftIndex, int currentPosition, char[] charArray) {
        Set uniQueElements = new HashSet();
        for (int i = leftIndex; i <= currentPosition; i++) {
            uniQueElements.add(charArray[i]);
        }
        return uniQueElements.size();
    }
}
