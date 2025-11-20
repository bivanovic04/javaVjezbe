 class CircleCollider implements Collidable {
	 public final int cx; 
	 public final int cy;
	 public final int r;

	    public CircleCollider(int cx, int cy, int r) {
	        if (r <= 0) {
	            throw new IllegalArgumentException("poluprecnik mora biti > 0");
	        }
	        this.cx = cx;
	        this.cy = cy;
	        this.r = r;
	    }

	    @Override
	    public boolean intersects(Collidable other) {
	    	
	        if (other instanceof CircleCollider) {
	        	
	            CircleCollider c = (CircleCollider) other;
	            long dx = (long) this.cx - c.cx;
	            long dy = (long) this.cy - c.cy;
	            long distSq = dx * dx + dy * dy;
	            long rSum = (long) this.r + c.r;
	            return distSq <= rSum * rSum;
	        } else if (other instanceof RectangleCollider) {
	            RectangleCollider r = (RectangleCollider) other;
	            int closestX;
	            int closestY;
	            if (this.cx < r.x) {
	                closestX = r.x;                     // lijeva ivica
	            } else if (this.cx > r.x + r.width) {
	                closestX = r.x + r.width;           // desna ivica
	            } else {
	                closestX = this.cx;                 // centar je iznad, ispod ili unutar vertikalno
	            }

	            //  najbliža Y koordinata
	            if (this.cy < r.y) {
	                closestY = r.y;                     // gornja ivica
	            } else if (this.cy > r.y + r.height) {
	                closestY = r.y + r.height;          // donja ivica
	            } else {
	                closestY = this.cy;                 // centar je lijevo, desno ili unutar horizontalno
	            }
//izracunavanje rastojanja između centra kruga i te najbliže tačke
	            long dx = (long) this.cx - closestX;
	            long dy = (long) this.cy - closestY;

	            long distSq = dx * dx + dy * dy;
	            //Poređenje sa kvadratom poluprecnika kruga
	            return distSq <= (long) this.r * this.r;
	        } else {
	            return false;
	        }
	    }

	    
	    }

	    @Override
	    public String toString() {
	        return String.format("Circle@( %d,%d ) r=%d", cx, cy, r);
	    }
	}

