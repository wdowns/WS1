/**
 * Write a java program that computes the angle between the hour hand and the 
 * minute hand on a traditional analog clock. Angles should be measured
 * counterclockwise from hour to minute hand. The result should be normalised
 * so that it is between 0 and 359 (inclusively). For instance, the angles at
 * 3:00 and 9:00 hours should be 90 degrees and 270 degrees respectively.
 * A minute has 60 seconds. The proportion of seconds divided by 60.0 will give 
 * the corresponding minutes. 
 * An hour has 60 minutes. The minutes divided by 60.0 gives the corresponding 
 * parts of an hour.
 * In 360 degrees we have 12 hours. This means 30 degrees per hour for the hours hand.
 * In 360 degrees we have 60 minutes, which is 6 degrees per minute for the minute hand.
 * 
 * @author William Downs
 * @version 08/10/15
 */
public class WS1E5 {
    /**
     * Will compute the angle between the hour and minute values that are given.
     * 
     * @param hours
     * @param minutes
     * @return
     */
    public static int angle(int hours, int minutes) {
        hours = hours % 12;

        double angleOfMinuteHand = 6 * minutes;// Angle of minute hand moves 6 degrees per minute.
        // The hour hand also moves when the minute hand moves
        double angleOfHourHand = 30 * (hours + (minutes / 60.0));// Angle of hour hand moves 30 degrees per hour.
        int angle = (int) ((Math.round(angleOfHourHand - angleOfMinuteHand) + 360) % 360); 
        // The angle computed is the hours hand angle minus the minute hand angle rounded. Since this may have any integer 
        // value between -360 and +360, we add 360 and take the remainder by division by 360 as result.
        return angle;
    }

    public static void main(String[] args) {

        int hours;
        int minutes;

        hours = 9;
        minutes = 0;
        System.out.println("At " + hours + " hours and " + minutes
                + " minutes, the angle between the clock hands is " + angle(hours, minutes)
                + " degrees");

        hours = 3;
        minutes = 0;
        System.out.println("At " + hours + " hours and " + minutes
                + " minutes, the angle between the clock hands is " + angle(hours, minutes)
                + " degrees");

        hours = 18;
        minutes = 0;
        System.out.println("At " + hours + " hours and " + minutes
                + " minutes, the angle between the clock hands is " + angle(hours, minutes)
                + " degrees");

        hours = 1;
        minutes = 0;
        System.out.println("At " + hours + " hours and " + minutes
                + " minutes, the angle between the clock hands is " + angle(hours, minutes)
                + " degrees");

        hours = 2;
        minutes = 30;
        System.out.println("At " + hours + " hours and " + minutes
                + " minutes, the angle between the clock hands is " + angle(hours, minutes)
                + " degrees");

        hours = 4;
        minutes = 41;
        System.out.println("At " + hours + " hours and " + minutes
                + " minutes, the angle between the clock hands is " + angle(hours, minutes)
                + " degrees");
    }
}