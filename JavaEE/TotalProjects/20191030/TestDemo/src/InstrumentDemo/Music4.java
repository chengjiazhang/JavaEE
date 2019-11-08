package InstrumentDemo;

import com.sun.tools.javap.TypeAnnotationWriter;

/**
 * @author: ZCJ
 * @Date: 2019-10-30 20:05
 * @Description:
 */
public class Music4 {
    static void tune(Instrument i){

    }
static void tuneAll(Instrument[] e){
    for (Instrument i:e) {
        tune(i);
    }
}
    public static void main(String[] args) {
      Instrument[] orchestra={
              new Wind(),
              new Percussion(),
              new Stringed(),
              new Brass(),
              new Woodwind()
      } ;
      tuneAll(orchestra);
    }
}


abstract class Instrument{
    private int i;
    public abstract void play(TypeAnnotationWriter.Note n);
    public String what(){
        return "Insrument";
    }
    public abstract void adjust();
}
class Wind extends Instrument{
    @Override
    public void play(TypeAnnotationWriter.Note n){
        System.out.println("wind.play"+n);

    }

    @Override
    public String what() {
        return "Wind";
    }

    @Override
    public void adjust() {

    }
}
class Percussion extends Instrument{
    @Override
    public void play(TypeAnnotationWriter.Note n){
        System.out.println("Percussion.play"+n);
    }
    @Override
    public String what(){
        return "Percussion";
    }

    @Override
    public void adjust() {

    }
}

class Stringed extends Instrument{
    @Override
    public void play(TypeAnnotationWriter.Note n) {
        System.out.println("Stringed.play()"+n);
    }

    @Override
    public void adjust() {

    }

    @Override
    public String what() {
        return "Stringed";
    }
}

class Brass extends Wind{
    @Override
    public void play(TypeAnnotationWriter.Note n) {
        System.out.println("Brass.play()"+n);
    }

    @Override
    public void adjust() {
        System.out.println("Brass.adjust()");
    }
}

class Woodwind extends Wind{
    @Override
    public void play(TypeAnnotationWriter.Note n){
        System.out.println("Woodwind.play()"+n);
    }

    @Override
    public String what() {
        return "Woodwind";
    }
}
