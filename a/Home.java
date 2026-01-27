public class Home extends UI{

    public Home(){ //gets called when initializing a Home class (Home home = new Home();)
        this.options = new String[]{"Add balance", "History", "Goal", "Logout"}; // "this" refers to itself extending UI; the options[] at UI gets overridden.
    }
}

