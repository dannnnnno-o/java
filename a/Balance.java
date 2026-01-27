public class Balance {
    int balance;


    void print(){
        System.out.println(balance);
    }
    void add(int x){
        balance += x;
    }

    void spend(int x){
        balance -= x;
    }
}
