package Combination;

/**
 * @author: ZCJ
 * @Date: 2019-10-30 16:37
 * @Description:代理
 * 代理类在控制模块的方法再套一层
 */
public class SpaceShipDelegation {
    private String name;
    private SpaceShipControls controls = new SpaceShipControls();

    public SpaceShipDelegation(String name) {
        this.name = name;
    }

    public void back(int velocity) {
        controls.back(velocity);
    }

    public void down(int velocity) {
        controls.down(velocity);
    }

    public void up(int velocity) {
        controls.up(velocity);
    }

    public void right(int velocity) {
        controls.right(velocity);
    }

    public void forward(int velocity) {
        controls.forward(velocity);
    }

    public void turboBoost(int velocity) {
        controls.turboBoost(velocity);
    }

    public void left(int velocity) {
        controls.left(velocity);
    }

    public static void main(String[] args) {
        new SpaceShipDelegation("NSEA Protector");
    }
}

class SpaceShipControls {
    void up(int velocity) {
    }

    void down(int velocity) {
    }

    void left(int velocity) {
    }

    void right(int velocity) {
    }

    void forward(int velocity) {
    }

    void back(int velocity) {
    }

    void turboBoost(int velocity) {
    }
}