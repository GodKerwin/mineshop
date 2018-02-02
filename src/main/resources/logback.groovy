import ch.qos.logback.classic.encoder.PatternLayoutEncoder

import static ch.qos.logback.classic.Level.DEBUG
import static ch.qos.logback.classic.Level.WARN

def commonPattern = "%d{yyyy-MM-dd HH:mm:ss.SSS} [%thread] %-5level %logger{36} - %X{GlobalTrackId} - %msg%n"
def logFilePrefix = 'D:/workspace/mine/logs/mine'
def logFileSuffix = '.log'

appender("FILE", RollingFileAppender) {
    file = "${logFilePrefix}${logFileSuffix}"
    rollingPolicy(TimeBasedRollingPolicy) {
        fileNamePattern = "${logFilePrefix}.%d{yyyy-MM-dd}${logFileSuffix}"
        maxHistory = 30
    }
    encoder(PatternLayoutEncoder) {
        pattern = commonPattern
    }
}

appender("STDOUT", ConsoleAppender) {
    encoder(PatternLayoutEncoder) {
        pattern = commonPattern
    }
}

logger("org", WARN)
logger("net", WARN)

root(DEBUG, ["STDOUT", "FILE"])