public class Tictactoe {


    public static void main(String[] args) {
            char[][] board = {
                {'_',  '_',  '_'},
                {'_',  '_',  '_'},
                {'_',  '_',  '_'}

            };

            printBoard(board);

            for(int i = 0; i < 9; i++){
                if(i % 2 ==0){
                    System.out.println("Turn X:");
                    askUser(board);
                } else {
                    System.out.println("Turn: O");
                    askUser(board);
                }
            }


    }

    public static void printBoard(char[][] board){
        System.out.print("\n");
        for(int i = 0; i < board.length; i++){
            System.out.println("\t");
            for(int j = 0; j < board[i].length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println("\n\n");
        }
    }

    public static int[] askUser(char[][] board){
        return new int[] {0,1};
    }
}
