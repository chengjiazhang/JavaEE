package Combination;

/**
 * @author: ZCJ
 * @Date: 2019-10-30 15:38
 * @Description:组合
 */
public class SprinklerSystem {
    private String valve1,valve2,valve3;
    private WaterSource source=new WaterSource();
    private int i;
    private float f;

    @Override
    public String toString() {
        return "SprinklerSystem{" +
                "valve1='" + valve1 + '\'' +
                ", valve2='" + valve2 + '\'' +
                ", valve3='" + valve3 + '\'' +
                ", source=" + source +
                ", i=" + i +
                ", f=" + f +
                '}';
    }

    public static void main(String[] args) {
        SprinklerSystem sprinklers=new SprinklerSystem();
        System.out.print(sprinklers);
    }
}
class WaterSource{
    private String s;
    WaterSource(){
        System.out.println("WaterSource");
        s="Constructed";
    }
    @Override
    public String toString(){
        return s;
    }
}
