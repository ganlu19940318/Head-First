public class Test {
    public static void main(String[] args) {
        Service1 service1 = new Service1();
        Service2 service2 = new Service2();
        Service3 service3 = new Service3();

        ServiceFade serviceFade = new ServiceFade(service1, service2, service3);

        serviceFade.start();
        serviceFade.stop();

    }
}
