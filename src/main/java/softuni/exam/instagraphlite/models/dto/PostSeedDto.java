package softuni.exam.instagraphlite.models.dto;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class PostSeedDto {

    @XmlElement
    private String caption;
    @XmlElement(name = "user")
    private UserUsernameDto user;
    @XmlElement(name = "picture")
    private PicturePathDto picture;


    @Size(min = 21)
    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    @NotNull
    public UserUsernameDto getUser() {
        return user;
    }

    public void setUser(UserUsernameDto user) {
        this.user = user;
    }


    @NotNull
    public PicturePathDto getPicture() {
        return picture;
    }

    public void setPicture(PicturePathDto picture) {
        this.picture = picture;
    }
}
