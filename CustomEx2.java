class InvalidAmountException extends Exception {

    public InvalidAmountException(String message) {
        super(message);
    }
}

class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class Atm {

    public static void withdraw(double balance, double amount) {

        try {

            if (amount <= 0) {
                throw new InvalidAmountException("Amount must be greater than 0.");
            }

            if (amount > balance) {
                throw new InsufficientBalanceException("Insufficient balance.");
            }

            balance -= amount;

            System.out.println("Withdrawal successful.");
            System.out.println("Remaining balance: " + balance);

        } catch (InvalidAmountException e) {

            System.out.println("Invalid Amount Error: " + e.getMessage());

        } catch (InsufficientBalanceException e) {

            System.out.println("Balance Error: " + e.getMessage());
        }
    }
}

public class CustomEx2 {

    public static void main(String[] args) {

        Atm.withdraw(1000, 250);

    }
}