/*
 * input class 사용자 값 입력 ui
 * 2020.05.15
 * version 1.0.0
 * 저작권 관련
 */

package edu.next.racing.ui;

import java.util.Scanner;

/**
 * 레이싱게임 입력 ui 클래스
 *
 * @version 1.0.0
 * @author GwangJunChoi
 */
public class InputView {

    public static final String CAR_INPUT_MESSAGE = "자동차 대수는 몇 대 인가요?";
    public static final String GAME_TIME_INPUT_MESSAGE = "시도할 회수는 몇 회 인가요?";
    private Scanner sc = new Scanner(System.in);

    public int displayCreateCarCountUi() {
        printString(CAR_INPUT_MESSAGE);
        return sc.nextInt();
    }

    public int displayGameTimeInputUi() {
        printString(GAME_TIME_INPUT_MESSAGE);
        return sc.nextInt();
    }

    private void printString(String message) {
        System.out.println(message);
    }

}