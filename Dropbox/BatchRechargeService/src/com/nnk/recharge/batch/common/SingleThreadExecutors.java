package com.nnk.recharge.batch.common;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * The type Single thread executors.
 */
public class SingleThreadExecutors {

    private static final ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
    private static final ScheduledExecutorService statisticsService = Executors.newSingleThreadScheduledExecutor();

    /**
     * Schedule at fixed rate.
     *
     * @param command      the command
     * @param initialDelay the initial delay
     * @param period       the period
     * @param unit         the unit
     */
    public static void scheduleAtFixedRate(Runnable command, long initialDelay, long period, TimeUnit unit) {
        service.scheduleAtFixedRate(command, initialDelay, period, unit);
    }

    /**
     * Schedule with fixed delay.
     *
     * @param command      the command
     * @param initialDelay the initial delay
     * @param period       the period
     * @param unit         the unit
     */
    public static void scheduleWithFixedDelay(Runnable command, long initialDelay, long period, TimeUnit unit) {
        service.scheduleWithFixedDelay(command, initialDelay, period, unit);
    }

    /**
     * Schedule.
     *
     * @param command the command
     * @param delay   the delay
     * @param unit    the unit
     */
    public static void schedule(Runnable command, long delay, TimeUnit unit) {
        service.schedule(command, delay, unit);

    }

    /**
     * Execute.
     *
     * @param command the command
     */
    public static void execute(Runnable command) {

        service.execute(command);
    }

    /**
     * Execute statistics.
     *
     * @param command the command
     */
    public static void executeStatistics(Runnable command) {

        statisticsService.execute(command);
    }

    /**
     * Shutdown.
     */
    public static void shutdown() {
        service.shutdown();
    }
}
