package Composite;

/**
 * Created by son on 2018-10-03.
 * Composition을 위한 인터페이스로 구성된다.
 */
abstract public class Component {
    private String name;

    public Component(final String name) {
        this.name = name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
