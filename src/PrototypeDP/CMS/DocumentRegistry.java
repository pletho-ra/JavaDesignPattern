package PrototypeDP.CMS;

import java.util.HashMap;
import java.util.Map;

public class DocumentRegistry {
    private Map<String, Document> prototypes = new HashMap<>();

    public void register(String key, Document prototype){
        prototypes.put(key, prototype);
    }

    public Document getRegister(String key){
        Document prototype = prototypes.get(key);
        return (prototype != null) ? prototype.clone() : null;
    }
}
