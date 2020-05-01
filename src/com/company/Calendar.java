package com.company;

import java.util.ArrayList;
import java.util.List;

public class Calendar {

    private List<Holiday> holidays = new ArrayList<Holiday>();
    private char[] map = new char[366]; //здесь для каждого дня w - раб день, h - вых

    //Изначально все рабочие дни, даже выходные не делал
    public Calendar () {
        for (int i = 0; i < 366; i++) {

            map[i] = 'w';
        }
    }

    public class Holiday {
        private String name;
        private int date_strt; //Решил не заморачиваться с датами, сделал интами
        private int date_end;
        public Holiday(String s, int d1, int d2) {
            this.name = s;
            this.date_end = d2;
            this.date_strt = d1;
        }
    }

    public void AddHoliday(String s, int d1, int d2) {
        Holiday h = new Holiday(s, d1, d2);
        holidays.add(h);
        for (int i = d1; i < d2; i++) {

            map[i] = 'h';
        }
    }

    public void Show() {
        System.out.println(map);
    }

    public void IsHol(int i) { //Новый метод - выходной ли день?
        try {
            System.out.println(map[i]);
        } catch (IndexOutOfBoundsException  e1) {
            System.out.println("Wrong year!");
        }
    }

}
