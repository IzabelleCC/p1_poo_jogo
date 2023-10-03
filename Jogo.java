
public class Jogo {
  public static void main(String[] args) throws Exception {
    var personagem1 = new Personagem("John");
    var personagem2 = new Personagem("George");
    while(true){
      personagem1.oQueFazer(personagem2);
      if(personagem1.getEnergia() > 0){
        personagem1.exibirEstado();
      }
      personagem1.fimJogo(personagem2);
      personagem2.oQueFazer(personagem1);
      if(personagem2.getEnergia() > 0){
        personagem2.exibirEstado();
      }
      personagem2.fimJogo(personagem1);
      System.out.println("--------------------");
     // Thread.sleep(800);
    }
  }
}
