import java.util.Arrays;

/**
 * Multitasking
 */
public class Multitasking {

    // get distinct number of tasks
    public int getNumofTasks(int tasks[]) {
        // sort the array
        Arrays.sort(tasks);
        int count = 1;
        // count unique tasks
        for (int i = 0; i < tasks.length - 1; i++) {
            if (tasks[i] != tasks[i + 1]) {
                count++;
            }
        }
        return count;
    }

    // generate find time algo
    public int findTime(int tasks[], int cd) {
        int i = 0;
        // get num of tasks
        int taskNum = getNumofTasks(tasks.clone());
        // init the cd timer
        int cdTimer[] = new int[taskNum];
        int time = 0;
        // iterate thorugh tasks
        while (i < tasks.length) {
            // reduce all cd
            for (int j = 0; j < cdTimer.length; j++) {
                if (cdTimer[j] >= 0) {
                    cdTimer[j]--;
                }
            }
            // check if the task is on cd
            if (cdTimer[tasks[i] - 1] >= 0) {
                time++;
            } else {
                cdTimer[tasks[i] - 1] = cd;
                time++;
                i++;
            }
            // System.out.println(time + " " + Arrays.toString(cdTimer));
        }
        return time;
    }

    public static void main(String[] args) {
        Multitasking m1 = new Multitasking();
        int tasks[] = { 1, 1, 2, 1, 2, 2, 2 };
        System.out.println(m1.findTime(tasks, 2));
    }
}
