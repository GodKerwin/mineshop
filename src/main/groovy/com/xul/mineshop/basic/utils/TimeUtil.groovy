package com.xul.mineshop.basic.utils

class TimeUtil {

    static def getTimeStamp() {
        Calendar calendar = Calendar.getInstance()
        int time = (calendar.getTimeInMillis() / 1000) as int
        return time
    }

    static def getDayFirstTime(int day = 0) {
        Calendar calendar = Calendar.getInstance()
        calendar.add(Calendar.DAY_OF_YEAR, day)
        calendar.set(Calendar.HOUR_OF_DAY, 0)
        calendar.set(Calendar.MINUTE, 0)
        calendar.set(Calendar.SECOND, 0)
        int time = (calendar.getTimeInMillis() / 1000) as int
        return time
    }

    static def getDayLastTime(int day = 0) {
        Calendar calendar = Calendar.getInstance()
        calendar.add(Calendar.DAY_OF_YEAR, day)
        calendar.set(Calendar.HOUR_OF_DAY, 23)
        calendar.set(Calendar.MINUTE, 59)
        calendar.set(Calendar.SECOND, 59)
        int time = (calendar.getTimeInMillis() / 1000) as int
        return time
    }

    static def getWeekFirstTime() {
        Calendar calendar = Calendar.getInstance()
        calendar.setFirstDayOfWeek(Calendar.MONDAY)
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY)
        calendar.set(Calendar.HOUR_OF_DAY, 0)
        calendar.set(Calendar.MINUTE, 0)
        calendar.set(Calendar.SECOND, 0)
        int time = (calendar.getTimeInMillis() / 1000) as int
        return time
    }

    static def getWeekLastTime() {
        Calendar calendar = Calendar.getInstance()
        calendar.setFirstDayOfWeek(Calendar.MONDAY)
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY)
        calendar.set(Calendar.HOUR_OF_DAY, 23)
        calendar.set(Calendar.MINUTE, 59)
        calendar.set(Calendar.SECOND, 59)
        int time = (calendar.getTimeInMillis() / 1000) as int
        return time
    }

    static def getMonthFirstTime(int month = 0) {
        Calendar calendar = Calendar.getInstance()
        calendar.add(Calendar.MONTH, month)
        calendar.set(Calendar.DAY_OF_MONTH, 1)
        calendar.set(Calendar.HOUR_OF_DAY, 0)
        calendar.set(Calendar.MINUTE, 0)
        calendar.set(Calendar.SECOND, 0)
        int time = (calendar.getTimeInMillis() / 1000) as int
        return time
    }

    static def getMonthLastTime(int month = 0) {
        Calendar calendar = Calendar.getInstance()
        calendar.add(Calendar.MONTH, month + 1)
        calendar.set(Calendar.DAY_OF_MONTH, 1)
        calendar.set(Calendar.HOUR_OF_DAY, 0)
        calendar.set(Calendar.MINUTE, 0)
        calendar.set(Calendar.SECOND, 0)
        int time = (calendar.getTimeInMillis() / 1000) - 1 as int
        return time
    }

    static def getYearFirstTime() {
        Calendar calendar = Calendar.getInstance()
        calendar.set(Calendar.DAY_OF_YEAR, 1)
        calendar.set(Calendar.HOUR_OF_DAY, 0)
        calendar.set(Calendar.MINUTE, 0)
        calendar.set(Calendar.SECOND, 0)
        int time = (calendar.getTimeInMillis() / 1000) as int
        return time
    }

    static def getYearLastTime() {
        Calendar calendar = Calendar.getInstance()
        calendar.add(Calendar.YEAR, 1)
        calendar.set(Calendar.DAY_OF_YEAR, 1)
        calendar.set(Calendar.HOUR_OF_DAY, 0)
        calendar.set(Calendar.MINUTE, 0)
        calendar.set(Calendar.SECOND, 0)
        int time = (calendar.getTimeInMillis() / 1000) - 1 as int
        return time
    }

    static void main(def args) {
        println "当前时间： " + getTimeStamp()
        println "昨天开始时间： " + getDayFirstTime(-1)
        println "昨天结束时间： " + getDayLastTime(-1)
        println "当天开始时间： " + getDayFirstTime()
        println "当天结束时间： " + getDayLastTime()
        println "本周开始时间： " + getWeekFirstTime()
        println "本周结束时间： " + getWeekLastTime()
        println "上月开始时间： " + getMonthFirstTime(-1)
        println "上月结束时间： " + getMonthLastTime(-1)
        println "本月开始时间： " + getMonthFirstTime()
        println "本月结束时间： " + getMonthLastTime()
        println "本年开始时间： " + getYearFirstTime()
        println "本年结束时间： " + getYearLastTime()
    }
}
