public class ServiceFade {
    Service1 service1;
    Service2 service2;
    Service3 service3;

    public ServiceFade(Service1 service1, Service2 service2, Service3 service3) {
        this.service1 = service1;
        this.service2 = service2;
        this.service3 = service3;
    }

    public void start(){
        System.out.println("Service begin to start!");
        service1.start1();
        service1.start2();
        service2.start1();
        service3.start1();
    }

    public void stop(){
        System.out.println("Service begin to stop!");
        service1.stop1();
        service1.stop2();
        service2.stop1();
        service3.stop1();
    }
}
