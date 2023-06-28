package datetools;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.WeekFields;

public class DateTools {
    public static void main(String[] args) {
//        String startDateStr = "2023-05-21";
//        String endDateStr = "2023-05-29";
//        // 将日期字符串转换为 LocalDate 对象
//        LocalDate startDate = LocalDate.parse(startDateStr);
//        LocalDate endDate = LocalDate.parse(endDateStr);
//        // 将起始日期和结束日期分别调整到所在周的周一和周日
//        LocalDate startOfWeek = startDate.with(TemporalAdjusters.previousOrSame(LocalDate.of(1900, 1, 1).getDayOfWeek())).with(TemporalAdjusters.next(DayOfWeek.MONDAY));
//        LocalDate endOfWeek = endDate.with(TemporalAdjusters.previousOrSame(LocalDate.of(1900, 1, 1).getDayOfWeek())).with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
//        // 计算相差的周数
//        long weeksBetween = ChronoUnit.WEEKS.between(startOfWeek, endOfWeek);
//        System.out.println(weeksBetween); // 输出相差的自然周数
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.get(WeekFields.ISO.weekOfYear()));
    }
}
