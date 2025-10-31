package Exercicios;

public class InputsOutputs {
  public static void main(String[] args) {
    int x = 0;
    int y = 0;

    while (x < 5) { //input aqui
      y = x - y;
      System.out.print(x + "" + y + " ");
      x = x + 1;
    }
  }  
}

//Possíveis inputs no código:
//A) y = x - y; 00 11 21 32 42
//B) y = y + x; 00 11 23 36 410 
//C) y = y + 2; if (y > 4) {  y = y -1; } 02 14 25 36 47
//D) x = x + 1; y = y + x; 11 34 59
//E) if ( y < 5) { x = x + 1; if (y < 3) { x = x - 1; } } y = y + 2; 02 14 36 48

//Possíveis outputs
//22 46
//11 34 59 D
//02 14 26 38 
//02 14 36 48 E
//00 11 21 32 42 A
//11 21 32 42 53 
//00 11 23 36 410 B
//02 14 25 36 47 C
