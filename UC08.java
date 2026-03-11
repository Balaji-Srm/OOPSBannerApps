
import java.util.HashMap;
import java.util.Map;

/**
 * OOPS Banner App - UC8
 * Using HashMap Collection to store and retrieve
 * character banner patterns efficiently.
 */
public class BannerApp {

    /**
     * Builds and returns a HashMap of character patterns.
     *
     * @return Map of Character and its 7-line banner pattern
     */
    public static Map<Character, String[]> buildCharacterPatterns() {

        Map<Character, String[]> patternMap = new HashMap<>();

        // Pattern for O
        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        // Pattern for P
        patternMap.put('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        // Pattern for S
        patternMap.put('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        return patternMap;
    }

    /**
     * Renders the banner word using stored patterns.
     *
     * @param message Word to display
     * @param patternMap Map containing character patterns
     */
    public static void renderBanner(String message, Map<Character, String[]> patternMap) {

        // Loop through 7 rows
        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            // Loop through each character
            for (char ch : message.toCharArray()) {

                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    line.append(pattern[row]).append("  ");
                }
            }

            System.out.println(line);
        }
    }

    /**
     * Main Method
     */
    public static void main(String[] args) {

        // Step 1: Build pattern map
        Map<Character, String[]> patternMap = buildCharacterPatterns();

        // Step 2: Render OOPS banner
        renderBanner("OOPS", patternMap);
    }
}
