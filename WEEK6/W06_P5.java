class W06_P5 extends Thread {
    public void run() {
        System.out.println("Thread Executing");
    }

    public static void main(String[] args) {
        W06_P5 t = new W06_P5();
        System.out.println("Default Thread Name: " + t.getName());

// Set new name of thread
t.setName("JavaThread");

// Start the thread
t.start();

System.out.println("Updated Thread Name: " + t.getName());
    }
}