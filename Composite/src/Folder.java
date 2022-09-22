import java.util.ArrayList;
import java.util.List;

public class Folder extends Component{
    public Folder(String name) {
        super(name);
    }

    List<Component> children = new ArrayList<>();

    public boolean addComponent(Component component) {
        // ArrayList 의 add 메소드는 boolean 값 반환
        return children.add(component);
    }

    public boolean removeComponent(Component component) {
        return children.remove(component);
    }

    public List<Component> getChildren() {
        return children;
    }

    public void setChildren(List<Component> children) {
        this.children = children;
    }
}
