/**
 * Пример класса, который будет использоваться в качестве бина
 * При использовании конфигурации в XML не нужны никакие аннотации - всё описывается в конфигурационном файле
 */
public class CustomBean {
    private String name;

    public CustomBean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}