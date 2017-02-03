# Unit Test
public class{
  drive(){
    start car()
    put seatbelt on()
    put in gear()
    accelerate()
    turn()
    brake()
  }
}
StartCar(){}
PutSeatBeltOn(){}
PutInGear(){}
accelerate(){}
turn(){}
brake(){}

  StartCar(){
    checkSourceOfIgnition()
    if(key)
    put into ignition // imperative
    turn key //imperative
    if(carb)press gas // imperative
    else//
    else pressbutton //imperative
  }
   StartCar(){
     checkSourceOfIgnition()
     if(key) startKeyCar()
     else startFobCar()
   }

   PutSeatBeltOn(){

   }

   putInGear(){
     if(manual) shiftManual()
     else shiftAuto()
   }
   shiftManual(){
     pressClutch();{workClutch(true)}
     movegearShift(  );
     releaseClutch();{workClutch(false)}
   }
   workClutch(boolean press)

 boolean isClutchPress
   workClutch(boolean press){
     if(press)
      isClutchPress true
     else
      isClutchPress false    
   }
   void testWorkClutch(){
     workClutch(true)
     assert(isClutchPressed)
     workClutch(false)
     assert()
   }

   java -ea 
