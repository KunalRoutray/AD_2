package assignment6;

import java.util.Arrays;
import java.util.Comparator;

class ass_6_q2 {
    static class Interval {
        int start, end;

        Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static int intervalScheduling(Interval[] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(i -> i.end));
        int count = 0, lastEnd = -1;

        for (Interval interval : intervals) {
            if (interval.start >= lastEnd) {
                count++;
                lastEnd = interval.end;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Interval[] intervals = {
            new Interval(1, 3),
            new Interval(2, 5),
            new Interval(4, 7),
            new Interval(6, 9),
            new Interval(8, 10)
        };

        System.out.println("Max non-overlapping intervals: " + intervalScheduling(intervals));
    }
}
