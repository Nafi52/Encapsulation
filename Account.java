class Account {
    private int account_number;
    private double account_balance;
    Account(){
        account_number=0;
        account_balance=0;
    }
   /* Account(int account_number,double account_balance){
        this.account_balance=account_balance;
        this.account_number=account_number;
    }*/
    public void setInput(int account_number,double account_balance){   //setters
        this.account_balance=account_balance;
        this.account_number=account_number;
    }
    /*Account(int account_balance){
        this.account_balance=account_balance;
    }
    Account(double account_number){
        this.account_number=account_number;
    }*/

    public void show_Data() {   //getters
        System.out.println("Account Number  : "+account_number);
        System.out.println("Account Balance : "+account_balance);
    }

    public void deposit(double update_value) {
        if (update_value < 0) {
            System.out.println("Negative value shuoldn,t deposit"); 
        }   
        else
            account_balance = account_balance + update_value;
    }
}