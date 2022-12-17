package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        //Use arbitrary values for parameters which are not mentioned
       super(name, 0, 0, 0, isManual, null, 0);
    }
   
   public int getCurrentDirection(){
      return super.getCurrentDirection();
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
        newSpeed= super.getCurrentSpeed()+rate;
        if(newSpeed == 0) {
            //Stop the car, set gear as 1
            this.stop();
            this.changeGear(1);
        }
        if(newSpeed>0 && newSpeed<=50){
            this.changeGear(1);
        }
        if(newSpeed>50 && newSpeed<=100){
            this.changeGear(2);
        }
        if(newSpeed>100 && newSpeed<=150){
            this.changeGear(3);
        }
        if(newSpeed>150 && newSpeed<=200){
            this.changeGear(4);
        }
        if(newSpeed>200 && newSpeed<=250){
            this.changeGear(5);
        }
        //for all other cases, change the gear accordingly

        if(newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}
