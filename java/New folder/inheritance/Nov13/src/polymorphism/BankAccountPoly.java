package polymorphism;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

class BankAccount {
	int accNo;
	double balance;

	 int getAccNo() {
		return accNo;
	}

	 void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	 double getBalance() {
		return balance;
	}

	 void setBalance(double balance) {
		this.balance = balance;
	}

	void deposit() {
		System.out.println("Money is added ");
	}

//	void withdraw() {
//		System.out.println("Money is withdrawn ");
//	}
	
	void withdraw(int b) {
		if(balance>b) {
			System.out.println(this.balance+"amount withfram successfully ");
		}
	}

	void checkBalance() {
		System.out.println("Low Balance");
	}

	BankAccount() {
		this.accNo = 1244;
		this.balance = 100;
	} // default constructor ends

	BankAccount(int a, double b) {
		this.accNo = a;
		this.balance = b;
	} // parameterized constructor ends

	void display() {
		System.out.println("\n");
		System.out.println("Account number is : " + this.accNo);
		System.out.println("Balance : " + this.balance);
	} // display function ends
} // class Account ends


class SavingAccount extends BankAccount {
	double interestRate;

	 double getInterestRate() {
		return interestRate;
	}

	 void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	 void withdraw(int a) {
		 if(balance>a) {
			 System.out.println(this.balance+" withdrawed ");
			 
		 }
		 else {
			 System.out.println("insufient");
		 }
		 
	 }

	void addInterest() {
		System.out.println("Interest added to balance");
	} // addInterest function ends

	SavingAccount() {
		super();
		this.interestRate = 13;
	} // default constructor ends

	SavingAccount(int a, double b, double i) {
		super(a, b);
		this.interestRate = i;
	} // parameterized constructor ends

	
	void display() {
		super.display();
		System.out.println("Interest Rate : " + this.interestRate);
	} // display function ends
} // class SavingAccount ends

class CurrentAccount extends BankAccount{
	double overDraftLimit;

	 double getOverDraftLimit() {
		return overDraftLimit;
	}

	 void setOverDraftLimit(double overDraftLimit) {
		this.overDraftLimit = overDraftLimit;
	}
	
	void reaquestOverDraft() {
		System.out.println("this is overDraft method ");
	}
	void withdraw(int a) {
		if((balance+overDraftLimit)>a) {
			System.out.println("withdraw successfull ");
		}
		else {
			System.out.println("insuffient balance ");
		}
	}
	CurrentAccount(){
		super();
		this.overDraftLimit=1900000;
	}
	
	CurrentAccount(int a, double b,double o){
		super(a,b);
		this.overDraftLimit=o;
		
	}
	void display() {
		super.display();
		System.out.println("Over draft limit is :"+this.overDraftLimit);
	}
}
class SalaryAcc extends BankAccount{

	void withdraw(int a) {
        LocalDate d = LocalDate.of(2025, 9, 13);
        LocalDate d1 = LocalDate.now();

        long monthsBetween = ChronoUnit.MONTHS.between(d, d1);

        if (monthsBetween < 2 && a < balance) {
            System.out.println("Withdraw up to " + this.balance);
            System.out.println(monthsBetween);
        } else {
            System.out.println("Sorry");
        }
}
}

public class BankAccountPoly {
	public static void main(String[] args) {
//		SavingAccount s1 = new SavingAccount();
//		s1.display();
//
//		SavingAccount s2 = new SavingAccount(2024, 50000, 7.5);
//		s2.display();
//		
//		CurrentAccount a=new CurrentAccount();
//		a.display();
		
		
		BankAccount b;
		b=new BankAccount();
		b.withdraw(90);
		
		b=new SavingAccount();
		b.withdraw(20);
		
		b=new CurrentAccount();
		b.withdraw(20000);
		
		b=new SalaryAcc();
		b.withdraw(20);
		
	}
} // class Account_inheritance ends


