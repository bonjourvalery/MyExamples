package шаблон_прокси_proxy;

public class Car implements Moveable{
    int speed;

    @Override
    public void speedUp() {
        while (speed < 50) {
            speed++;
        }
    }

    @Override
    public void speedDown() {
        while (speed > 0) {
            speed--;
        }
    }
}
