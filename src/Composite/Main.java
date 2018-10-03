package Composite;

/**
 * Created by son on 2018-10-03.
 */
public class Main {
    /**
     * Composite 패턴
     * 객체들의 관계를 트리 구조로 구성하여 부분-전체 계층을 표현하는 패턴으로, 사용자가 단일 객체와 복합 객체 모두 동일하게 다루도록 한다.
     * https://ko.wikipedia.org
     *
     * 예제에서 사용한 파일 시스템 트리 구조
     * root/
     *     home/
     *         image2
     *         rerewww/
     *             image3
     *     image1
     * @param args
     */
    public static void main(String[] args) {
        LocalFolder root = new LocalFolder("root");
        LocalFolder home = new LocalFolder("home");
        LocalFolder rerewww = new LocalFolder("rerewww");

        Leaf image1 = new Leaf("image1");
        Leaf image2 = new Leaf("image2");
        Leaf image3 = new Leaf("image3");

        root.addComponent(home);
        root.addComponent(image1);
        home.addComponent(rerewww);
        home.addComponent(image2);
        rerewww.addComponent(image3);

        show(root);
    }

    public static void show(final Component component) {
        if (component instanceof LocalFolder) {
            for (Component componentList : ((LocalFolder) component).getChildren()) {
                if (componentList instanceof Leaf) {
                    System.out.println(String.format("%s 폴더에 %s파일이 존재합니다.", component.getName(), componentList.getName()));
                } else if (componentList instanceof LocalFolder) {
                    System.out.println(String.format("%s 폴더에 | %s 폴더가 존재합니다.", component.getName(), componentList.getName()));
                    show(componentList);
                }
            }
        }
    }
}
