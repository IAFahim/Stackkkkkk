package Stackk;

public class Bank {
    private  Account[] accounts;
    private int numOfAccount;
    private Object accountNumber;

    public Bank(int size) {
        accounts = new Account[size];
        numOfAccount=0;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public int getNumOfAccount() {
        return numOfAccount;
    }
    public void addAccount(Account account){
         accounts[numOfAccount++]=account;
    }
    public void printAccountInfo(int accountNumber){
        for (int i =0;i<accounts.length;i++)
            if(accounts[i].getAccountNumber()==accountNumber){
                System.out.println(accounts[i]);
            }
    }
}
