package example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * @author huisheng.jin
 * @date 2020/11/23.
 */
public class LeapYearTest {
    @Test
    void should_be_false_when_year_not_divisible_by_4() {
        assertThat(LeapYear.check(2017)).isEqualTo(false);
        assertThat(LeapYear.check(2019)).isEqualTo(false);
    }

    @Test
    void should_be_true_when_year_divisible_by_400() {
        assertThat(LeapYear.check(2000)).isEqualTo(true);
        assertThat(LeapYear.check(2400)).isEqualTo(true);
    }

    @Test
    void should_be_false_when_year_divisible_by_100_but_not_by_400() {
        assertThat(LeapYear.check(1700)).isEqualTo(false);
        assertThat(LeapYear.check(1800)).isEqualTo(false);
    }

    @Test
    void should_be_true_when_year_divisible_by_4_but_not_by_100() {
        assertThat(LeapYear.check(2008)).isEqualTo(true);
        assertThat(LeapYear.check(2012)).isEqualTo(true);
    }


}
