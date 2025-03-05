package prototipo_rpg;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Dungeon extends Dice{
    Scanner scan = new Scanner(System.in);

    private Personagem player1;
    private Personagem player2;

    public Dungeon(Personagem player1, Personagem player2){
        this.setPlayer1(player1);
        this.setPlayer2(player2);
        batalha(player1, player2);
    }

    private void batalha(Personagem player1, Personagem player2) {
        player1.setIsDefend(false);
        player2.setIsDefend(false);

        int option = 0;
        while(player1.getVida() > 0 && player2.getVida() > 0) {
            try {
                player1.status();
                player2.status();
                System.out.println("\nDigite uma acao:");
                System.out.println("1 - Atacar");
                option = scan.nextInt();

                switch (option) {
                    case 1:
                    System.out.print("Atacar! ");
                    attack(player1, player2);
                    enemyAction();
                    break;
                
                    default:
                    System.out.println("Opcao invalida");
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Isso nao e um numero");
                scan.next();
            }
        }
        System.out.println("alguem morreu");
    }

    private void attack(Personagem p1, Personagem p2){
        int randomAction = dice4();

        if (randomAction == 1) {
            int attack = dice4();
            p1.setVida(p1.getVida() - attack);
            System.out.println("Ataque falhou e voce tomou " + attack + " de dano");
        }
        else if (randomAction <= 4) {
            p2.setVida(p2.getVida() - (p1.getDano() - p2.getDefesa()));
            System.out.println(p1.getNome() + " deu " + p1.getDano() + " de dano\n");
        }
    }

    private void enemyAction(){
        System.out.print("Acao do inimigo: ");
        attack(player2, player1);
    }

    public Personagem getPlayer1() {
        return player1;
    }

    public void setPlayer1(Personagem player1) {
        this.player1 = player1;
    }

    public Personagem getPlayer2() {
        return player2;
    }

    public void setPlayer2(Personagem player2) {
        this.player2 = player2;
    }
}