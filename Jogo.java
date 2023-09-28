
public class Jogo {
  public static void main(String[] args) throws Exception {
    var personagem1 = new Personagem("John");
    var personagem2 = new Personagem("George");
    while(true){
      personagem1.oQueFazer();
      personagem1.exibirEstado();
      personagem2.oQueFazer();
      personagem2.exibirEstado();
      System.out.println("--------------------");
      Thread.sleep(8000);
    }
  }
}
