package Exercicios;
public class PhraseOMatic {
  public static void main (String[] args) {
    String [] wordListOne = {"a", "b", "c", "d", "e"};
    String [] wordListTwo = {"f", "g", "h", "i", "j"};
    String [] wordListThree = {"k", "l", "m", "n", "o"};

    int firstListLength = wordListOne.length;    
    int secondListLength = wordListTwo.length;    
    int thirdListLength = wordListThree.length; 

    System.out.println("fistList length: " +firstListLength);
    System.out.println("secondList length: " +secondListLength);
    System.out.println("thirdList length: " +thirdListLength);

    java.util.Random randomGenerator = new java.util.Random();
    int rand1 = randomGenerator.nextInt(firstListLength);
    int rand2 = randomGenerator.nextInt(secondListLength);
    int rand3 = randomGenerator.nextInt(thirdListLength);

    String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

    System.out.println("Precisamos de " +phrase);    
  }
}