package io.github.vitalikulsha.telegrambot.util;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class TextMessageUtil {
    public static final String HELP = "Чат-бот поможет тебе заказать билет на маршрутку.";
    public static final String SETTINGS = "В будущем здесь будет что-то полезное.";

    Pattern pattern = Pattern.compile("");

    public static List<String> routeList = new ArrayList<>() {
        {
            this.add("Минск-Могилев");
            this.add("Могилев-Минск");
        }
    };

    public static List<String> dateList = new ArrayList<>() {
        {
            this.add("08-03-2021");
            this.add("09-03-2021");
            this.add("10-03-2021");
            this.add("11-03-2021");
        }
    };

    public static List<String> timesMinsk = new ArrayList<>() {
        {
            this.add("10:20");
            this.add("12:30");
            this.add("14:40");
            this.add("16:50");
        }
    };

    public static List<String> timesMogilev = new ArrayList<>() {
        {
            this.add("08:10");
            this.add("11:15");
            this.add("13:10");
            this.add("18:40");
        }
    };

}
