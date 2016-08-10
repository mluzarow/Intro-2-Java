import javax.swing.JOptionPane;
public class CardGameMainCS2 {
	public static void main (String [] args) {
		CardGameCS2 Player = new CardGameCS2();
		CardGameCS2 Dealer = new CardGameCS2();
		String Cardz = "";
		int LoopForever = 0;
		int Again = 0;
		int PrintC = 0;
		int PlayerValue = 0, TotalPlayerValue = 0;
		int DealerValue = 0, TotalDealerValue = 0;
		//Loops the program forever, unless the user chooses "exit".
		while(LoopForever == 0) {
			String Which = JOptionPane.showInputDialog("What do you wish to do?" + "\n" + "1) Bet" + "\n" + "2) Add Money" + "\n" + "3) See Total Money" + "\n" + "4) Exit");
			double W = 0;
			
			//Gets how much the user wishes to bet.
			if (Which.equals("1")) {
				String What = JOptionPane.showInputDialog("How much do you wish to bet?");
				W = Double.parseDouble(What);
				
				//Gets the user's total money and checks if the bet is possible.
				double CheckTotal = Player.getCash();
				if (CheckTotal < W) {
					JOptionPane.showMessageDialog(null, "You don't have enough money.  You can't bet that amount." + "\n" + "If you still wish to bet that amount, you must add money to your account.", "Not Enough Money.", JOptionPane.ERROR_MESSAGE);
				} else if (CheckTotal >= W) {
					
					//"Again" is set to a default 3 every time a round is played. This gives the player at least 3 cards each round.
					Again = 3;
					
					//Gives the player 3 cards, adds each card value to their total hand value, prints out each card's value and suit.
					while (Again >= 1) {
						PlayerValue = Player.DealNumber();
						TotalPlayerValue += PlayerValue;
						Cardz = Player.State(PlayerValue);
						System.out.println(Cardz);
						DealerValue = Dealer.DealNumber();
						TotalDealerValue += DealerValue;
						Again--;
					}
					
					//Upon finishing with the 3 default cards, the user is asked if he wishes to choose another card.
					while (Again == 0) {
						int Another = JOptionPane.showConfirmDialog(null, "Would you like to get another card?", "Deal Again?", JOptionPane.YES_NO_OPTION);
						if (Another == 0) {
							PlayerValue = Player.DealNumber();
							TotalPlayerValue += PlayerValue;
							Cardz = Player.State(PlayerValue);
							System.out.println(Cardz);
							DealerValue = Dealer.DealNumber();
							TotalDealerValue += DealerValue;
						} else if (Another == 1) {
							if (TotalDealerValue > TotalPlayerValue) {
								System.out.println("My " + TotalDealerValue + " beats your " + TotalPlayerValue);
								W = (W * -1);
								Player.addCash(W);
							} else if (TotalPlayerValue > TotalDealerValue) {
								System.out.println("Your " + TotalDealerValue + " beats my " + TotalPlayerValue);
								W = (W * 2);
								Player.addCash(W);
							}
							Again++;
						}
					}
					
				}
			} else if (Which.equals("2")) {
				String What = JOptionPane.showInputDialog("How much money do you wish to add?");
				W = Double.parseDouble(What);
				Player.addCash(W);
			} else if (Which.equals("3")) {
				System.out.println(Player.toString());
			} else if (Which.equals("4")) {
				System.exit(0);
			}
		}
	}
}