package presentation;

public class UpdateComponent {
    String field;
    Object value;

    public UpdateComponent(String field,Object value)
    {
        this.field=field;
        this.value=value;
    }

    public Object getValue() {
        return value;
    }

    public String getField() {
        return field;
    }
}
