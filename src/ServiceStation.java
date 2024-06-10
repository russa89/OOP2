public class ServiceStation {
    public void check(Vehicle vehicle) {
        System.out.println("Обслуживается " + vehicle.getModelName());
        vehicle.service();
    }

}
