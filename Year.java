import java.time.YearMonth;
import java.util.*;

public class Year {
    public static void main(String[] args){
        int NowYear = YearMonth.now().getYear();
        int now = NowYear;
        boolean leap = false;

        if (now % 4 == 0){
            if(now % 100 == 0){
                if(now % 4 == 0){
                    leap = true;
                }else {
                    leap = false;
                }
            }else{
                leap = true;
            }
        }else{
            leap = false;
        }
        if(leap){
            System.out.println(now + " is a leap year");
        }else{
            System.out.println(now + " is not a leap year");
        }
    }
}
