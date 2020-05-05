package uni.Chess;

import java.util.Scanner;

public class Chess {
    static final int rows = 7;
    static final int columns = 7;

    public static void main(String[] args) {
        boolean isGameRunning = true;
        String[][] board = new String[rows][columns];
        fillBoard(board);
        while(isGameRunning){
            System.out.println("Select black/white");
            Scanner colorSelection = new Scanner(System.in);
            String colorSelect = colorSelection.nextLine();
            if (colorSelect.equals("white")){
                enterMoveWhite(board);
            } else if (colorSelect.equals("black")){
                enterMoveBlack(board);
            } else {
                System.out.println("Invalid selection");
            }
        }
    }
    public static void fillBoard(String[][] board){
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                board[row][col] = " X ";
                outerShell(board);
                pawns(board);
                System.out.print(board[row][col]);
            }
            System.out.println();
        }
    }
    public static void renderGameBoard(String[][] board){
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                outerShell(board);
                System.out.print(board[row][col]);
            }
            System.out.println();
        }
    }
    public static void outerShell(String[][] board){
        board[0][0] = "   ";
        board[0][1] = " A ";
        board[0][2] = " B ";
        board[0][3] = " C ";
        board[0][4] = " D ";
        board[0][5] = " E ";
        board[0][6] = " F ";
        board[1][0] = " A ";
        board[2][0] = " B ";
        board[3][0] = " C ";
        board[4][0] = " D ";
        board[5][0] = " E ";
        board[6][0] = " F ";
    }
    public static void pawns(String[][] board){
        //whitePawns
        board[1][1] = "wDw";
        board[1][2] = " wD";
        board[1][3] = " wQ";
        board[1][4] = " wK";
        board[1][5] = " wM";
        board[1][6] = " wDw ";
        //blackPawns
        board[6][1] = "bDw";
        board[6][2] = " bM";
        board[6][3] = " bK";
        board[6][4] = " bQ";
        board[6][5] = " bD";
        board[6][6] = " bDw";
    }
    public static void enterMoveBlack(String[][] board){
        System.out.println("Black's turn");
        System.out.println("");
        System.out.println("Select the piece you want to move(Example af) if you want to quit enter: q");
        Scanner gameInput  = new Scanner(System.in);
        String pieceSelect = gameInput.nextLine();
        if(pieceSelect.equals("q")){
            System.exit(0);
        }
        switch (pieceSelect){
            case "af":
                board[6][1]= " X ";
                System.out.println("You have selected bDw. Now select a finishing position");
                break;
            case "bf":
                board[6][2]= " X ";
                System.out.println("You have selected bM. Now select a finishing position");
                break;
            case "cf":
                board[6][3]= " X ";
                System.out.println("You have selected bK. Now select a finishing position");
                break;
            case "df":
                board[6][4]= " X ";
                System.out.println("You have selected bQ. Now select a finishing position");
                break;
            case "ef":
                board[6][5]= " X ";
                System.out.println("You have selected bD. Now select a finishing position");
                break;
            case "ee":
                board[5][5]= " X ";
                System.out.println("Now select a finishing position");
                break;
            case "ff":
                board[6][6]= " X ";
                System.out.println("You have selected bDw. Now select a finishing position");
                break;
            default:
                System.out.println("Invalid move");
                enterMoveBlack(board);
        }
        System.out.println(" ");
        String piecePlace = gameInput.nextLine();
        switch (piecePlace){
            case "ae":
                board[5][1] = "bDw";
                break;
            case "be":
                board[5][2] = "bM";
                break;
            case "ce":
                board[5][3] = "bK";
                break;
            case "de":
                board[5][4] = "bQ";
                break;
            case "ee":
                board[5][5] = "bD";
                break;
            case "ed":
                board[4][5]= "bD";
                break;
            case "fe":
                board[5][6] = "bDw";
                break;
            default:
                System.out.println("Invalid move");
                enterMoveBlack(board);
        }
        renderGameBoard(board);
        enterMoveWhite(board);
    }
    public static void enterMoveWhite(String[][] board){
        System.out.println("White's turn");
        System.out.println("");
        System.out.println("Select the piece you want to move(Example aa) if you want to quit enter: q");
        Scanner gameInput  = new Scanner(System.in);
        String pieceSelect = gameInput.nextLine();
        if(pieceSelect.equals("q")){
            System.exit(0);
        }
        switch (pieceSelect){
            case "aa":
                board[1][1]= " X ";
                System.out.println("You have selected wDw. Now select a finishing position");
                break;
            case "ab":
                board[1][2]= " X ";
                System.out.println("You have selected wD. Now select a finishing position");
                break;
            case "bb":
                board[2][2]= " X ";
                System.out.println("You have selected wD. Now select a finishing position");
                break;
            case "ac":
                board[1][3]= " X ";
                System.out.println("You have selected wQ. Now select a finishing position");
                break;
            case "ad":
                board[1][4]= " X ";
                System.out.println("You have selected wK. Now select a finishing position");
                break;
            case "ae":
                board[1][5]= " X ";
                System.out.println("You have selected wM. Now select a finishing position");
                break;
            case "af":
                board[1][6]= " X ";
                System.out.println("You have selected wDw. Now select a finishing position");
                break;
            default:
                System.out.println("Invalid move");
                enterMoveWhite(board);
        }
        System.out.println(" ");
        String piecePlace = gameInput.nextLine();
        switch (piecePlace){
            case "ba":
                board[2][1] = "wDw";
                break;
            case "bb":
                board[2][2] = "wD";
                break;
            case "cb":
                board[3][2]= "wD";
                break;
            case "bc":
                board[2][3] = "wQ";
                break;
            case "bd":
                board[2][4] = "wK";
                break;
            case "be":
                board[2][5] = "wM";
                break;
            case "bf":
                board[2][6] = "wDw";
                break;
            default:
                System.out.println("Invalid move");
                enterMoveWhite(board);
        }
        renderGameBoard(board);
        enterMoveBlack(board);
    }
}