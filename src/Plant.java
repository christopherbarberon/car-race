public class Plant {
    static int s_iMaxPlantNRJPoints;

    float m_fGrowingSpeed;
    float m_fArea;
    int m_iLiceSpan;
    int m_iAge;
    int m_iMaxNbrNRJ;
    int m_iCurrentNRJ;

    public static int getS_iMaxPlantNRJPoints() {
        return s_iMaxPlantNRJPoints;
    }

    public static void setS_iMaxPlantNRJPoints(int s_iMaxPlantNRJPoints) {
        Plant.s_iMaxPlantNRJPoints = s_iMaxPlantNRJPoints;
    }

    public float getM_fGrowingSpeed() {
        return m_fGrowingSpeed;
    }

    public void setM_fGrowingSpeed(float m_fGrowingSpeed) {
        this.m_fGrowingSpeed = m_fGrowingSpeed;
    }

    public float getM_fArea() {
        return m_fArea;
    }

    public void setM_fArea(float m_fArea) {
        this.m_fArea = m_fArea;
    }

    public int getM_iLiceSpan() {
        return m_iLiceSpan;
    }

    public void setM_iLiceSpan(int m_iLiceSpan) {
        this.m_iLiceSpan = m_iLiceSpan;
    }

    public int getM_iAge() {
        return m_iAge;
    }

    public void setM_iAge(int m_iAge) {
        this.m_iAge = m_iAge;
    }

    public int getM_iMaxNbrNRJ() {
        return m_iMaxNbrNRJ;
    }

    public void setM_iMaxNbrNRJ(int m_iMaxNbrNRJ) {
        this.m_iMaxNbrNRJ = m_iMaxNbrNRJ;
    }

    public int getM_iCurrentNRJ() {
        return m_iCurrentNRJ;
    }

    public void setM_iCurrentNRJ(int m_iCurrentNRJ) {
        this.m_iCurrentNRJ = m_iCurrentNRJ;
    }

    void grow(){

    }

}
