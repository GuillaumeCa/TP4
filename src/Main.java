
public class Main {
	
	public static void main(String[] args) {
		
		Espace esp = new Espace();
		
		
		Balle b1 = new Balle(18, 5, 4, -8, 0.6, 0.9, StdDraw.RED);
		Balle b2 = new Balle(1, 5, 5, 10, 0.7, 0.9, StdDraw.BLUE);
		Balle b3 = new Balle(7, 5, 7, -3, 0.9, 0.9, StdDraw.GREEN);
		Balle b4 = new Balle(3, 8, 10, 2, 0.5, 0.9, StdDraw.YELLOW);
		Balle b5 = new Balle(4, 1, 3, -5, 0.5, 0.9, StdDraw.CYAN);
		Balle[] b = {b1,b2,b3,b4,b5};
		StdDraw.setXscale(esp.getXmin(), esp.getXmax());
		StdDraw.setYscale(esp.getYmin(), esp.getYmax());
		
		double time = 30;
		double t = 0;
		
		while (t < time) {
			StdDraw.rectangle(10, 10, 10, 10);
//			System.out.println("(X: " + b.px + ", Y: " + b.py + ")");
			esp.distance(b1, esp.selectBalles(b1, b));
			esp.distance(b2, esp.selectBalles(b2, b));
			esp.distance(b3, esp.selectBalles(b3, b));
			esp.distance(b4, esp.selectBalles(b4, b));
			esp.distance(b5, esp.selectBalles(b5, b));
			b1.updatePosSansFrottement(esp);
			b2.updatePosSansFrottement(esp);
			b3.updatePosSansFrottement(esp);
			b4.updatePosSansFrottement(esp);
			b5.updatePosSansFrottement(esp);
			StdDraw.show((int) (esp.getDt()*1000));
			t += esp.getDt();
			StdDraw.clear();
			
		}
	}
}
