package ej2exahmisjun22;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class TestmyDate {

    @ParameterizedTest
    @CsvFileSource(files = "test/ej2exahmisjun22/testdata.csv", numLinesToSkip = 1)
    void testIsDateCorrect(int day, int month, int year, boolean expected) {
        myDate date = new myDate();
        boolean result = date.isDateCorrect(day, month, year);
        assertEquals(expected, result, 
            () -> String.format("Failed for input: day=%d, month=%d, year=%d", day, month, year));
    }
}