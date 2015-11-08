
public class Main {
	
	public static void main(String[] args) {
		
		Espace esp = new Espace();
		
		
		Balle b1 = new Balle(5, 12, 18, -28, 1, 0.95, StdDraw.RED);
		Balle b2 = new Balle(1, 5, 25, -20, 2, 0.95, StdDraw.BLUE);
		
		Balle[] b = {b1,b2};
		
		StdDraw.setXscale(esp.getXmin(), esp.getXmax());
		StdDraw.setYscale(esp.getYmin(), esp.getYmax());
		
		double time = 60;
		double t = 0;
		
		while (t < time) {
			
			StdDraw.rectangle(10, 10, 10, 10);
//			System.out.println("(X: " + b.px + ", Y: " + b.py + ")");
			
			esp.distance(b1, esp.selectBalles(b1, b));
			esp.distance(b2, esp.selectBalles(b2, b));
			
			b1.updatePosSansFrottement(esp);
			b2.updatePosSansFrottement(esp);
			
			StdDraw.show((int) (esp.getDt()*1000));
			
			t += esp.getDt();
			StdDraw.clear();
			
		}
	}
}
