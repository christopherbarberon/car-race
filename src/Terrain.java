public class Terrain {
    int m_iWidth=80;
    int m_iHeight=30;

    public int getWidth(){
        return m_iWidth;
    }
    public int getHeight(){
        return m_iHeight;
    }


    private Prey[] m_PreysArray;
    private Predator[] m_PredatorArray;
    private Plant[] m_PlantArray;
    private WaterSpot m_WaterSpot;
    private static char[][] board;

    public Terrain(){
     m_PreysArray=new Prey[100];
        for (int i = 0; i < m_PreysArray.length; i++) {
            m_PreysArray[i] = new Prey();
        }

     m_PredatorArray=new Predator[100];
        for (int i = 0; i < m_PredatorArray.length; i++) {
            m_PredatorArray[i] = new Predator();
        }

     m_PlantArray=new Plant[50];
        for (int i = 0; i < m_PlantArray.length; i++) {
            m_PlantArray[i] = new Plant();
        }

     m_WaterSpot =new WaterSpot();
     m_iHeight = 30;
     m_iWidth = 80;
}
    void step(){
    for (Predator pred : m_PredatorArray) {
        pred.step();
    }
    for (Plant plant : m_PlantArray) {
        plant.step();
    }
    for (Prey prey : m_PreysArray) {
        prey.step();
    }
    m_WaterSpot.step();

}
    void draw(){
    for (int x = 0; x <m_iHeight; x++) {

        for (int y = 0; y <  m_iWidth; y++) {
            if (x == 0 || x == m_iHeight - 1)
                System.out.print("_");
            else if (y == 0 || y == m_iWidth - 1)
                System.out.print("|");
            else
                System.out.print(" ");
        }
        System.out.println("");
    }

}

    boolean hasLivingCreatures(){
    return true;
}
    public void spray(float p_fQuantity){
    m_WaterSpot.addWater(p_fQuantity);
}
    public boolean isSpotOccupied(Coords p_Coords ){
        if (m_WaterSpot.isInWater(p_Coords))
            return true;

        for (Predator pred:m_PredatorArray) {
            if (pred.m_Coords.isSame(p_Coords))
                return true;
        }


        //test also water,preys,plant ...
        return false;
    }
}
