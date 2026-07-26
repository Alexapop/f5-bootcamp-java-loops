package com;

import com.ioana.MultiplicationTable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicationTableTest {
    @ParameterizedTest
    @ValueSource(ints = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 })
    void testMultiplication(int i) {
        int givenNumber = 5;
        MultiplicationTable table = new MultiplicationTable(givenNumber);
        assertEquals(givenNumber * i, table.multiply(i));
    }

    @Test
    void testCreateTable() {
        MultiplicationTable table = new MultiplicationTable(5);
        assertDoesNotThrow(table::createTable);
    }
}
