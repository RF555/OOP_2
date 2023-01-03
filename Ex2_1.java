import java.util.Random;

public class Ex2_1 {
    /**
     * Random number generator
     */
    static Random generator;

    /**
     * Create n new txt files with random number of lines.
     *
     * @param n     int representing number of txt files.
     * @param seed  The initial seed of the pseudorandom numbers generator.
     * @param bound The exclusive bound of the pseudorandom numbers generated.
     * @return An array of paths for the created files.
     */
    public static String[] createTextFiles(int n, int seed, int bound) {
        generator = new Random(seed);


    }


    /**
     * Count lines of all files (not using Threads).
     *
     * @param fileNames A String array of file paths.
     * @return Total number of lines of all files.
     */
    public static int getNumOfLines(String[] fileNames) {

    }


    /**
     * Count lines of all files (using Threads).
     * Using FilesThread class.
     *
     * @param fileNames A String array of file paths.
     * @return Total number of lines of all files.
     */
    public int getNumOfLinesThreads(String[] fileNames) {

    }


    /**
     * Count lines of all files (using ThreadPool).
     *
     * @param fileNames A String array of file paths.
     * @return Total number of lines of all files.
     */
    public int getNumOfLinesThreadPool(String[] fileNames) {

    }


}
