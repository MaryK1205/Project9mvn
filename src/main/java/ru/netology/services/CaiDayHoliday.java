package ru.netology.services;
public class CaiDayHoliday {
    public int calculate(int income, int expenses, int threshold) {
        int thresholdCur = 0; /*текущие накопления*/
        int count = 0; /*количество месяцев отдыха*/
        for (int i = 0; i < 12; i++) {
            if (thresholdCur <= threshold) {
                thresholdCur = thresholdCur + income - expenses;
            } else {
                thresholdCur = (thresholdCur - expenses) / 3;
                count++;
            }
        }
        return count;
    }
}
