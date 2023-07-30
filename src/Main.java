import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
   // Project X and O Game .
    private Scanner input = new Scanner(System.in);
    private char[][] box = new char[3][3];
    private List<Integer> usersInputs = new ArrayList<>();
    private Random random = new Random();
    private static final char USER_SYMBOL = 'X';
    private static final char COMPUTER_SYMBOL = 'O';


    public static void main(String[] args) {

        Main game = new Main();
        game.printBox();
        boolean playing = true;
        while (playing) {
            try {
                game.playAsUser();
                game.printBox();
                if (game.endTheGame()) {
                    playing = false;
                    continue;
                }
                game.playAsComputer();
                game.printBox();
                if (game.endTheGame()) {
                    playing = false;
                }
            } catch (Exception e) {
                playing = false;
                System.out.println(e.getMessage());
            }
        }

    }


    private void printBox() {
        for (int i = 0; i < box.length; i++) {
            for (int j = 0; j < box[i].length; j++) {

                if (j == 0) {
                    System.out.print(box[i][j] + " | ");
                }
                if (j == box[i].length - 2) {
                    System.out.print(box[i][j] + " | ");
                }
                if (j == box[i].length - 1) {
                    System.out.println(box[i][j]);
                    System.out.print("---------");
                }

            }
            System.out.println();
        }
    }

    private boolean endTheGame() {
        if (won(USER_SYMBOL)) {
            System.out.println("Player wins ");
            return true;
        }
        if (won(COMPUTER_SYMBOL)) {
            System.out.println("Computer wins ");
            return true;
        }

        if (usersInputs.size() == 9) {
            System.out.println("The game is a draw ");
            return true;
        }

        return false;
    }

    private boolean won(char symbol) {
        if (box[0][0] == symbol && box[0][1] == symbol && box[0][2] == symbol ||
                box[1][0] == symbol && box[1][1] == symbol && box[1][2] == symbol
                || box[2][0] == symbol && box[2][1] == symbol && box[2][2] == symbol ||
                box[0][0] == symbol && box[1][1] == symbol && box[2][2] == symbol ||
                box[2][0] == symbol && box[1][1] == symbol && box[0][2] == symbol ||
                box[0][0] == symbol && box[1][0] == symbol && box[2][0] == symbol ||
                box[0][1] == symbol && box[1][1] == symbol && box[2][1] == symbol ||
                box[0][2] == symbol && box[1][2] == symbol && box[2][2] == symbol) {
            return true;
        }
        return false;
    }

    public void playAsComputer() {
        int max = 9;
        int min = 1;
        int move = 0;

        do {
            move = random.nextInt((max - min) + 1) + min;
        } while (checkIfMovePlayed(move));

        System.out.println("computer move is : " + move);


        makeMove(move, COMPUTER_SYMBOL);
    }

    public void playAsUser() {
        int move = 0;
        do {
            System.out.println("Please Enter number between 1 and 9");
            System.out.print("Where would you like to play? : ");

            try {
                move = input.nextInt();
            } catch (InputMismatchException inputMismatchException) {
                throw new IllegalArgumentException("invalid number");
            } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                throw new IllegalArgumentException("invalid move");
            }

        } while (checkIfMovePlayed(move));


        makeMove(move, USER_SYMBOL);
    }

    private boolean checkIfMovePlayed(int move) {
        return usersInputs.stream().anyMatch(position -> position == move);
    }

    private void makeMove(int move, char symbol) {
        usersInputs.add(move);
        switch (move) {
            case 1 -> box[0][0] = symbol;
            case 2 -> box[0][1] = symbol;
            case 3 -> box[0][2] = symbol;
            case 4 -> box[1][0] = symbol;
            case 5 -> box[1][1] = symbol;
            case 6 -> box[1][2] = symbol;
            case 7 -> box[2][0] = symbol;
            case 8 -> box[2][1] = symbol;
            case 9 -> box[2][2] = symbol;
            default -> throw new ArrayIndexOutOfBoundsException("Invalid move");
        }

    }

}
