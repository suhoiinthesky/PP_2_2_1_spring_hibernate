package hiber.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Table
@Component
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String model;
    @Column
    private Integer series;

    public Car() {}

    public Car(String model, Integer series) {
        this.model = model;
        this.series = series;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getSeries() {
        return series;
    }

    public void setSeries(Integer series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car " +
               "id = " + id +
               ", model = '" + model + '\'' +
               ", series = " + series;
    }
}
