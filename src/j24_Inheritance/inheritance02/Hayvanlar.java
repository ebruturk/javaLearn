package j24_Inheritance.inheritance02;

public class Hayvanlar {//Grand-parent class
    int a;//default int type ins veriable
    int m = 3;//initial int type inst.variable

    public Hayvanlar() {
        System.out.println("hayvanlar class p siz const call edildi");
    }

    public Hayvanlar(int x) {


        System.out.println("hayvanlar class p li const call edildi");
    }
    public void mA(){
        System.out.println("mA->Hayvanlar class meth call edildi");
    }
    public void mM(){
        System.out.println("mM->Hayvanlar class meth call edildi");
}
  /*
 Ahan da trick köşesinde böğün:inherit edilmiş herhangi bir obj methodları  cons. göre call edilir
 method araştırmaya cons. Class'dan başlanıp parentlere gidilir
 */

}