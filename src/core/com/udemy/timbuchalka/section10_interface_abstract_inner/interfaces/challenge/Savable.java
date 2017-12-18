package core.com.udemy.timbuchalka.section10_interface_abstract_inner.interfaces.challenge;

import java.util.Map;

public interface Savable {
    Map save();

    Savable load(Map map);
}
