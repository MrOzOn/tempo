package com.cesarferreira.tempo

import org.junit.Test
import java.util.Calendar

/**
 * Unit test for [TimeInterval].
 */
class TimeIntervalTest {

    @Test
    fun ago() {
        val calendar = Calendar.getInstance()
        calendar.add(Calendar.DAY_OF_MONTH, -1)
        val yesterday = calendar.time
        assertEquals(expected = yesterday, actual = 1.days.ago)
    }

    @Test
    fun later() {
        val calendar = Calendar.getInstance()
        calendar.add(Calendar.YEAR, 5)
        val fiveYearsLater = calendar.time
        assertEquals(expected = fiveYearsLater, actual = 5.years.since)
    }
}
