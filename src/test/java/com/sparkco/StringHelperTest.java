package com.sparkco;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class StringHelperTest {

    @Test
    void truncateAInFirst2Positions_NullString() {
        var stringHelper = new StringHelper();
        Assertions.assertThrows(IllegalArgumentException.class, () -> stringHelper.truncateAInFirst2Positions(null));
    }



    @Test
    void truncateAInFirst2Positions_EmptyString() {
        var stringHelper = new StringHelper();

        assertEquals("", stringHelper.truncateAInFirst2Positions(""));

    }


    @Test
    void truncateAInFirst2Positions_One_A() {
        var stringHelper = new StringHelper();
        assertEquals("", stringHelper.truncateAInFirst2Positions("A"));

    }

    @Test
    void truncateAInFirst2Positions_Two_As() {
        var stringHelper = new StringHelper();
        assertEquals("", stringHelper.truncateAInFirst2Positions("AA"));

    }
    @Test
    void truncateAInFirst2Positions_Two_As_ThenChar() {
        var stringHelper = new StringHelper();
        assertEquals("abc", stringHelper.truncateAInFirst2Positions("AAabc"));

    }

    @Test
    void areFirstAndLastTwoCharactersTheSame() {
    }
}