package prototipo_rpg;

public class Main {
    public static void main(String[] args) {

        Personagem player = new Personagem("Lucas", 1.68f, 60f);
        Personagem goblin = new Personagem("Goblin", 0.5f, 30f);
        Dungeon d1 = new Dungeon(player, goblin);
    }
}