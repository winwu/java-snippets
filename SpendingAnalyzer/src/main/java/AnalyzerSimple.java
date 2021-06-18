import java.io.IOException;

public class AnalyzerSimple {
    public static void main(final String... args) throws IOException {
        final String fileName = args[0];
        final Analyzer analyzer = new Analyzer();
        analyzer.analyze(fileName);
    }
}
