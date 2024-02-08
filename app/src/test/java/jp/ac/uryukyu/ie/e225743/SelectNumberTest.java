package jp.ac.uryukyu.ie.e225743;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SelectNumberTest {
    @Test
    void testGenerateRandomNumber() {
        SelectNumber selectNumber = new SelectNumber();
        String randomNumber = selectNumber.generateRandomNumber();
        // 生成された数字が3桁かどうかをテスト
        assertEquals(3, randomNumber.length());
    }

    @Test
    void testGenerateHint() {
        SelectNumber selectNumber = new SelectNumber();
        // テスト用のランダムな数字を生成
        String correctNumber = "123";
        selectNumber.setCorrectNumber(correctNumber);

        // 正解と同じ数字を推測した場合のテスト
        assertEquals("30", selectNumber.generateHint(123));

        // 一つの数字をヒット、一つの数字をボールとして推測した場合のテスト
        assertEquals("11", selectNumber.generateHint(135));

        // 全く一致しない数字を推測した場合のテスト
        assertEquals("00", selectNumber.generateHint(456));
    }
}
