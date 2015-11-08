

public class Espace {
	
	// attribute
	private double g;
	private double dt;
	private double Xmin;
	private double Xmax;
	private double Ymin;
	private double Ymax;
	public Balle[] balles;
	
	// methods
	
	public Espace() {
		g = 9.81;
		dt = 0.016;
		Xmin = 0;
		Xmax = 20;
		Ymin = 0;
		Ymax = 20;
		balles = new Balle[1];
	}

	public void distance(Balle B, Balle[] balles) {
		for (Balle b: balles) {
			double distx = b.px-B.px;
			double disty = b.py-B.py;
	        if (Math.pow(distx, 2)+Math.pow(disty, 2) < Math.pow(b.rayon + B.rayon,2)) {
	        	B.vx = -B.vx;
				B.vy = -B.vy;
			}
		}
	}
	
	public Balle[] selectBalles(Balle b, Balle[] B) {
		Balle[] B1 = new Balle[B.length-1];
		int i=0;
		for (int k=0; k < B.length;k++) {
			if (b != B[k]) {
				B1[i] = B[k];
				i++;
			}
		}
		return B1;
	}
	
	public double getG() {
		return g;
	}

	public void setG(double g) {
		this.g = g;
	}

	public double getDt() {
		return dt;
	}

	public void setDt(double dt) {
		this.dt = dt;
	}

	public double getXmin() {
		return Xmin;
	}

	public void setXmin(double xmin) {
		Xmin = xmin;
	}

	public double getXmax() {
		return Xmax;
	}

	public void setXmax(double xmax) {
		Xmax = xmax;
	}

	public double getYmin() {
		return Ymin;
	}

	public void setYmin(double ymin) {
		Ymin = ymin;
	}

	public double getYmax() {
		return Ymax;
	}

	public void setYmax(double ymax) {
		Ymax = ymax;
	}

	
}
