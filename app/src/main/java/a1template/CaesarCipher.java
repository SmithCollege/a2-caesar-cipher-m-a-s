// Do not change the line below. It lets Gradle find your 
// Classes to build the project
package a1template;
import java.util.Scanner;

public class CaesarCipher {

    /** Character array to store the letters in the alphabet in order */
    Character[] alphabet;

    /** DynamicArray object providing ArrayList-like operations for Characters */
    DynamicArray<Character> cipher;

    /** Private offset that tracks how many positions to shift the index for
    * This cipher */
    private int offset;

    /** Constructor that should define the instance variables, including
     * populating the alphabet
     * @param offset Offset to use when creating `cipher` of DynamicArray type
     */
    CaesarCipher(int offset){
      this.alphabet= new Character[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
      this.offset=offset;
      this.cipher=new DynamicArray(offset,alphabet);
      
        
    }

    /** Implementation of linear search that looks through the alphabet
     * array to identify the position of the passed value
     * @param val character to search for
     * @return int indicating position of val in the alphabet array
     */
    public int findIndex(char val){
        // This is a stub -- fill in the code and return the
        // value you calculate
        int i=0;
        int index=0;
        while(val!=alphabet[i]){
            i++;
            index++;
        }
        return index;
    }

    /** Encode a message using the cipher
     * @param T message to encode
     * @return encoded message */  
    public String encode(String message){
        String encodedMessage="";
        Scanner scanner = new Scanner(message);
        scanner.useDelimiter("");
        char letter;
        int i=0;
        Character [] messageArray= new Character[message.length()];
        
        while (scanner.hasNext()){
            letter=scanner.next().charAt(0);
            messageArray[i]=letter;
            i++;
        }
        scanner.close();
        int y=0;
        int index=0;
        while(y<messageArray.length){
            index=this.findIndex(messageArray[y]);
            encodedMessage+=cipher.get(index);
            y++;
        }
        return encodedMessage; 
     }

    /** Decode a message using the cipher 
     * @param String message to decode
     * @param int key to use in decoding
     * @return decoded message
    */
    public String decode(String message){
        // Fill in here and update return statement based on your code
        return "new String()";
    }
    ///I WROTE THIS in order for tests to work but don't believe this to be necessary 
    public char get(int index){
        return alphabet[index];
    }

    public static void main(String[] args) {
    }
    
}
