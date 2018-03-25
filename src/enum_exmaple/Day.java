package enum_exmaple;

public class Day {
    Week week;
    public Day(Week week){
        this.week = week;
    }
    public void whichDay(){
        switch(week){
            case Monday:
                System.out.println("Monday");
                break;
            case Tuesday:
                System.out.println("Tuesday");
                break;
            case Wednesday:
                System.out.println("Wednesday");
                break;
            case Thursday:
                System.out.println("Thurs");
                break;
            case Friday:
                System.out.println("Fri");
                break;
            case Saturday:
                System.out.println("Sat");
                break;
            case Sunday:
                System.out.println("Sun");
                break;
            default:
                System.out.println("no more days..fix it");
                break;
        }
    }
}
