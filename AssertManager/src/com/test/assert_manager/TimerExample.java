package com.test.assert_manager;

import java.awt.List;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
 
public class TimerExample extends TimerTask { 

private ArrayList<Integer> list = new ArrayList<Integer>(); 

@Override 
public void run() {
int random_number = (int)(Math.random() * 10);
int sum = 0;
this.list.add(random_number);

for(int i=0; i < this.list.size(); i++) {
sum = sum + this.list.get(i);
}

if (sum >= 35) {
System.out.println("Sum is " + sum);
this.cancel();
}
}
}
    

