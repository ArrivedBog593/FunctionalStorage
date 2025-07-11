package com.buuz135.functionalstorage.util;

import java.text.DecimalFormat;

public class NumberUtils {

    private static final DecimalFormat formatterWithUnits = new DecimalFormat("####0.#");
    private static final DecimalFormat blankFormatter = new DecimalFormat();

    public static String getFormattedNumber(int number) {
        return blankFormatter.format(number);
    }

    public static String getFormattedFluid(int number) {
        return blankFormatter.format(number) + "mb";
    }

    public static String getFormatedBigNumber(int number) {
        if (number >= 1000000000) { //BILLION
            float numb = number / 1000000000F;
            return formatterWithUnits.format(numb) + "B";
        } else if (number >= 1000000) { //MILLION
            float numb = number / 1000000F;
            if (number > 100000000) numb = Math.round(numb);
            return formatterWithUnits.format(numb) + "M";
        } else if (number >= 1000) { //THOUSANDS
            float numb = number / 1000F;
            if (number > 100000) numb = Math.round(numb);
            return formatterWithUnits.format(numb) + "K";
        }
        return String.valueOf(number);
    }

    public static String getFormatedFluidBigNumber(int number) {
        if (number < 1000) return String.valueOf(number) + " mB";
        if (number >= 1000000000) { //BILLION
            float numb = number / 1000000000F;
            return formatterWithUnits.format(numb) + "M B";
        } else if (number >= 1000000) { //MILLION
            float numb = number / 1000000F;
            if (number > 100000000) numb = Math.round(numb);
            return formatterWithUnits.format(numb) + "K B";
        } else if (number >= 1000) { //THOUSANDS
            float numb = number / 1000F;
            if (number > 100000) numb = Math.round(numb);
            return formatterWithUnits.format(numb) + " B";
        }
        return String.valueOf(number) + " B";
    }
}

