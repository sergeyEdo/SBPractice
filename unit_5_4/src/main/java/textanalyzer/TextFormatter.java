package textanalyzer;

public final class TextFormatter {
    private TextFormatter() {}

    public static String leaveOnlyAlpha(String text){
        text = text.replaceAll( "[^\\p{IsAlphabetic}\\s]", ""); // убирает всё кроме букв (регулярное выражение)
        return text;
    }

    public static String[] splitBySpaces(String text){
        String[] words = text.split("\\s+"); // разбивает по НЕСКОЛЬКИМ и более пробелам (регулярное выражение)
        return words;
    }
}