# TP4 
## Ajout d'une balle
    Balle b1 = new Balle(posx, posy, Vx, Vy, rayon, rebond, StdDraw.RED);

|Variable| Description          |
|:-----|:-------------------------|
|posx | position de départ en x |
|posy | position de départ en y |
|Vx   | vitesse initiale en x   |
|Vy   | vitesse initiale en y   |
|rayon | rayon de la balle |
|rebond | rebond de la balle |
|StdDraw.RED | couleur de la balle |

Référencer la balle dans le tableau:

    Balle[] b = {b1,b2};

Ajouter la méthode de détection de collision:

    esp.distance(b1, esp.selectBalles(b1, b));

Ajouter la méthode de mise à jour de position:

    b1.updatePosSansFrottement(esp);
