public class PigLatin {
    public static void main(String[] args){
        /**
        PigLatin.java
        Program to turn an english sentence into a piglatin sentence
 
        @author Alden Kruse
        Wheaton College, CSCI 235, Spring 2022
        Project 1
        Date 01/30/22
        */
        
        /*
        what a beautiful day = hatway aay eautifulbay ayday
        Step #1 - Find all the words and a method of being able to distinguish them
        Step #2 - Find the first letter of the word
        Step #3 - Move the found letter to the end of the word
        Step #4 - Add an AY to the end of the word
        Step #5 - Find the next word after the last word
        Step #6 - Loop until the all the words have been printed
        */
        String s = "what a beautiful day"; // Word entered by user
        
        String space = " "; // Character to split the words

        int start = 0;
        int end;
        end = s.indexOf(space, start);

        while(end != -1){
            String word = s.substring(start, end); // starts at the beginning and ends at the next space
            System.out.print(word.substring(1) + word.substring(0, 1) + "ay" + " "); // prints word without the first letter + first letter + ay
            start = end + 1; // changes the start index to the ending of the last word
            end = s.indexOf(space, start); // sets the end to the next space 
        }

        String word = s.substring(start); // adds the final word
        System.out.print(word.substring(1) + word.substring(0, 1) + "ay" + " "); // prints the final word
    }
}
