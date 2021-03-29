package com.ghy.designmode.dependenceInversion;

//public class Driver {
//    //    司机职责就是驾驶汽车
//    public void drive(Benz benz) {
//        benz.run();
//    }
//}
public class Driver implements IDriver{
    //    司机职责就是驾驶汽车
    public void drive(Icar car) {
        car.run();
    }
}
