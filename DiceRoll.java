public class DiceRoll {

	public static void main(String[] args) {
		
		int rolls = (int) (Math.random()*91)+10;  // generating a random number between 10 and 100
		int d1 = 0, d2 = 0, d3 = 0, d4 = 0, d5 = 0, d6 = 0;
		
		for (int i = 0; i < rolls; i++) {
			
			int diceNumber = (int) (Math.random()*6)+1;
			
			switch(diceNumber) {
			case 1 : d1++;
			break;
			case 2 : d2++;
			break;
			case 3 : d3++;
			break;
			case 4 : d4++;
			break;
			case 5 : d5++;
			break;
			case 6 : d6++;
			break;
			}
		}
		System.out.println("Dice rolls made: " + rolls);
		System.out.println("1 thrown: "+ d1);
		System.out.println("2 thrown: "+ d2);
		System.out.println("3 thrown: "+ d3);
		System.out.println("4 thrown: "+ d4);
		System.out.println("5 thrown: "+ d5);
		System.out.println("6 thrown: "+ d6);
	}
}
