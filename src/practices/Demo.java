package practices;

import java.util.HashMap;
import java.util.Map;

public class Demo 
{    
    public static void distributeBonus(double totBon,Map<String, Double> bonuses,String type) 
    {
        System.out.println("\n"+type+"Bonus Distribution:");
        for (Map.Entry<String, Double> entry : bonuses.entrySet()) 
        {
            String id =entry.getKey();
            double bonus=entry.getValue();
            System.out.println(id+": Rs"+bonus);
        }
    }
    public static void main(String[] args) 
    {
        double totBon=3000000.0;
        
        Map<String, Double> bon=new HashMap<String, Double>();
        bon.put("SE1",550000.0);
        bon.put("SE2",560000.0);
        bon.put("SE5",660000.0);
        bon.put("SE9",400000.0);
        bon.put("SE16",290000.0);
        bon.put("SE17",540000.0);

        distributeBonus(totBon, bon,"Sales");
    }
}
