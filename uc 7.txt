/**
 * OOPS Banner App - UC7
 * Store Character Pattern in a Class using Inner Static Class
 * Demonstrates Encapsulation, Modularity and Reusability
 */
public class BannerApp {

    /**
     * Inner Static Class that encapsulates
     * a character and its corresponding 7-line pattern.
     */
    public static class CharacterPatternMap {

        private final char character;
        private final String[] pattern;

        /**
         * Constructor to initialize character and pattern
         *
         * @param character Character to store
         * @param pattern   7-line banner pattern of the character
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Returns the character
         *
         * @return stored character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Returns the banner pattern
         *
         * @return 7-line pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to get character pattern
     *
     * @param ch target character
     * @param patterns array of CharacterPatternMap objects
     * @return pattern of the character or null if not found
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] patterns) {
        for (CharacterPatternMap cp : patterns) {
            if (cp.getCharacter() == ch) {
                return cp.getPattern();
            }
        }
        return null;
    }

    /**
     * Displays the word in banner format
     *
     * @param word word to print
     * @param patterns character pattern mappings
     */
    public static void printBanner(String word, CharacterPatternMap[] patterns) {

        StringBuilder[] bannerLines = new StringBuilder[7];

        // Initialize 7 rows
        for (int i = 0; i < 7; i++) {
            bannerLines[i] = new StringBuilder();
        }

        // Build banner row by row
        for (char ch : word.toCharArray()) {

            String[] pattern = getCharacterPattern(ch, patterns);

            if (pattern != null) {
                for (int i = 0; i < 7; i++) {
                    bannerLines[i].append(pattern[i]).append("  ");
                }
            }
        }

        // Print banner
        for (StringBuilder line : bannerLines) {
            System.out.println(line);
        }
    }

    /**
     * Main Method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {

        // Pattern for O
        String[] patternO = {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };

        // Pattern for P
        String[] patternP = {
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        };

        // Pattern for S
        String[] patternS = {
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        };

        // Create array of CharacterPatternMap objects
        CharacterPatternMap[] patterns = {
                new CharacterPatternMap('O', patternO),
                new CharacterPatternMap('P', patternP),
                new CharacterPatternMap('S', patternS)
        };

        // Print OOPS Banner
        printBanner("OOPS", patterns);
    }
}