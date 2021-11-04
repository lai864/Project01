package package_07;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SellTicket implements Runnable {
    private static int ticket = 100;
    public Object obj= new Object();
    private int x = 0;
    private Lock lock = new ReentrantLock();




    @Override
    public void run() {
        while (true) {
            try{
                lock.lock();
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":" + "卖出了第" + ticket + "张票");
                    ticket--;

                }
            }finally {
                lock.unlock();
            }

                }
    }



   /* @Override
    public void run() {
        while (true) {
            if (x % 2 == 0) {
                synchronized (SellTicket.class) {
                    if (ticket > 0) {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() + ":" + "卖出了第" + ticket + "张票");
                        ticket--;

                    }
                }
            } else {
                SellTickets();
            }
            x++;

        }
    }

    */



  /*  private static  synchronized void SellTickets() {
        if (ticket > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ":" + "卖出了第" + ticket + "张票");
            ticket--;

        }
    }

   */

   /* private void SellTickets() {
        synchronized (obj) {
            if (ticket > 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + ":" + "卖出了第" + ticket + "张票");
                ticket--;

            }
        }
    }

    */

  /*  private synchronized void  SellTickets() {
        if (ticket > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ":" + "卖出了第" + ticket + "张票");
            ticket--;

        }
    }

   */
}
