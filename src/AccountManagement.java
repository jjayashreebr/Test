
public class AccountManagement {
	 static int money=100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		balanceCheck();
		moneyDeposit(200);
		moneyWithdraw(50);
		balanceCheck();

	}
	
	static void balanceCheck(){
		System.out.println("Money avaialable "+money);
	}
	
	static void moneyDeposit(int deposit){
		money =money+deposit;
	}
	static  void moneyWithdraw(int withdraw){
    	money=money-withdraw;
    }
	


}
