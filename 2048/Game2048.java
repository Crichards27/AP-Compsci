public class Game2048
{
   private int[][] gameBoard;
   private int score;
   private int boardSize;   
   
   public Game2048()
   {
      boardSize = 4;
      gameBoard = new int[boardSize][boardSize];
      score = 0;
      add2ToBoard();
      add2ToBoard();
   }
   
   public void add2ToBoard()
   {
       boolean emptySpot = false;
       for (int r = 0; r < boardSize; r++) {
           for (int c = 0; c < boardSize; c++) {
               if (gameBoard[r][c] == 0) emptySpot = true;
           }
       }
       if (!emptySpot) return;

       int row = (int)(Math.random() * boardSize);
       int col = (int)(Math.random() * boardSize);
       while(gameBoard[row][col] != 0){
           row = (int)(Math.random() * boardSize);
           col = (int)(Math.random() * boardSize);
       }
       gameBoard[row][col] = 2;
   }      
      
   public void moveLeft()
   {
       for(int r = 0; r < gameBoard.length; r++){
           for(int c = 0; c < gameBoard[0].length - 1; c++){
               if(gameBoard[r][c] == 0){
                   int col = c + 1;
                   while(col < gameBoard[0].length - 1 && gameBoard[r][col] == 0){
                       col++;
                   }
                   if(gameBoard[r][col] != 0){
                       gameBoard[r][c] = gameBoard[r][col];
                       gameBoard[r][col] = 0;
                   }
               }
           }
       }
   }
   
   public void moveRight()
   {
       for(int r = 0; r < gameBoard.length; r++){
           for(int c = gameBoard[0].length - 1; c > 0; c--){
               if(gameBoard[r][c] == 0){
                   int col = c - 1;
                   while(col > 0 && gameBoard[r][col] == 0){
                       col--;
                   }
                   if(gameBoard[r][col] != 0){
                       gameBoard[r][c] = gameBoard[r][col];
                       gameBoard[r][col] = 0;
                   }
               }
           }
       }
    }
      
   public void moveUp()
   {
      for(int c = 0; c < gameBoard[0].length; c++){
          // Iterate rows from top down
          for(int r = 0; r < gameBoard.length - 1; r++){
              if(gameBoard[r][c] == 0){
                  int row = r + 1;
                  // Find next non-zero number below
                  while(row < gameBoard.length - 1 && gameBoard[row][c] == 0){
                      row++;
                  }
                  if(gameBoard[row][c] != 0){
                      gameBoard[r][c] = gameBoard[row][c];
                      gameBoard[row][c] = 0;
                  }
              }
          }
      }
   }
   
   public void moveDown()
   {
      /* To be completed in Activity 3 Part D */
      // Iterate through columns
      for(int c = 0; c < gameBoard[0].length; c++){
          // Iterate rows from bottom up
          for(int r = gameBoard.length - 1; r > 0; r--){
              if(gameBoard[r][c] == 0){
                  int row = r - 1;
                  // Find next non-zero number above
                  while(row > 0 && gameBoard[row][c] == 0){
                      row--;
                  }
                  if(gameBoard[row][c] != 0){
                      gameBoard[r][c] = gameBoard[row][c];
                      gameBoard[row][c] = 0;
                  }
              }
          }
      }
   }
   
   public void mergeLeft()
   {
      /* To be completed in Activity 4 Part A*/
      for(int r = 0; r < gameBoard.length; r++) {
          for(int c = 0; c < gameBoard[0].length - 1; c++) {
              // If current and next are same and not zero
              if(gameBoard[r][c] != 0 && gameBoard[r][c] == gameBoard[r][c+1]) {
                  gameBoard[r][c] *= 2;      // Double the value
                  score += gameBoard[r][c];  // Add to score
                  gameBoard[r][c+1] = 0;     // Clear the merged tile
              }
          }
      }
   }

   public void mergeRight()
   {
      /* To be completed in Activity 4 Part B*/
       for(int r = 0; r < gameBoard.length; r++) {
          for(int c = gameBoard[0].length - 1; c > 0; c--) {
              // If current and left neighbor are same and not zero
              if(gameBoard[r][c] != 0 && gameBoard[r][c] == gameBoard[r][c-1]) {
                  gameBoard[r][c] *= 2;
                  score += gameBoard[r][c];
                  gameBoard[r][c-1] = 0;
              }
          }
      }
   }
   
   public void mergeUp()
   {
      /* To be completed in Activity 4 Part C */
      for(int c = 0; c < gameBoard[0].length; c++) {
          for(int r = 0; r < gameBoard.length - 1; r++) {
              // If current and neighbor below are same and not zero
              if(gameBoard[r][c] != 0 && gameBoard[r][c] == gameBoard[r+1][c]) {
                  gameBoard[r][c] *= 2;
                  score += gameBoard[r][c];
                  gameBoard[r+1][c] = 0;
              }
          }
      }
   }

   public void mergeDown()
   {
      /* To be completed in Activity 4 Part D */
      for(int c = 0; c < gameBoard[0].length; c++) {
          for(int r = gameBoard.length - 1; r > 0; r--) {
              // If current and neighbor above are same and not zero
              if(gameBoard[r][c] != 0 && gameBoard[r][c] == gameBoard[r-1][c]) {
                  gameBoard[r][c] *= 2;
                  score += gameBoard[r][c];
                  gameBoard[r-1][c] = 0;
              }
          }
      }
   }
   
   public boolean gameOver()
   {
      for (int r = 0; r < gameBoard.length; r++) {
          for (int c = 0; c < gameBoard[0].length; c++) {
              if (gameBoard[r][c] == 0) {
                  return false; // Game is not over if there is space
              }
          }
      }

      for (int r = 0; r < gameBoard.length; r++) {
          for (int c = 0; c < gameBoard[0].length - 1; c++) {
              if (gameBoard[r][c] == gameBoard[r][c+1]) {
                  return false; // Possible merge found
              }
          }
      }

      for (int c = 0; c < gameBoard[0].length; c++) {
          for (int r = 0; r < gameBoard.length - 1; r++) {
              if (gameBoard[r][c] == gameBoard[r+1][c]) {
                  return false; // Possible merge found
              }
          }
      }

      return true;
   }   
   
   public void displayBoard()
   {
      System.out.println("Score: " + score);
      System.out.println();
      for (int row = 0; row < gameBoard.length; row++)
      {
         for (int col = 0; col < gameBoard[0].length; col++)
         {
            if (gameBoard[row][col] == 0)
            {
               System.out.print("-\t\t");
            } 
            else if (gameBoard[row][col] < 100)
            {
               System.out.print(gameBoard[row][col] + "\t\t");
            }
            else 
            {
               System.out.print(gameBoard[row][col] + "\t");
            }
         }
         System.out.println();
      }
      System.out.println();
   }
}