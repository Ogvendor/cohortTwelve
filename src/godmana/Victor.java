package godmana;

public class Victor {
    private String name;
    private String head;
    private String body;

    public Victor(String name, String head, String body) {
        this.name = name;
        this.head = head;
        this.body = body;
    }

    public Victor(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
