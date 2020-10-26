public class Predator {
    private static int s_iMaxPredatorAge;
    private int m_iAgeMax;
    private int m_iAge;

    static int s_iMaxPredatorLifePoint;
    int m_iLifePointMax;
    int m_iLifePoint;

    static int s_iMaxPredatorVigor;
    int m_iVigorMax;
    int m_iVigor;


    static float s_fPredatorMovingBySmell;
    static float s_fPredatorSpeedMovingByView;
    static float s_fMaxPredatorMovingSpeed;
    float m_fMaxMovingSpeed;
    float m_fMovingSpeed;

    static float s_fPredatorAcceleration;

    static float s_fPredatorMovingNoise;

    float m_fOrientation; // angle varing between 0 and 2Pi

    Vision m_Vision;
    Smelling m_Smelling;
    Coords m_Coords;

    void draw(){

    }
    void step(){

    }
    void pop(){

    }
    void move(){

    }
    void mating(){

    }
    void eat(){

    }
    void drink(){

    }
    void rest(){

    }

    void spot(Prey p_Prey){
        if(m_Smelling.canSmell(p_Prey, m_Coords)){
            hunt(p_Prey);
        }
    }
    void hunt(Prey p_Prey){

    }
}
