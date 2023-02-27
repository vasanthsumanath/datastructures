package anagram;

public class ValidAnagramMain {
    public static void main(String[] args) {
        ValidAnagram validAnagram = new ValidAnagram();

        System.out.println(validAnagram.isAnagram("Vas","saV"));

        System.out.println(validAnagram.isAnagram("Vas","sav"));

        System.out.println(validAnagram.isAnagram("Vas","sa"));

    }
}
