package inner_anonym_local_and_nested_classes.anonymous.anonym08;

/**
 * Created by WORK_WERT on 19.01.2017.
 */

// игра
interface Game {
    boolean move();
}

// фабрика игр
interface GameFactory {
    Game getGame();
}

// имплементация Game (Шашки)
class Checkers implements Game {
    private Checkers() {
    }

    private int moves = 0;
    private static final int MOVES = 3;

    public boolean move() {
        System.out.println("Checkers move " + moves);
        return ++moves != MOVES;
    }

    public static GameFactory factory = new GameFactory() {
        public Game getGame() {
            return new Checkers();
        }
    };
}

//имплементация Game (Шашки)
class Chess implements Game {
    private Chess() {
    }

    private int moves = 0;
    private static final int MOVES = 3;

    public boolean move() {
        System.out.println("Chess move " + moves);
        return ++moves != MOVES;
    }

    public static GameFactory factory = new GameFactory() {
        public Game getGame() {
            return new Chess();
        }
    };
}

public class Games {
    public static void playGame(GameFactory factory) {
        Game s = factory.getGame();
        while (s.move()) ;
    }

    public static void main(String[] args) {
        playGame(Checkers.factory);
        playGame(Chess.factory);
    }
}