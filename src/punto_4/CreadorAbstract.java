package punto_4;

public abstract class CreadorAbstract 
{
    
    public static final int stand_1 = 1;
    public static final int stand_2 = 2;
    public static final int stand_3 = 3;
    public static final int stand_4 = 4;

    
    public abstract IStand elaborar(int tipo);
}
