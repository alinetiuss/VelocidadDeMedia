public class Main {
  public static void main(String[] args) {
    System.out.println("Programa feito para calcular a velocidade média em km/h");
    System.out.println();
    System.out.println(" A distancia considerada é:");
    double distancia = 400;
    System.out.println(distancia);
    
    System.out.println("O tempo considerado é:");
    double tempo = 3;
    System.out.println(tempo);

    System.out.println("O resultado da velocidade média é:");
    double velocidadeMedia = distancia/tempo;
    System.out.println(velocidadeMedia);
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}