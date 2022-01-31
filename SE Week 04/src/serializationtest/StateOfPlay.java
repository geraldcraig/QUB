
package serializationtest;

public class StateOfPlay implements java.io.Serializable{

	private static final long serialVersionUID = 5500318284308149898L;  
	
    private int money;
    private String player;

    public void setMoney(int moneyToSet){
        money = moneyToSet;
    }

    public int getMoney(){
        return money;
    }

   public void setPlayer(String playerToSet){
        player = playerToSet;
   }

   public String getPlayer(){
        return player;
   }

}
