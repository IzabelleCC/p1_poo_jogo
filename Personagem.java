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
    }
    else{
      System.out.println (nome + " sem energia para cacar...");
    }
    fome = Math.min(fome + 1, 10);
    sono = Math.min(sono + 1 ,10);
  }

  void comer(){
    if (fome >= 1){
      System.out.println(nome + " comendo...");
      // operador ternário
      energia = energia + 1 > 10 ? 10 : energia + 1;
      fome--;
    }
    else{
        System.out.println(nome + " sem fome...");
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
 
}