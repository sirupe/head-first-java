package chapter2.game;

import java.io.IOException;

public class GuessGame {
    static final int MAX_PLAYER = 3;
    
    Player [] players;
    boolean [] playerIsRight;
    int targetNumber;
    
    public void startGame() {
        initGame();
        playGame();
        endGame();
    }
    
    private void initGame() {
        players = new Player[MAX_PLAYER];
    
        for (int i = 0; i < MAX_PLAYER; i++) {
            players[i] = new Player();
        }
        
        playerIsRight = new boolean[] {false, false, false};
        targetNumber = (int) (Math.random() * 10);
    }
    
    private void playGame() {
        System.out.println("0 이상 9 이하의 숫자를 맞춰보세요");
    
        while (true) {
            System.out.println("맞춰야 할 숫자는 " + targetNumber + " 입니다.");
        
            for (int i = 0; i < MAX_PLAYER; i++) {
                players[i].guess();
                System.out.println((i + 1) + "번 선수가 찍은 숫자: " + players[i].number);
                if (players[i].number == targetNumber) {
                    playerIsRight[i] = true;
                }
            }
        
            if (playerIsRight[0] || playerIsRight[1] || playerIsRight[2]) {
                break;
            } else {
                System.out.println("다시 시도해야 합니다.");
            }
        }
    }
    
    private void endGame() {
        System.out.println("맞춘 선수가 있습니다.");
        for (int i = 0; i < MAX_PLAYER; i++) {
            System.out.println((i + 1) + "번 선수: " + playerIsRight[i]);
        }
        System.out.println("게임 끝.");
    }
}
