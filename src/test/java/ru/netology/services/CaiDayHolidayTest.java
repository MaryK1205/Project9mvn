package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/*import ru.netology.services.CaiDayHoliday;*/

public class CaiDayHolidayTest {
    @Test
    public void test() {
        CaiDayHoliday service = new CaiDayHoliday();

        int expected = 3;
        int actual = service.calculate(10000, 3000, 20000);

        Assertions.assertEquals(expected, actual);
    }
    @Test
        public void test1() {
            CaiDayHoliday service = new CaiDayHoliday();

            int expected = 2;
            int actual = service.calculate(100000, 60000, 150000);

            Assertions.assertEquals(expected, actual);

        }

    }
