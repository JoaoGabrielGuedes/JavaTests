package Exercicios;

public class PoolPuzzleOne {
  public static void main(String [] args){
    int x = 0;
    while (x < 4){
        System.out.print("a");
        if (x < 1){
           System.out.print(" ");
        }
        System.out.print("n");
        if (x > 1){
          System.out.print(" oyster");
          x = x + 2;
        }
        if (x == 1){
          System.out.print("noys");
        }
        if (x < 1){
          System.out.print("oise");
        }
        System.out.println("");
        x = x + 1;
    }
  }
}
//output
//a noise
//annoys
//an oyster

/*
 * System.out.print("");
 * System.out.print("a"); x
 * System.out.print("n");
 * System.out.print("an"); x
 * System.out.print("noys");
 * System.out.print("oise");
 * System.out.print("oyster");
 * System.out.print("annoys");
 * System.out.print("noise"); x
 * x > 0
 * X < 1 x
 * x > 1 x
 * x > 3
 * x < 4 x
 * x = x + 1
 * x = x + 2
 * x = x - 1
 * x = x - 2
 */
