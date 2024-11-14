public class Main {
    public static void main(String[] args) {
        String text1 = "hello";
        String text2 = "HELLO";
        String text3 = "java programming";
        System.out.println(formatText("hello"));
        System.out.println(formatText("HELLO", false));
        System.out.println(formatText(text3, 0, 4));

    }

    static String formatText(String text) {
        return text.toUpperCase();

    }

    static String formatText(String text, boolean toUpperCase) {
        if (toUpperCase) {
            return text.toUpperCase();
        } else {
            return text.toLowerCase();

        }
    }

        static String formatText (String text, int start, int end){
            return text.substring(start, end).toUpperCase();
        }

    }

