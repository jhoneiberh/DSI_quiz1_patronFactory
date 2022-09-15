package punto_4;

public class CreadorConcreto extends CreadorAbstract
{

    public void CreadorConcreto()
    {
        
    }
    
    @Override
    public IStand elaborar(int tipo) 
    {
        
        IStand stand;
        
        switch(tipo)
        {
            case stand_1:
                stand = new StandEdwing();
                break;
                
            case stand_2:
                stand = new StandJohana();
                break;
                
            
            case stand_3:
                stand = new StandSebastian();
                break;
            case stand_4:
                stand = new StandRamos();
                break;
            default:
                stand = null;
        }
                
        
        return stand;
    }
    
}
