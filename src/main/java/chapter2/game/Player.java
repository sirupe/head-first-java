package chapter2.game;

public class Player {
    public int number;
    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("찍은 숫자 : " + number);
    }
}
