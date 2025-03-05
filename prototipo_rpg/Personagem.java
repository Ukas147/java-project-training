package prototipo_rpg;

public class Personagem {
    private String nome;
    private float altura;
    private float peso;
    private boolean vivo;
    private int vida;
    private int dano;
    private int defesa;
    private boolean isDefend;
    private int mana;

    public Personagem (String nome, float altura, float peso){
        this.setNome(nome);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setVivo(true);
        this.setVida(20);
        this.setDano(4);
        this.setDefesa(2);
        this.setMana(5);
    }

    public void status(){
        System.out.println("Nome: " + this.getNome() + " Vida: " + this.getVida());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public boolean getVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public boolean getIsDefend() {
        return isDefend;
    }

    public void setIsDefend(boolean isDefend) {
        this.isDefend = isDefend;
    }

    
}