package org.littlewings.jackson.csv;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvParser;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.junit.jupiter.api.Test;

public class JacksonCsvReadTest {
    @Test
    public void readNormalCsvWithoutHeaderAsStringArray() throws IOException {
        CsvMapper mapper = new CsvMapper();
        CsvSchema schema =
                CsvSchema
                        .emptySchema()
                        .withColumnSeparator(',')  // default
                        .withQuoteChar('"')   // default
                        .withEscapeChar('\\');

        mapper.enable(CsvParser.Feature.WRAP_AS_ARRAY);

        try (BufferedReader reader = Files.newBufferedReader(Paths.get("src/test/resources/books_normal.csv"), StandardCharsets.UTF_8)) {
            MappingIterator<String[]> iterator =
                    mapper
                            .readerFor(String[].class)
                            .with(schema)
                            .readValues(reader);

            while (iterator.hasNext()) {
                System.out.println(Arrays.stream(iterator.next()).collect(Collectors.joining(", ")));
            }
        }
    }
}
