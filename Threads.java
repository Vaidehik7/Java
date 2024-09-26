class MyThread extends Thread{
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println("Thread A: "+ i);

            try{
                Thread.sleep(1000);
            }

            catch (Exception e){
                System.out.println("Exception has occured"+e);

            }
        }
    }
}

class MyNewThread extends Thread{
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println("Thread B: "+ i);

            try{
                Thread.sleep(1000);
            }

            catch (Exception e)      {
                System.out.println("Exception has occured"+e);
                
            }
        }
    }
}

class Threads{
    public static void main(String[] args) {
        MyThread a = new MyThread();
        MyNewThread b = new MyNewThread();
        a.start();
        b.start();
    }
}