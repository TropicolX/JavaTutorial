import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Random;
import java.util.concurrent.Semaphore;

public class DiningPhilosophers {
    private static final Random random = new Random();
    public static final int NUM_PHILOSOPHERS = 5;
    private final Lock[] chopsticks = new ReentrantLock[NUM_PHILOSOPHERS];
    private final Semaphore diningSemaphore = new Semaphore(NUM_PHILOSOPHERS - 1);

    private enum Action {
        THINKING("Thinking"),
        PICKED_LEFT_CHOPSTICK("Picked up left chopstick"),
        PICKED_RIGHT_CHOPSTICK("Picked up right chopstick"),
        EATING("Eating"),
        PUT_DOWN_LEFT_CHOPSTICK("Put down left chopstick"),
        PUT_DOWN_RIGHT_CHOPSTICK("Put down right chopstick");

        private final String actionString;

        Action(String actionString) {
            this.actionString = actionString;
        }

        @Override
        public String toString() {
            return actionString;
        }
    }

    public DiningPhilosophers() {
        for (int i = 0; i < NUM_PHILOSOPHERS; i++) {
            chopsticks[i] = new ReentrantLock();
        }
    }

     public void dine(int philosopherId) throws InterruptedException {
        Lock leftChopstick = chopsticks[philosopherId];
        Lock rightChopstick = chopsticks[(philosopherId + 1) % NUM_PHILOSOPHERS];

        while (true) {
            // Attempt to acquire dining semaphore
            diningSemaphore.acquire();

                // Attempt to pick up chopsticks
                if (leftChopstick.tryLock()) {
                    try {
                        log(philosopherId, Action.PICKED_LEFT_CHOPSTICK);
                        if (rightChopstick.tryLock()) {
                            try {
                                log(philosopherId, Action.PICKED_RIGHT_CHOPSTICK);
                                // Both chopsticks acquired, eat
                                eat(philosopherId);
                            } finally {
                                rightChopstick.unlock();
                                log(philosopherId, Action.PUT_DOWN_RIGHT_CHOPSTICK);
                            }
                        }
                    } finally {
                    // Release the left chopstick
                    leftChopstick.unlock();
                    log(philosopherId, Action.PUT_DOWN_LEFT_CHOPSTICK);
                    }

                    // Release dining semaphore
                    diningSemaphore.release();
                }

            think(philosopherId);
        }
}


    private void log(int philosopherId, Action action) {
        System.out.println("Philosopher " + philosopherId + ": " + action);
    }

    private void eat(int philosopherId) throws InterruptedException {
        log(philosopherId, Action.EATING);
        // Simulate eating time
        Thread.sleep(random.nextInt(1000));
    }

    private void think(int philosopherId) throws InterruptedException {
        log(philosopherId, Action.THINKING);
        // Simulate thinking time
        Thread.sleep(random.nextInt(1000));
    }
}