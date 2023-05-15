package org.example.problem3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Problem3 {
    public static void main(String... args){
        Runnable[] jobs = {new CountJob(), new MultiplyJob()};

        ExecutorService service = Executors.newFixedThreadPool(2);
        for(Runnable job : jobs){
            service.submit(job);
        }

        service.shutdown();
    }
}
