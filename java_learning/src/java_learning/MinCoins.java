package java_learning;
import java.util.Arrays;
public class MinCoins {
	public static int minCoins(int[] coins,int amount) {
		int n = coins.length;
		Arrays.sort(coins);
		int result = 0;
		for(int i = n-1;i>=0;i--) {
			if(amount>=coins[i]) {
				int count = (amount/coins[i]);
				result += count;
				
				amount -= count*coins[i];
				
			}
			if(amount==0) {
				break;
			}
		}
		return result;
	}
	public static void main(String[]args) {
		int coins[] = {5,2,10,1};
		int amount = 39;
		System.out.println(minCoins(coins , amount));
	}
	

}
