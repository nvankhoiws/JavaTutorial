package core.self.org.o7planning.java.basic.enum_tutorial;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 2/12/20186:00 PM.
 */
public enum Color {

    RED("red") {
        @Override
        public String getHexCode() {
            return "#ff0000";
        }
    },
    GREEN("green") {
        @Override
        public String getHexCode() {
            return "#00ff00";
        }
    },
    BLUE("blue") {
        @Override
        public String getHexCode() {
            return "#0000ff";
        }
    };

    private String name;

    Color(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String getHexCode();

}
