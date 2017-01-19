package interfaces.factorymethod;

/**
 * Created by WORK_WERT on 19.01.2017.
 */
// игра
interface Game {
    boolean move();
}

// фабрика игр
interface GameFactory {
    Game getGame(); // фабричный метод
}

// имплементация Game (Шашки)
class Checkers implements Game {
    private int moves = 0;
    private final int MOVES = 3;

    @Override
    public boolean move() {
        System.out.println("Checkers move " + moves);
        return ++moves != MOVES;
    }
}

// имплементация GameFactory для шашек
class CheckersFactory implements GameFactory {
    @Override
    public Game getGame() {
        return new Checkers();
    }
}

// имплементация Game (Шахматы)
class Chess implements Game {
    private int moves = 0;
    private final int MOVES = 4;

    @Override
    public boolean move() {
        System.out.println("Chess move " + moves);
        return ++moves != MOVES;
    }
}

// имплементаця GamgeFactory для шахмат
class ChessFactory implements GameFactory {

    @Override
    public Game getGame() {
        return new Chess();
    }
}

public class Games {

    public static void playGame(GameFactory factory) {
        Game s = factory.getGame();
        while (s.move()) ;
    }

    public static void main(String[] args) {
        playGame(new CheckersFactory());
        playGame(new ChessFactory());
    }

}