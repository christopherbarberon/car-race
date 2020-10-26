public class Predator {
    static int s_iMaxPredatorAge;
    int m_iAgeMax;
    int m_iAge;

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
}
