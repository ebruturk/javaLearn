package j26_Abstract.abstract01;

public abstract class Honda {//abs. p.parent class
    public abstract void  motor();//abs method ->body siz implement zorunlu
void sunroof(){
    System.out.println("Honda concrete meth call edildi");

}
abstract void koltuk();//abs method ->body siz implement zorunlu
    abstract void kapı();//abs method ->body siz implement zorunlu
    //abs.classta concrete variable tanımlanır mı?->evet
    String name="Ahmet Bey";
    // abs. class'da abs variable tanımlanır mı? -> nayır nolamazzz
// abstract String str="javvaNUR";
// final void finalMethod();// final body'siz meth tanımlanamaz
// final abstract void finalMethod();// final abs meth tanımlanamaz
// private abstract  void privateMeth();// abs. meth acmo kısıtlanamaz
// static  void gunesMetg();//static  concrete meth body'siz olamaz
// static abstract void gunesMetg();// abs. meth static olamaz
// Honda h1 = new Honda();//abs Class obj uretemez->melek dogurmaz









}

