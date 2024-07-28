public class A072_위인철_20240208 {

    public int dayOfYear(String date) {
        int month = 10 * date.charAt(5) + date.charAt(6) - 528, day = 10 * date.charAt(8) + date.charAt(9) - 528;

        // fast return if we don't need leap years
        if (month <= 2)
            return day + (1 - month >>> 27);

        // months between
        day += 30 * month + month / 2 - 32 + ((month - 1 >> 3) & month);

        // leap year
        int yearPart = 10 * date.charAt(2) + date.charAt(3) - 528;
        if (yearPart == 0)
            yearPart = 10 * date.charAt(0) + date.charAt(1) - 528;

        return day + (((yearPart & 3) - 1) >>> 31);
    }

}
