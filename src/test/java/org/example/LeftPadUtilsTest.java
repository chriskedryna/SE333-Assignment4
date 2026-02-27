package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;

import static org.assertj.core.api.AssertionsForClassTypes.*;
import static org.junit.jupiter.api.Assertions.*;

class LeftPadUtilsTest {
    /* Partitions:
        str is null
        str is not null

        padStr is empty or null
        padStr is not empty or null

        pads <= 0
        pads > 0

        pads == padLen
        pads > padLen
        pads < padLen
     */
    @Test
    @Tag("Specification")
    void LeftPadUtilsTestIfStrNull() {
        assertNull(LeftPadUtils.leftPad(null, 1, "a"));
    }
    @Test
    @Tag("Specification")
    void LeftPadUtilsTestIfPadStrEmptyorNull() {
        assertThat(LeftPadUtils.leftPad("abc", 5, null)).isEqualTo("  abc");
        assertThat(LeftPadUtils.leftPad("def", 1, "")).isEqualTo("def");
    }
    @Test
    @Tag("Specification")
    void LeftPadUtilsTestIfPadsLessThanEqualToZero() {
        assertThat(LeftPadUtils.leftPad("abcde", 1, "o")).isEqualTo("abcde");
    }
    @Test
    @Tag("Specification")
    void LeftPadUtilsTestIfPadsGreaterThanZero() {
        assertThat(LeftPadUtils.leftPad("abcde", 7, "o")).isEqualTo("ooabcde");
    }
    @Test
    @Tag("Specification")
    void LeftPadUtilsTestIfPadsEqualsPadLen() {
        assertThat(LeftPadUtils.leftPad("abcde", 7, "ob")).isEqualTo("obabcde");
    }
    @Test
    @Tag("Specification")
    void LeftPadUtilsTestIfPadsGreaterThanPadLen() {
        assertThat(LeftPadUtils.leftPad("abcde", 7, "e")).isEqualTo("eeabcde");
    }
    @Test
    @Tag("Specification")
    void LeftPadUtilsTestIfPadsLessThanPadLen() {
        assertThat(LeftPadUtils.leftPad("lmnop", 6, "abcdef")).isEqualTo("almnop");
    }
}