package PrototypeDP.CMS;

public class Section implements Cloneable{
    private String heading;
    private String text;
    public Section(String heading, String text){
        this.heading = heading;
        this.text = text;
    }
    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public Section clone(){
        try{
            return (Section) super.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
            return null;
        }
    }
}
