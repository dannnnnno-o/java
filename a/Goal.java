public class Goal{
    String name;
    String target_date;
    int target_amount;
    int invested_amount;

    void invest(int investment){
        invested_amount += investment;
    }
}