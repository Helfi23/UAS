// Java program to insert a string into another string
// without using any pre-defined method
  
import java.lang.*;
  
class No3 {
  
    // Function to insert string
    public static String insertString(
        String originalString,
        String stringToBeInserted,
        int index)
    {
  
        // Create a new string
        String newString = new String();
  
        for (int i = 0; i < originalString.length(); i++) {
  
            // Insert the original string character
            // into the new string
            newString += originalString.charAt(i);
  
            if (i == index) {
  
                // Insert the string to be inserted
                // into the new string
                newString += stringToBeInserted;
            }
        }
  
        // return the modified String
        return newString;
    }
  
    // Driver code
    public static void main(String[] args)
    {
  
        // Get the Strings
        String originalString = "Saya Sedang belajar struktur data";
        String stringToBeInserted = "pergi ";
        int index = 11;
  
        System.out.println("Kalimat Asli: "
                           + originalString);
        System.out.println("kata tambahan : "
                           + stringToBeInserted);
        System.out.println("Masukan Di huruf ke :  "
                           + index);
  
        // Insert the String
        System.out.println("Kalimat Tambahan: "
                           + insertString(originalString,
                                          stringToBeInserted,
                                          index));
    }
}