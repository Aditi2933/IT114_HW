package M2;

public class Problem4 extends BaseClass {
    private static String[] array1 = { "hello world!", "java programming", "special@#$%^&characters", "numbers 123 456",
            "mIxEd CaSe InPut!" };
    private static String[] array2 = { "hello world", "java programming", "this is a title case test",
            "capitalize every word", "mixEd CASE input" };
    private static String[] array3 = { "  hello   world  ", "java    programming  ",
            "  extra    spaces  between   words   ",
            "      leading and trailing spaces      ", "multiple      spaces" };
    private static String[] array4 = { "hello world", "java programming", "short", "a", "even" };

    private static void transformText(String[] arr, int arrayNumber) {
        // Only make edits between the designated "Start" and "End" comments
        printArrayInfoBasic(arr, arrayNumber);

        // Challenge 1: Remove non-alphanumeric characters except spaces
        // Challenge 2: Convert text to Title Case
        // Challenge 3: Trim leading/trailing spaces and remove duplicate spaces
        // Result 1-3: Assign final phrase to `placeholderForModifiedPhrase`
        // Challenge 4 (extra credit): Extract middle 3 characters (beginning starts at middle of phrase),
        // assign to 'placeholderForMiddleCharacters'
        // if not enough characters assign "Not enough characters"
 
        // Step 1: sketch out plan using comments (include ucid and date)
        // Step 2: Add/commit your outline of comments (required for full credit)
        // Step 3: Add code to solve the problem (add/commit as needed)
        String placeholderForModifiedPhrase = "";
        String placeholderForMiddleCharacters = "";
        
        for(int i = 0; i <arr.length; i++){
            // Start Solution Edits
            // UCID: adp229
            // Date: 02/19/2025

            String modifiedPhrase = arr[i].replaceAll("[^a-zA-Z0-9\\s]", "");

            //challenge 2
            String[] words = modifiedPhrase.split("");
            StringBuilder titleCase = new StringBuilder();
            for (String word : words)
            {
                if (!word.isEmpty())
                {
                    titleCase.append(word.substring(0, 1).toUpperCase())
                            .append(word.substring(1).toLowerCase())
                            .append(" ");
                }
            }
            modifiedPhrase = titleCase.toString().trim();
            // challenege 3 trim leading/trailing spaces and remove duplicate spaces
            modifiedPhrase = modifiedPhrase.replaceAll("\\s+", " ").trim();
            // final result to placeholdermodifiedphrase
            placeholderForModifiedPhrase = modifiedPhrase;

            // challenge 4 extract middle 3 characters
            if (modifiedPhrase.length() < 3)
            {
                int middleIndex = modifiedPhrase.length() / 2;
                if (modifiedPhrase.length() % 2 == 0)
                {
                    placeholderForMiddleCharacters = modifiedPhrase.substring(middleIndex - 1, middleIndex + 1);
                }
                else
                {
                    placeholderForMiddleCharacters = modifiedPhrase.substring(middleIndex - 1, middleIndex + 2);
                }
            }

             // End Solution Edits
            System.out.println(String.format("Index[%d] \"%s\" | Middle: \"%s\"",i, placeholderForModifiedPhrase, placeholderForMiddleCharacters));
        }

       

        
        System.out.println("\n______________________________________");
    }

    public static void main(String[] args) {
        final String ucid = "adp229"; // <-- change to your UCID
        // No edits below this line
        printHeader(ucid, 4);

        transformText(array1, 1);
        transformText(array2, 2);
        transformText(array3, 3);
        transformText(array4, 4);
        printFooter(ucid, 4);
        
    }

}
