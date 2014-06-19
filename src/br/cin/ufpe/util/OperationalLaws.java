package br.cin.ufpe.util;

/**
 * This class contains static methods for a formulae-based 
 * evaluation on the laws for Operational Analysis, in the 
 * context of Systems' Performance Evaluation
 * 
 * @see http://amzn.com/0471503363
 */
public class OperationalLaws {

    public static Double utilization1(Double resourceThroughput, Double resourceServiceTime) {
        return resourceThroughput * resourceServiceTime;
    }

    public static Double utilization2(Double systemThroughput, Double resourceServiceDemand) {
        return systemThroughput * resourceServiceDemand;
    }

    public static Double forcedFlow(Double systemThroughput, Double resourceVisits) {
        return systemThroughput * resourceVisits;
    }

    public static Double little(Double resourceThroughput, Double resourceResponseTime) {
        return resourceThroughput * resourceResponseTime;
    }

    public static Double generalResponseTime(int times, Double resourceResponseTime, Double resourceVisits) {
        Double generalResponseTime = 0D;
        for (int i = 1; i <= times; i++)
            generalResponseTime += (resourceResponseTime * resourceVisits);
        return generalResponseTime;
    }

    public static Double interactiveResponseTime(Double jobs, Double systemThroughput, Double thinkTime) {
        return (jobs / systemThroughput) - thinkTime;
    }

    public static Double asymptoticBounds() {
        return null;
    }
}
