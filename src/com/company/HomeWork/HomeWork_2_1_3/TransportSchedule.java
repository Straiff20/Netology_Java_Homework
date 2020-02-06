package com.company.HomeWork.HomeWork_2_1_3;

class TransportSchedule implements Comparable<TransportSchedule> {
    String bus;
    String time;
    String number;

    public TransportSchedule(String bus, String time, String number) {
        this.bus = bus;
        this.time = time;
        this.number = number;
    }

    // Функция для разбития времени в секунды
    int timeToSeconds() {
        String[] c = time.split(":");  //  делаем введенное значение time массивом и разделяем его ":"
        int hours = Integer.parseInt(c[0]);
        int minutes = Integer.parseInt(c[1]);
        return hours * 60 * 60 + minutes * 60;  //  возвращаем все в секундах
    }

    @Override
    public int compareTo(TransportSchedule other) {  //  сравниваем введенное время с другими введенными значениями времени
        return timeToSeconds() - other.timeToSeconds();
    }

    @Override
    public String toString() {
        return String.format("%s\t%s\t%s", time, bus, number);  //  везвращаем стриг с табуляцией(?) и значения
    }
}