package textanalyzer;

import java.io.*;
import java.util.Map;

public class TextAnalyzer {

    public boolean processTextFile(String filePath){
        this.filePath = filePath;

        String text;
        try {
            text = readFile();
        } catch (IOException e) {
            System.out.println("Указан неверный файл");
            return false;
        }

        text = TextFormatter.leaveOnlyAlpha(text).toLowerCase();
        String[] words = TextFormatter.splitBySpaces(text);
        Map<String, Integer> words_map = WordCounter.countWords(words);
        ReportGenerator.makeUnorderedReport(words_map);

        return true;
    }

    private String readFile() throws IOException {
        try (InputStreamReader reader = new InputStreamReader(new FileInputStream(filePath), "UTF-8")) {
            StringBuilder content = new StringBuilder();
            int character;
            while ((character = reader.read()) != -1) {
                content.append((char) character);
            }
            return content.toString();
        }
    }

    private String filePath;

    public static void main(String[] args) {
        TextAnalyzer ta = new TextAnalyzer();
        ta.processTextFile("C:\\Users\\serge\\IdeaProjects\\SBPractice\\unit_5_4\\src\\main\\resources\\ruslan&ludmilla.txt");
    }
}