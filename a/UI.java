public class UI {
    public String[] options = null;


    void setOptions(String[] optionList){
        options = optionList;
    }

    void view(){
        if(options == null || options.length == 0){
            System.out.println("warning: no options");
        }
        else{
            for(int i = 0; i < options.length; i++){
                System.out.println("[" + (i + 1) + "] " + options[i]);
            }
        }
    }


}
