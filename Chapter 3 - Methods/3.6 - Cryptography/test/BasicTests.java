import org.junit.*;

public class BasicTests {

    @Test
    public void testCreateCypher() {
        System.out.println("Testing createCypher method...");

        // first off, if we don't shift the alphabet, it shouldn't change!
        int n = 0;
        String expectedSolution = Cryptography.ALPHABET;
        assert(expectedSolution.equals(Cryptography.createCypher(n))) : "Testing createCypher with n = 0";

        // test the examples from out handout
        n = 1;
        expectedSolution = "zabcdefghijklmnopqrstuvwxy";
        assert(expectedSolution.equals(Cryptography.createCypher(n))) : "Testing createCypher with n = 1";

        n = 4;
        expectedSolution = "wxyzabcdefghijklmnopqrstuv";
        assert(expectedSolution.equals(Cryptography.createCypher(n))) : "Testing createCypher with n = 4";
        
        n = 25;
        expectedSolution = "bcdefghijklmnopqrstuvwxyza";
        assert(expectedSolution.equals(Cryptography.createCypher(n))) : "Testing createCypher with n = 25";

        System.out.println("Fantastic! All tests passed!");
    }

    @Test
    public void testEncryptChar() {
        System.out.println("Testing encryptChar method...");

        // create a short cypher with letters shifted by 1
        String cypher = "bcd";
        assert(Cryptography.encryptChar(cypher, 'a') == 'b') : "Testing encryptChar shifted by 1 letter from a";
        assert(Cryptography.encryptChar(cypher, 'b') == 'c') : "Testing encryptChar shifted by 1 letter from b";
        assert(Cryptography.encryptChar(cypher, 'c') == 'd') : "Testing encryptChar shifted by 1 letter from c";

        // now test a new cypher shifted by 4
        cypher = "efg";
        assert(Cryptography.encryptChar(cypher, 'a') == 'e') : "Testing encryptChar shifted by 4 letters from a";
        assert(Cryptography.encryptChar(cypher, 'b') == 'f') : "Testing encryptChar shifted by 4 letters from b";
        assert(Cryptography.encryptChar(cypher, 'c') == 'g') : "Testing encryptChar shifted by 4 letters from c";  
        
        // lastly, test a cypher shifted by 24 (so letters wrap around!)
        cypher = "yza";
        assert(Cryptography.encryptChar(cypher, 'a') == 'y') : "Testing encryptChar shifted by 24 letters from a";
        assert(Cryptography.encryptChar(cypher, 'b') == 'z') : "Testing encryptChar shifted by 24 letters from b";
        assert(Cryptography.encryptChar(cypher, 'c') == 'a') : "Testing encryptChar shifted by 24 letters from c";

        System.out.println("Phenomenal! All tests passed!");
    }

    @Test
    public void testEncryptString() {
        System.out.println("Testing encryptString method...");

        // for this one, we'll try a clever idea: if we encrypt the alphabet using our cypher,
        // we should get back our cypher!

        // for ease of reading, we'll use a shortened version of our alphabet and cyphers here
        String shortAlphabet = "abcdefghij";

        // create a short cypher with letters shifted by 1
        String cypher = "bcdefghija";
        assert(Cryptography.encryptString(cypher, shortAlphabet).equals(cypher)) : "Testing encryptString shifted by 1 letter";
        
        // now test a new cypher shifted by 4
        cypher = "efghijabcd";
        assert(Cryptography.encryptString(cypher, shortAlphabet).equals(cypher)) : "Testing encryptString shifted by 4 letters";
        
        // lastly, test a cypher shifted by 9 (so letters wrap around!)
        cypher = "jabcdefghi";
        assert(Cryptography.encryptString(cypher, shortAlphabet).equals(cypher)) : "Testing encryptString shifted by 9 letters";

        System.out.println("Tremendous! All tests passed!");
    }

    @Test
    public void testDecryptChar() {
        System.out.println("Testing decryptChar method...");

        // decryption is just the opposite of encryption, so we can take our
        // tests for encryptChar and swap around the input and output letters!

        // create a short cypher with letters shifted by 1
        String cypher = "bcd";
        assert(Cryptography.decryptChar(cypher, 'b') == 'a') : "Testing encryption shifted by 1 letter from a";
        assert(Cryptography.decryptChar(cypher, 'c') == 'b') : "Testing encryption shifted by 1 letter from b";
        assert(Cryptography.decryptChar(cypher, 'd') == 'c') : "Testing encryption shifted by 1 letter from c";

        // now test a new cypher shifted by 4
        cypher = "efg";
        assert(Cryptography.decryptChar(cypher, 'e') == 'a') : "Testing encryption shifted by 4 letters from a";
        assert(Cryptography.decryptChar(cypher, 'f') == 'b') : "Testing encryption shifted by 4 letters from b";
        assert(Cryptography.decryptChar(cypher, 'g') == 'c') : "Testing encryption shifted by 4 letters from c";  
        
        // lastly, test a cypher shifted by 24 (so letters wrap around!)
        cypher = "yza";
        assert(Cryptography.decryptChar(cypher, 'y') == 'a') : "Testing encryption shifted by 24 letters from a";
        assert(Cryptography.decryptChar(cypher, 'z') == 'b') : "Testing encryption shifted by 24 letters from b";
        assert(Cryptography.decryptChar(cypher, 'a') == 'c') : "Testing encryption shifted by 24 letters from c";

        System.out.println("Astounding! All tests passed!");
    }

    @Test
    public void testDecryptString() {
        System.out.println("Testing decryptString method...");

        // decryption is just the opposite of encryption, so we can take our
        // tests for encryptString and swap around the input and output! That is,
        // if we decrypt the cypher with itself, we should get back the original alphabet!

        // for ease of reading, we'll use a shortened version of our alphabet and cyphers here
        String shortAlphabet = "abcdefghij";

        // create a short cypher with letters shifted by 1
        String cypher = "bcdefghija";
        assert(Cryptography.decryptString(cypher, cypher).equals(shortAlphabet)) : "Testing encryptString shifted by 1 letter";
    
        // now test a new cypher shifted by 4
        cypher = "efghijabcd";
        assert(Cryptography.decryptString(cypher, cypher).equals(shortAlphabet)) : "Testing encryptString shifted by 4 letters";
        
        // lastly, test a cypher shifted by 9 (so letters wrap around!)
        cypher = "jabcdefghi";
        assert(Cryptography.decryptString(cypher, cypher).equals(shortAlphabet)) : "Testing encryptString shifted by 9 letters";

        System.out.println("Splendid! All tests passed!");
    }
}
