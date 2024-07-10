package PrototypeDP.CMS;

import java.util.ArrayList;
import java.util.List;

public class Article implements Document{
    private String title;
    private String content;
    private List<Section> sections;
    public Article(){
        this.sections = new ArrayList<>();
    }
    @Override
    public Document clone() {
        Article clone = null;
        try{
            clone = (Article) super.clone();
            clone.sections = new ArrayList<>();
            for(Section section : sections){
                clone.sections.add(section.clone());
            }
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public void addSection(Section section) {
        sections.add(section);
    }

    @Override
    public List<Section> getSections() {
        return sections;
    }
}
