package concurrent.threadpool;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

/**
 * @author DeveloperZJQ
 * @since 2022-5-11
 */
public class ThreadSchedulePoolTest {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime time = now.withHour(18).withMinute(0).withSecond(0).withNano(0).with(DayOfWeek.THURSDAY);

        if (now.compareTo(time) > 0) {
            time = time.plusWeeks(1);
        }
        System.out.println("time" + time);
    }
}
