import java.util.Random;
public class Personagem {
 
  //atributos ou propriedades
  private String nome;
  private int energia = 10;
  private int fome = 0;
  private int sono = 0;
  private int itens = 4;

  //construtor: lista de parâmetros vazia
  // Personagem(){

  // }

  Personagem(String nome){
    this.nome = nome;
  }

  Personagem(String nome, int energia, int fome, int sono){
    this.nome = nome;
    if (energia >= 0 && energia <= 10)
      this.energia = energia;
    if (fome >= 0 && fome <= 10)
      this.fome = fome;
    if(sono >= 0 && sono <= 10)
      this.sono = sono;  
  }

  //comportamentos (métodos)
  void cacar(){
    if(energia >= 2){
      System.out.println(nome + " cacando...");
      energia -= 2; // energia = energia - 2;
      itens++;
      morrer();
    }
    else{
      System.out.println (nome + " sem energia para cacar...");
    }
    fome = Math.min(fome + 1, 10);
    sono = Math.min(sono + 1 ,10);
  }

  void comer(){
    if (fome >= 1  && itens >=1){
      System.out.println(nome + " comendo...");
      // operador ternário
      energia = energia + 1 > 10 ? 10 : energia + 1;
      fome--;
      itens--;
    }
    else{
      if (fome <=1){
        System.out.println(nome + " sem fome...");
      }
      else{
        System.out.println(nome + " est� sem itens...");
      }
    }
  }

  void dormir(){
    if(sono > 0){
      System.out.println(nome + " dormindo...");
      sono -= 1;
      energia = Math.min(10, energia + 1);
    }
    else{
      System.out.println(nome + " sem sono");
    }

  }

  void exibirEstado(){
    System.out.printf(
      "%s: e: %d, f: %d, s: %d, i: %d\n",
      nome,
      energia,
      fome,
      sono,
      itens
    );
  }
  
  void oQueFazer(){
    var gerador = new Random();
    int oQueFazer = gerador.nextInt(3);
    switch(oQueFazer){
      case 0:
        cacar();
        break;
      case 1:
        comer();
        break;
      case 2:
      dormir();
        break;
    }
  }
  void morrer(){ 
    if (energia <= 0){
      System.out.println(nome + " morreu!");
    }
  }
  void fimJogo(Personagem personagem){
    if(energia <= 0 && personagem.energia <= 0){
      System.out.println("fim do jogo!");
      System.exit(0);
    }
  }
}


