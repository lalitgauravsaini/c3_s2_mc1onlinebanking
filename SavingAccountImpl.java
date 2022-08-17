import com.SavingAccount.SavingAccount;

public class SavingAccountImpl {
        public static void main(String[] args){
            SavingAccount savingAccount=new SavingAccount("lalit");
            savingAccount.generateAccountNumber();
            final SavingAccount account = savingAccount;
        }
}
