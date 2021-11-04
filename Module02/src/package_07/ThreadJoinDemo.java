package package_07;
/*void join() 等待该线程死亡。之后再执行其他线程  */
public class ThreadJoinDemo {
    public static void main(String[] args) {
        ThreadJoin tj1 = new ThreadJoin("康熙");
        ThreadJoin tj2 = new ThreadJoin("四阿哥");
        ThreadJoin tj3 = new ThreadJoin("八阿哥");


        tj1.start();
        try {
            tj1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tj2.start();
        tj3.start();
    }
}
