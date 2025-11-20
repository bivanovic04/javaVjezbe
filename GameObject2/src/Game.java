import java.util.ArrayList;

public class Game {
	private Player player;
    private ArrayList<Enemy> enemies;
    private ArrayList<String> eventLog;

    public Game(Player player) {
        if (player == null) throw new IllegalArgumentException();
        this.player = player;
        this.enemies = new ArrayList<>();
        this.eventLog = new ArrayList<>();
    }

    public void addEnemy(Enemy e) {
        if (e == null) throw new IllegalArgumentException();
        enemies.add(e);
        eventLog.add(String.format("dodati: %s", e.getType()));
}
   public boolean checkCollision(Player p, Enemy e) {
        if (p == null || e == null) throw new IllegalArgumentException();
        return p.intersects(e);
    } 
   public void decreaseHealth(Player p, Enemy e) {
       if (p == null || e == null) throw new IllegalArgumentException("Player and Enemy must not be null");
       int before = p.getHealth();
       int dmg = e.getEffectiveDamage();
       int newHealth = Math.max(0, before - dmg);
       p.changeHealthBy(-dmg); // will clamp to 0
       eventLog.add(String.format("HIT: Player by %s for %d -> HP %d -> %d", e.getType(), dmg, before, p.getHealth()));
   }

}


