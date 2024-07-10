package PrototypeDP.CMS;

import java.util.List;

public interface Document extends Cloneable {
    Document clone();

    void setTitle(String title);

    void setContent(String content);

    String getTitle();

    String getContent();
    void addSection(Section section);
    List<Section> getSections();
}
