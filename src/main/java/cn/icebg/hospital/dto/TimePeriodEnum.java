package cn.icebg.hospital.dto;

import lombok.Getter;

/**
 * @author icebg  clj9509@163.com
 * @date 2020/4/12
 */

@Getter
public enum TimePeriodEnum {

    /**
     * 上午就诊时间段
     * 1： 9点半~10点，2： 10点~10点半，3： 10点半~11点，4： 11点~11点半，
     * 5: 11点半~12点
     */
    AM(1, 1, 5),

    /**
     * 下午就诊时间段
     * 6： 2点半~3点，7： 3点~3点半，8： 3点半~4点，
     * 9： 4点~4点半，10： 4点半~5点，11： 5点~5点半，12：5点半~6点
     * 13：6点~6点半，14：6点半~7点
     */
    PM(2, 6, 14);


    private Integer time;

    private Integer start;

    private Integer end;

    TimePeriodEnum(Integer time, Integer start, Integer end) {
        this.time = time;
        this.start = start;
        this.end = end;
    }
}
