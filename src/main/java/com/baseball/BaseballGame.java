package com.baseball;

import com.baseball.view.OutputView;

public class BaseballGame {

    private static final OutputView outputview = new OutputView();

    public void startGame() {
        init();
    }

    public void init() {
        outputview.printGameStart();
    }
}
