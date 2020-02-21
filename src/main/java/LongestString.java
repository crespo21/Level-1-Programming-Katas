
public class LongestString {


    public void getLongest(String[] array) {

        String str = "";


        int arrayLength = array[0].length();
        for (int i = 0; i < array.length; i++) {

            if (arrayLength < array[i].length()) {


                arrayLength = array[i].length();

                str = array[i];
            }
            System.out.println("");
        }
        System.out.println("Longest string is : " + str);

    }


    public static void main(String[] args) {

        String[] check = {"the", "quick", "brown", "fox", "ate",
                "my", "chickens"};
        LongestString longest = new LongestString();

        longest.getLongest(check);

    }
}
