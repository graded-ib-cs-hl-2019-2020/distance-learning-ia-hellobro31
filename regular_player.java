
public class regular_player
{
    private String name;
    private double passes;
    private double shots;
    private double appearances;
    private double average_passes;
    private double average_shots;
    public regular_player(String theName,double thePasses, double theShots,double theApps,double theAvrgpasses, double theAvrgshots)
    {
        name=theName;
        passes=thePasses;
        shots=theShots;
        appearances= theApps;
        average_passes=theAvrgpasses;
        average_shots=theAvrgshots;
        
    }
    public String toString()
    {
        return  "Name of player " +name+" " + "Amount of passes " + passes +" "+ " Amount of shots: " + shots+" " + "Amount of appearances "+appearances+" " +"Average passes" +" "+average_passes+" Average shots: "+average_shots;
    }
}