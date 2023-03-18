package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        //Use arbitrary values for parameters which are not mentioned
    }
    public F1(){

    }

    public void accelerate(int rate){
        int newSpeed = 0; //set the value of new speed by using currentSpeed and rate
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */
        Vehicle v1=new Vehicle();
       newSpeed= v1.getCurrentSpeed()+rate;
        F1 obj=new F1();
        if(newSpeed == 0) {
            //Stop the car, set gear as 1
            v1.stop();
            obj.changeGear(1);
        }
        else if(newSpeed>0 && newSpeed<51){
            obj.changeGear(1);
        } else if (newSpeed>50 && newSpeed<101) {
            obj.changeGear(2);
        } else if (newSpeed>100 && newSpeed<151) {
            obj.changeGear(3);
        }else if (newSpeed>150 && newSpeed<201) {
            obj.changeGear(4);
        }
        else if (newSpeed>200 && newSpeed<251) {
            obj.changeGear(5);
        }
        else if (newSpeed>250 ) {
            obj.changeGear(6);
        }
        //for all other cases, change the gear accordingly

        if(newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}
