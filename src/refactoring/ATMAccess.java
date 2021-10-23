package refactoring;

public class ATMAccess {

	private ATMCardState cardState;

	private void setState(ATMCardState cardState) {

		this.cardState = cardState;

	}

	public ATMAccess() {

		// Create type safe assignment

		setState(ATMCardState.CARD_ENTERED);

	}

	public String getState() {

		// REPLACED return state;

		return cardState.toString();

	}

	// 1. Encapsulation is used

	public void verifyCard(int cardNumber) {

		if (getState().equals(ATMCardState.CARD_ENTERED.toString())) {

			if (cardNumber == ATMCardState.CARD_NUMBER) {

				// Create type safe assignment

				setState(ATMCardState.VALID_CARD);

			} else {
				setState(ATMCardState.DENIED);
			}
		}

	}

	public void verifyPIN(int pinNumber) {

		if (getState().equals(ATMCardState.VALID_CARD.toString())) {

			if (pinNumber == ATMCardState.PIN_NUMBER) {

				// Create type safe assignment

				setState(ATMCardState.VALID_PIN);

			} else {
				setState(ATMCardState.DENIED);
			}
		}

	}

	public void verifyWithdrawalAmount(double withdrawalRequest) {

		if (getState().equals(ATMCardState.VALID_PIN.toString())) {

			if (withdrawalRequest <= ATMCardState.CARD_BALANCE) {

				// Create type safe assignment

				setState(ATMCardState.VALID_CASH_REQUEST);

			} else {
				setState(ATMCardState.DENIED);
			}
		}

	}

	public static void main(String[] args) {

		ATMAccess user = new ATMAccess();

		System.out.println(user.getState());

		user.verifyCard(123456789);

		System.out.println(user.getState());

		user.verifyPIN(1234);

		System.out.println(user.getState());

		user.verifyWithdrawalAmount(1000);

		System.out.println(user.getState());

	}

}
