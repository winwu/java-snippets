import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.logging.Logger;

import com.google.gson.*;

public class Analyzer {
    private static final String RESOURCES = "SpendingAnalyzer/src/main/resources/";
    private static Logger log = Logger.getLogger(String.valueOf(Analyzer.class));

    public void analyze(final String fileName) throws IOException {
        final Path path = Paths.get(RESOURCES + fileName);

        System.out.println("-----------parse JSON --------------");
        Gson gson = new GsonBuilder().registerTypeAdapter(LocalDate.class, new JsonDeserializer<LocalDate>() {
            @Override
            public LocalDate deserialize(JsonElement json, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
                return LocalDate.parse(json.getAsString(), DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm"));
            }
        }).create();

        Reader reader = Files.newBufferedReader(path);
        Transaction[] transactions = gson.fromJson(reader, Transaction[].class);
        // System.out.println(Arrays.toString(transactions));

        final TransactionProcessor processor = new TransactionProcessor(Arrays.asList(transactions));
        log.info("[JSON] Total expense is: " + processor.getTotalAmount());
        log.info("[JSON] Total expense of Feb is: " + processor.getTransactionByMonth(Month.FEBRUARY));
        log.info("[JSON] Total expense of online shopping is: " + processor.getTransactionByDesc("online shopping"));
    }
}
