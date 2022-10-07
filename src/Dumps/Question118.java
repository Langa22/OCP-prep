package Dumps;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class Question118 {
    public static void main(String[] args) throws InterruptedException {
        Instant loginTime=Instant.now();
        Thread.sleep(1000);;

        Instant logoutTime=Instant.now();

        loginTime=loginTime.truncatedTo(ChronoUnit.MINUTES);
        logoutTime=logoutTime.truncatedTo(ChronoUnit.MINUTES);
        if(logoutTime.isAfter(loginTime))
            System.out.println("Logged out at:"+logoutTime);
        else
            System.out.println("Can't logout");
    }
}
