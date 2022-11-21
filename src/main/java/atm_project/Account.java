package atm_project;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {

    private int accountNumber;
    private int pinNumber;

    private double checkingBalance; //vadesiz hesap bakiyesi
    private double savingBalance;   //vadeli hesap bakiyesi

    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    Scanner input = new Scanner(System.in);

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    //para cekme==> paraCektiktenSonraKalan
    private double calculateCheckingBalanceAfterWithdraw(double amount){
        checkingBalance= checkingBalance-amount;
        return checkingBalance;
    }

    //para yatirma==>para yatirdiktan sonra kalan bakiyeyi hesapla
    private double calculateCheckingBalanceAfterDeposit(double amount){
        checkingBalance=checkingBalance+amount;
        return checkingBalance;
    }

    //para cekme ==>saving hesabindan para cektikten sonra kalan miktar
    private double calculateSavingBalanceAfterWithdraw(double amount){
        savingBalance=savingBalance-amount;
        return savingBalance;
    }

    //para yatirma ==> saving hesabina para yatirdiktan sonra geri kalan bakiyeyi hesaplayiniz.
    private double calculateSavingBalanceAfterDeposit(double amount){
        savingBalance=savingBalance+amount;
        return savingBalance;
    }


    //Musteri ile para cekmek icin etkilesime gecelim
    public void getCheckingWithdraw(){
        displayCurrentAmount(checkingBalance);

        System.out.println("Cekmek istediginiz miktari giriniz:");
        double amount = input.nextDouble();

        if(amount<=0){
            System.out.println("Sifir veya eksi rakamlar gecersizdir!");
            getCheckingWithdraw();//recursive method; methodu tekrardan cagirma.
        }else if(amount<=checkingBalance){
            calculateCheckingBalanceAfterWithdraw(amount);
            displayCurrentAmount(checkingBalance);
        }else{
            System.out.println("Yetersiz Bakiye!");
        }
    }



    //musteri ile para yatirmak icin etkilesime gecelim
    public void getCheckingDepozit(){
        displayCurrentAmount(checkingBalance);
        System.out.println("Yatirmak istediginiz miktari giriniz");
        double amount = input.nextDouble();

        if(amount<=0){
            System.out.println("Sifir veya eksi rakamlar gecersizdir!");
            getCheckingDepozit();
        }else{
            calculateCheckingBalanceAfterDeposit(amount);
            System.out.println();
            displayCurrentAmount(checkingBalance);
        }
    }



    //musteri ile para cekmesi icin etkilesime gecelim.
    public void getSavingWithdraw(){
        displayCurrentAmount(savingBalance);
        System.out.println("Cekmek istediginiz miktari giriniz:");
        double amount = input.nextDouble();

        if(amount<=0){
            System.out.println("Sifir veya eksi rakamlar gecersizdir!");
            getSavingWithdraw();//recursive method; methodu tekrardan cagirma.
        }else if(amount<=savingBalance){
            calculateSavingBalanceAfterWithdraw(amount);
            displayCurrentAmount(savingBalance);
        }else{
            System.out.println("Yetersiz Bakiye!");
        }
    }



    //musteri ile para yatirmasi icin etkilesime gecelim
    public void getSavingDepozit(){
        displayCurrentAmount(savingBalance);
        System.out.println("Yatirmak istediginiz miktari giriniz");
        double amount = input.nextDouble();

        if(amount<=0){
            System.out.println("Sifir veya eksi rakamlar gecersizdir!");
            getSavingDepozit();
        }else{
            calculateSavingBalanceAfterDeposit(amount);
            System.out.println();
            displayCurrentAmount(checkingBalance);
        }
    }




    //son bakiyeyi goster
    public void displayCurrentAmount(double balance){
        System.out.println("Checking hesabinizda bulunan bakiye: "+moneyFormat.format(balance));
    }
}
