
abstract class GameObject2 {
	 protected int x, y; // logical position (top-left for rects, center or treated appropriately for circle)
	    protected Collidable collider;

	    public GameObject2(int x, int y, Collidable collider) {
	        if (collider == null) throw new IllegalArgumentException("collider ne smije biti prazan");
	        this.x = x;
	        this.y = y;
	        this.collider = collider;
	    }

	    /**
	    
	     */
	    public boolean intersects(GameObject other) {
	        if (other == null) throw new IllegalArgumentException("other ne smije biti prazan");
	        return this.collider.intersects(other.collider);
	    }

	    public Collidable getCollider() {
	        return collider;
	    }

	    public abstract String getDisplayName();

	    @Override
	    public String toString() {
	        return String.format("(%d,%d) %s", x, y, collider.toString());
	    }
	}

