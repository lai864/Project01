package package_07;

public class MyThread extends Thread{

    public MyThread(){}

    public MyThread(String name){
        super(name);
    }

        @Override
                public void run(){
            for (int i = 0; i < 100; i++) {
                System.out.println(getName()+":"+i);
            }
        }

}

/*public Thread() {
        init(null, null, "Thread-" + nextThreadNum(), 0);
    }*/
