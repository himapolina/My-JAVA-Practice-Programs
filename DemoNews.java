interface Newspaper{
    public void news();
}
class Magazine implements Newspaper{
    public void news(){
        System.out.println("Title of Magazine: Vogue India");
        System.out.println("ISBN of Magazine: 1234");
        System.out.println("Editor of Magazine: Hima");
    }
}
class Brochure implements Newspaper{
    public void news(){
        System.out.println("Title of Brochure: Dominos");
        System.out.println("Year of publishing of Brochure: 2021");
        System.out.println("Page number of Brochure: 12");
    }
}
class DemoNews{
    public static void main(String[] arg){
        Magazine m = new Magazine();
        Brochure b = new Brochure();
        m.news();
        b.news();
    }
}