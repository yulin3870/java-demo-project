package day04;

public class Demo04 {
    public void main(String[] args) {
        Cat cat = new Cat();
        Hunter h = cat;
        Runner r = cat;
        h.hunt();
    }
}

interface Runner {
    int DEFAULT_SPEED = 100;

    int maxSpeed();
}

interface Hunter extends Runner {
    void hunt();
}

interface Tetris {
    void softDropAction();

    void hardDropAction();

    void moveLeftAction();

    void m6oveRightAction();

    void rotateRightAction();

    void startAction();

    void pauseAction();

    void continueAction();

    void gameOverAction();
}

class Cat implements Hunter, Runner {
    public void hunt() {
        System.out.println("阿阿" + maxSpeed());
    }

    public int maxSpeed() {
        return DEFAULT_SPEED;
    }
}