package bean;

/**
 * @author : Yasiru Dahanayaka
 * @name : Spring Testing
 * @date : 5/25/2022
 * @month : 05
 * @year : 2022
 * @since : 0.1.0
 **/
public class Boy {

    Girl girl = new Girl();//Property Injection

    public void chattingWithGirl(){
        girl.chat();
    }

    public Boy(Girl girl) { //Constructor Injection
        this.girl = girl;
    }

    public void setGirl(Girl girl){ //Setter Method Injection
        this.girl = girl;
    }
}
