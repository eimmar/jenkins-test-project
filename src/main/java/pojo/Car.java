package pojo;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "car", namespace = "default")
public class Car {
    @NotNull
    private String brand;

    @XmlElement(name = "brand", namespace = "default")
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
