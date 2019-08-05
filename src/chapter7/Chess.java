package chapter7;

class Game{
    Game(int i ){
        System.out.println("game");
    }
}

class BoardGame extends Game{
    BoardGame(int i ){
        super(i);
        System.out.println("Bgame");
    }
}
public class Chess extends  BoardGame{
    Chess(){
        super(11);
        System.out.println("Chessgame");
    }

    public static void main(String[] args) {
        Chess chess = new Chess();

    }
}
