class Task17{
    public static void main(String[] a){
       int bal = 2500;
       System.out.println("Opening Balance : "+bal);

       int withdraw, deposit, transfer, maintainance, accountBal;

       withdraw = 250;
       deposit = 300;
       transfer = 400;
       deposit += 200;
       maintainance = 180;

       bal = bal + deposit - withdraw - transfer - maintainance;

       System.out.println("Current Balance : "+bal);

    }
}