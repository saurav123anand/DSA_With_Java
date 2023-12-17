import java.util.List;

class Vehicle{
    int vehicleNumber;
    Vehicle(int vehicleNumber){
        this.vehicleNumber=vehicleNumber;
    }
}
interface  IVehicleTrackingService{
    void registerVehicle(int vehicleNumber);
    Vehicle getVehicleInfo(int vehicleNumber);
    boolean polledVehicleInfo(int vehicleNumber,long distanceTraveledInKm,long epochTime);
    List<Long> fineHistory(int vehicleNumber,int k);
}
//class VehicleTrackingService implements IVehicleTrackingService{
//
//}
public class Test3 {

}
