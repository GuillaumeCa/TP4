import java.awt.Color;

public class Balle {
	
	double px, py;
	double vx, vy;
	double rayon;
	double rebond;
	double frottement;
	Color color;

	
	// Constructeur de la classe Balle
	
	public Balle(double px, double py, double vx, double vy, double rayon, double rebond, Color color) {
		this.px = px;
		this.py = py;
		this.vx = vx;
		this.vy = vy;
		this.rayon = rayon;
		this.rebond = rebond;
		this.color = color;
	}
	
	// methods
	
	public void updatePosSansFrottement(Espace esp) {
		
		StdDraw.setPenColor(color);
		StdDraw.filledCircle(px, py, rayon);

		// frottement
		double k = 19*rayon;
		vx -= vx*k*1.8e-5;
		vy -= vy*k*1.8e-5;
		
		vy = vy + esp.getG() * esp.getDt();
		py = py - vy * esp.getDt() - 0.5 * esp.getG() * esp.getDt();
		px = px + vx * esp.getDt();
		
		if (px == 0) {
			vy = vy * frottement;
			
		}
		
		if (px > esp.getXmax() - rayon) {
			px = esp.getXmax() - rayon;
			vx = - vx * rebond;
		}
		
		if (px < esp.getXmin() + rayon) {
			px = esp.getXmin() + rayon;
			vx = - vx * rebond;
		}
		
		if (py > esp.getYmax() - rayon) {
			py = esp.getYmax() - rayon;
			vy = - vy * rebond;
		}
		
		if (py < esp.getYmin() + rayon) {
			py = esp.getYmin() + rayon;
			vy = - vy * rebond;
		}
		
		
	}
}
